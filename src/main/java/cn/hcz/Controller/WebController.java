package cn.hcz.Controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mongodb.client.gridfs.model.GridFSFile;
import com.mongodb.gridfs.GridFSDBFile;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@Controller
public class WebController {
	@Autowired
	private GridFsTemplate gridFsTemplate;

	@Autowired
	private GridConfig gridConfig;

	@RequestMapping(value="ftl")
	public String getIndex(Map<String, Object> map){
		map.put("name", "王大锤");
		List<String> list = new ArrayList<String>();
		list.add("dnf");
		list.add("cs");
		return "index";
		
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public Object uploadFile(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file) throws Exception {
		System.out.println("==============进入文件上传");
		Part part = request.getPart("file");
		// 获得提交的文件名
		String fileName = part.getSubmittedFileName();
		// 获得文件输入流
		InputStream ins = part.getInputStream();
		// 获得文件类型
		String contentType = part.getContentType();
		// 将文件存储到mongodb中,mongodb 将会返回这个文件的具体信息
		Object gfs = gridFsTemplate.store(ins, fileName, contentType);
		return gfs.toString();
	}

	@RequestMapping(value = "/downLoadFile")
	public void downLoadFile(String fileId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 查询单个文件
		GridFSFile gridFSFile = gridFsTemplate.findOne(new Query().addCriteria(Criteria.where("_id")));
		GridFsResource fsResource = gridConfig.convertGridFSFile2Resource(gridFSFile);
		GridFSDBFile gfsfile=null;
		if (gridFSFile == null) {
			return ;
		}
		String fileName = gfsfile.getFilename().replace(",", "");
		//处理中文文件名乱码
		if (request.getHeader("User-Agent").toUpperCase().contains("MSIE") ||
				request.getHeader("User-Agent").toUpperCase().contains("TRIDENT")
				|| request.getHeader("User-Agent").toUpperCase().contains("EDGE")) {
			fileName = java.net.URLEncoder.encode(fileName, "UTF-8");
		} else {
			//非IE浏览器的处理：
			fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
		}
		// 通知浏览器进行文件下载
		response.setContentType(gfsfile.getContentType());
		response.setHeader("Content-Disposition", "attachment;filename=\"" + "222.png" + "\"");
		IOUtils.copy(fsResource.getInputStream(),response.getOutputStream());
	}
}

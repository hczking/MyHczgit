/*
package cn.hcz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.InputStream;

@Controller
public class FileController {

   */
/* @Autowired
    private GridFsTemplate gridFsTemplate;

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public Object uploadFile(HttpServletRequest request) throws Exception {
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
    }*//*


    @RequestMapping(value = "/index")
    public  String getIndex(){
        System.out.println(11111);
        return "hello";
    }
}
*/

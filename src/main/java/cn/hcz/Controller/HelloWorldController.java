package cn.hcz.Controller;

import java.util.HashMap;
import java.util.Map;

import cn.hcz.Util.RandomValidateCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("/hello")
public class HelloWorldController {
	@RequestMapping(value = "/index")
	public String getIndex() {
		return "success";
	}

	@RequestMapping(value = "/getMap")
	public Map<String, Object> getIndex1() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("error", "200");
		map.put("errormsg", "王大锤");
		return map;

	}

	@RequestMapping(value = "/getVerify")
	public void getVerify(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("image/jpeg");// 设置相应类型,告诉浏览器输出的内容为图片
			response.setHeader("Pragma", "No-cache");// 设置响应头信息，告诉浏览器不要缓存此内容
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expire", 0);
			RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
			randomValidateCode.getRandcode(request, response);// 输出验证码图片方法
		} catch (Exception e) {

		}
	}
}

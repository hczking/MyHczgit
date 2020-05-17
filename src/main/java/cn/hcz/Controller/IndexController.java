package cn.hcz.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping(value = "/value")
	public String getIndex(Map<String, Object> map) {
		//System.out.println("++++++++++++++");
		//int i=1/0;
		map.put("name", "王大锤");
		List<String> list = new ArrayList<String>();
		list.add("dnf");
		list.add("cs");
		return "index";
	}
}

package cn.hcz.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//全局捕获异常
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)//表示需要拦截的异常
	@ResponseBody
	public Map<String, Object> resultError() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("error", "500");
		map.put("errormsg", "系统错误");
		return map;

	}
}

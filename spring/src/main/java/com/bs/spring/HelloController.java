package com.bs.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	public HelloController() {
		System.out.println("HelloController 생성(^V^)");
	}
	
	//localhost:9090/spring/
	@RequestMapping("/")
	public String mainpage() {
		System.out.println("＊mainpage메소드 실행＊");
		// /WEB-INF/views/index.jsp
		return "index";
	}
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("main");
		return "main";
	}
	
}

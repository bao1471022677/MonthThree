package com.wangguansheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	//页面跳转
	@RequestMapping({"/","index"})
	public String index(){
		return "index";
	}

}

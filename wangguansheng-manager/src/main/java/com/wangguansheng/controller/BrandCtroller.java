package com.wangguansheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 商品管理
 * @author 胡图图
 *
 */
@Controller
@RequestMapping("brand")
public class BrandCtroller {
	
	
	
	//商品列表跳转
	@RequestMapping("list")
	public String listbBrand() {
		return "brand/list";
	}
	
}

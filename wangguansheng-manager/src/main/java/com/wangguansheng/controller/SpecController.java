package com.wangguansheng.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 规格的管理
 * @author 胡图图
 *
 */
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.wanguansheng.pojo.Spec;
import com.wanguansheng.pojo.SpecOption;
import com.wanguansheng.service.SpecService;
@Controller
@RequestMapping("spec")
public class SpecController {
	
	@Reference
	SpecService specService;//商品类型规格
	
	//规格列表跳转
	@RequestMapping("list")
	public String listSpec(Model model,@RequestParam(defaultValue = "1")int pageNum,String name) {
		//得到数据
		PageInfo<Spec> list = specService.list(name, pageNum);
		//放入作用域
		model.addAttribute("info", list);
		
		return "spec/list";
	}
	
	//添加规格
	@RequestMapping("add")
	@ResponseBody
	public int addSpec(Model modelspe,Spec spec) {
		
		//处理 规格 例如 空格
		List<SpecOption> options = spec.getOptions();
		options.removeIf(x->{return x.getOptionName()==null;});
		//处理后：添加
		int add = specService.add(spec);
		return add;
	}
	
	
}

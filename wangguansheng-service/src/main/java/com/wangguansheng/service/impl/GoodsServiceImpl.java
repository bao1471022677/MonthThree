package com.wangguansheng.service.impl;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wanguansheng.pojo.Brand;
import com.wanguansheng.pojo.Category;
import com.wanguansheng.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	
	
	@Override
	public int addBrand(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateBrand(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteBrand(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public PageInfo<Brand> listBrand(String firstChar, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addCategory(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateCategory(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteCategory(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public PageInfo<Category> listCategory(String firstChar, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> treeCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

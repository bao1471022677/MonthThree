package com.wangguansheng.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangguansheng.dao.SpecDao;
import com.wanguansheng.pojo.Spec;
import com.wanguansheng.pojo.SpecOption;
import com.wanguansheng.service.SpecService;


@Service(interfaceClass = SpecService.class )
public class SpecServiceImpl implements SpecService {

	@Autowired
	SpecDao specDao;
	
	// 类型规格 列表 
	@Override
	public PageInfo<Spec> list(String name, int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, 9);
		List<Spec> list = specDao.list(name);
		PageInfo<Spec> info = new PageInfo<Spec>(list);
		return info;
	}

	//添加
	@Override
	public int add(Spec spec) {
		// TODO Auto-generated method stub
		//添加主表
		int addSpec = specDao.addSpec(spec);
		//得到 添加完主表的id  添加到子表
		List<SpecOption> options = spec.getOptions();
		for (SpecOption specOption : options) {
			//设置主表iD
			specOption.setSpecId(spec.getId());
			//有了主表的ID可以添加子表了
			specDao.addOption(specOption);
			addSpec ++;
		}
		
		// 返回的是影响数据的条数
		return addSpec;
	}
	//修改
	@Override
	public int update(Spec spec) {
		// TODO Auto-generated method stub
		return specDao.updateSpec(spec);
	}
	//删除
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		//删除主表
		int deleteSpec = specDao.deleteSpec(id);
		//删除子表
		int deleteSpecOtions = specDao.deleteSpecOtions(id);
		
		return deleteSpec+deleteSpecOtions;
	}
	//回显
	@Override
	public Spec findById(int id) {
		// TODO Auto-generated method stub
		return specDao.get(id);
	}
	
	@Override
	public int deleteBatch(int[] ids) {
		// TODO Auto-generated method stub
		//删除子表
		int deleteSpecOtionsBatch = specDao.deleteSpecOtionsBatch(ids);
		//删除主表
		int deleteSpecBatch = specDao.deleteSpecBatch(ids);
		
		return deleteSpecOtionsBatch+deleteSpecBatch;
	}
	
	
	
}

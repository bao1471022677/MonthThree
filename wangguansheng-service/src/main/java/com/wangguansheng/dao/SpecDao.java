package com.wangguansheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wanguansheng.pojo.Spec;
import com.wanguansheng.pojo.SpecOption;
/**
 * 类型规格
 * @author 胡图图
 *
 */
public interface SpecDao {
	
	//列表查询
	List<Spec> list(@Param("name")String name);

	int addSpec(Spec spec);

	int addOption(SpecOption specOption);

	int updateSpec(Spec spec);

	int deleteSpecOtions(int id);

	int deleteSpec(int id);

	Spec get(int id);

	int deleteSpecOtionsBatch(int[] ids);

	int deleteSpecBatch(int[] ids);
	
}

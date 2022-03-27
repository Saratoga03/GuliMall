package com.gb.gulimall.product.dao;

import com.gb.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Sara
 * @email _Yuuko_@outlook.com
 * @date 2022-03-27 19:47:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

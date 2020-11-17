package com.windyoffice.windymall.product.dao;

import com.windyoffice.windymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author windyoffice
 * @email 
 * @date 2020-09-09 22:34:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

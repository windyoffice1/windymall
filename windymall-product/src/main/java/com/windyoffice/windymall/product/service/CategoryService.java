package com.windyoffice.windymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.windyoffice.windymall.common.utils.PageUtils;
import com.windyoffice.windymall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author windyoffice
 * @email 
 * @date 2020-09-09 22:34:55
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


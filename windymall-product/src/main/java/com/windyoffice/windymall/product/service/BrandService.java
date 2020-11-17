package com.windyoffice.windymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.windyoffice.windymall.common.utils.PageUtils;
import com.windyoffice.windymall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author windyoffice
 * @email 
 * @date 2020-09-09 22:34:55
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


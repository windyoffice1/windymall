package com.windyoffice.windymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.windyoffice.windymall.common.utils.PageUtils;
import com.windyoffice.windymall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author windyoffice
 * @email 
 * @date 2020-09-09 22:34:55
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.windyoffice.windymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.windyoffice.windymall.common.utils.PageUtils;
import com.windyoffice.windymall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author windyoffice
 * @email 
 * @date 2020-09-09 22:34:55
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


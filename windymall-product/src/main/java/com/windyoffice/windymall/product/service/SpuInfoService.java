package com.windyoffice.windymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.windyoffice.windymall.common.utils.PageUtils;
import com.windyoffice.windymall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author windyoffice
 * @email 
 * @date 2020-09-09 22:34:55
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


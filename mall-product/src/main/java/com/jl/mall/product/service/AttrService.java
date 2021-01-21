package com.jl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jl.common.utils.PageUtils;
import com.jl.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:17:07
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


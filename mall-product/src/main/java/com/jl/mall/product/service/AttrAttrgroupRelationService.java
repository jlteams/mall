package com.jl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jl.common.utils.PageUtils;
import com.jl.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:17:07
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.jl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jl.common.utils.PageUtils;
import com.jl.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:17:07
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


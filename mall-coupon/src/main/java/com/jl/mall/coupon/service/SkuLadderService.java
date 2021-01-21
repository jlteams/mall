package com.jl.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jl.common.utils.PageUtils;
import com.jl.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:31:22
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


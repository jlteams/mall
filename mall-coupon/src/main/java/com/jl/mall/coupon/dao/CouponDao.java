package com.jl.mall.coupon.dao;

import com.jl.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:31:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

package com.jl.mall.order.dao;

import com.jl.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:42:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

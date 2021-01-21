package com.jl.mall.member.dao;

import com.jl.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:37:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

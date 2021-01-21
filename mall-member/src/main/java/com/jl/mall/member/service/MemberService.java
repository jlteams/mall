package com.jl.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jl.common.utils.PageUtils;
import com.jl.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:37:33
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


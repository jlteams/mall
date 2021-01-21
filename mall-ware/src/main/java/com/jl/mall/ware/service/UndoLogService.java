package com.jl.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jl.common.utils.PageUtils;
import com.jl.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenjianle
 * @email 1401584242@qq.com
 * @date 2021-01-20 18:46:29
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


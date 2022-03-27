package com.gb.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gb.common.utils.PageUtils;
import com.gb.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Sara
 * @email _Yuuko_@outlook.com
 * @date 2022-03-27 22:20:59
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


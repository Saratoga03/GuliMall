package com.gb.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gb.common.utils.PageUtils;
import com.gb.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Sara
 * @email _Yuuko_@outlook.com
 * @date 2022-03-27 22:15:14
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


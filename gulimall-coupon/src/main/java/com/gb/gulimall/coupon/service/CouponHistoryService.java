package com.gb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gb.common.utils.PageUtils;
import com.gb.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author Sara
 * @email _Yuuko_@outlook.com
 * @date 2022-03-27 22:08:42
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.gb.gulimall.order.dao;

import com.gb.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Sara
 * @email _Yuuko_@outlook.com
 * @date 2022-03-27 22:17:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

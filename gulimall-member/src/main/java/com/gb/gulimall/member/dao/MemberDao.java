package com.gb.gulimall.member.dao;

import com.gb.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Sara
 * @email _Yuuko_@outlook.com
 * @date 2022-03-27 22:15:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

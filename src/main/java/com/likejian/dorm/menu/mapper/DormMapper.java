package com.likejian.dorm.menu.mapper;

import com.likejian.dorm.menu.domain.DormPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 时间：2018/8/11
 * 作者：李科建
 */

@Mapper
public interface DormMapper {

    @Select("select * from dorm where dorm_id = #{dorm_id}")
    List<DormPojo> selectById(@Param("dorm_id")int dorm_id);
}

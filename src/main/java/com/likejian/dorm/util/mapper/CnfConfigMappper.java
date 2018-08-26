package com.likejian.dorm.util.mapper;


import com.likejian.dorm.util.domain.CnfConfigPojo;
import com.likejian.dorm.util.domain.CnfDictPojo;
import com.likejian.dorm.util.provider.CnfConfigMappperProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * 时间：2018/8/12
 * 作者：李科建
 */
@Mapper
public interface CnfConfigMappper {

    //查询配置信息
    @SelectProvider(type=CnfConfigMappperProvider.class,method = "selectCnfConfigList")
    List<CnfConfigPojo> selectCnfConfigList(@Param("condition")CnfConfigPojo condition);


}

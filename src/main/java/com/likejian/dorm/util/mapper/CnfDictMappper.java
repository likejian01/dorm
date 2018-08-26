package com.likejian.dorm.util.mapper;


import com.likejian.dorm.util.domain.CnfConfigPojo;
import com.likejian.dorm.util.domain.CnfDictPojo;
import com.likejian.dorm.util.provider.CnfConfigMappperProvider;
import com.likejian.dorm.util.provider.CnfDictMappperProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 时间：2018/8/12
 * 作者：李科建
 */
@Mapper
public interface CnfDictMappper {

    //1：查询字典信息
    @SelectProvider(type=CnfDictMappperProvider.class,method = "selectCnfDictList")
    List<CnfDictPojo> selectCnfDictList(@Param("condition")CnfDictPojo condition);


    //2:删除n条信息
    @DeleteProvider(type=CnfDictMappperProvider.class,method = "deleteDictList")
    int deleteDictList(String dict_ids);

    //3:更新1条信息
    @UpdateProvider(type=CnfDictMappperProvider.class,method = "updateDictByid")
    int updateDictByid(@Param("condition")CnfDictPojo condition);




}

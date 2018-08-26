package com.likejian.dorm.util.provider;

import com.likejian.dorm.util.domain.CnfConfigPojo;
import com.likejian.dorm.util.domain.CnfDictPojo;

import java.util.Date;
import java.util.Map;

/**
 * 时间：2018/8/12
 * 作者：李科建
 */
public class CnfConfigMappperProvider {

    public String selectCnfConfigList(CnfConfigPojo condition){
        StringBuffer sb = new StringBuffer();
        sb.append("select * from cnf_config where 1=1 ");
        if (condition != null) {
            Integer cnf_id = condition.getCnf_id();
            if (cnf_id != null) {
                sb.append(" and cnf_id =#{condition.cnf_id} ");
            }
            String cnf_key = condition.getCnf_key();
            if (cnf_key != null) {
                sb.append(" and cnf_key like '%#{condition.cnf_key}%' ");
            }
            String cnf_value = condition.getCnf_value();
            if (cnf_value != null) {
                sb.append(" and cnf_value like '%#{condition.cnf_value}%' ");
            }

            String remark = condition.getRemark();
            if (remark != null) {
                sb.append(" and remark like '%#{condition.remark}%' ");
            }

            Integer enableflag = condition.getEnableflag();
            if (enableflag != null) {
                sb.append(" and enableflag = #{condition.enableflag} ");
            }
            Integer dict_id = condition.getDict_id();
            if (dict_id != null) {
                sb.append(" and dict_id = #{condition.dict_id} ");
            }
            Date createtimefrom = condition.getCreatetimefrom();
            if (createtimefrom != null) {
                sb.append(" and createtime > #{condition.createtimefrom} ");
            }
            Date createtimeto = condition.getCreatetimeto();
            if (createtimefrom != null) {
                sb.append(" and createtime < #{condition.createtimeto} ");
            }
        }
        return sb.toString();
    }
}

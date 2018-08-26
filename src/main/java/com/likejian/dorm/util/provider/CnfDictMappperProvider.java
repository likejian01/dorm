package com.likejian.dorm.util.provider;

import com.likejian.dorm.util.domain.CnfConfigPojo;
import com.likejian.dorm.util.domain.CnfDictPojo;
import org.apache.ibatis.jdbc.SQL;

import java.util.Date;

import static com.alibaba.druid.stat.TableStat.Mode.Update;

/**
 * 时间：2018/8/12
 * 作者：李科建
 */
public class CnfDictMappperProvider {

    public String deleteDictList(String dict_ids){
        StringBuffer sb = new StringBuffer();
        sb.append("delete from cnf_dict where dict_ids in("+dict_ids+")");
        return sb.toString();
    }

    public String selectCnfDictList(CnfDictPojo condition){
        {
            StringBuffer sb = new StringBuffer();
            sb.append("select * from cnf_dict where 1=1 ");
            if (condition != null) {
                Integer dict_id = condition.getDict_id();
                if (dict_id != null) {
                    sb.append(" and dict_id =#{condition.dict_id} ");
                }
                String dict_code = condition.getDict_code();
                if (dict_code != null) {
                    sb.append(" and dict_code like '%#{condition.dict_code}%' ");
                }
                String dict_title = condition.getDict_title();
                if (dict_title != null) {
                    sb.append(" and dict_title like '%#{condition.dict_title}%' ");
                }

                String remark = condition.getRemark();
                if (remark != null) {
                    sb.append(" and remark like '%#{condition.remark}%' ");
                }

                Integer enableflag = condition.getEnableflag();
                if (enableflag != null) {
                    sb.append(" and enableflag = #{condition.enableflag} ");
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
    public String updateDictByid(CnfDictPojo condition){
    /*{
            StringBuffer sb = new StringBuffer();
            sb.append("update cnf_dict set ");
            if (condition != null) {
                Integer dict_id = condition.getDict_id();
                if (dict_id != null) {
                    sb.append(" and dict_id =#{condition.dict_id} ");
                }
                String dict_code = condition.getDict_code();
                if (dict_code != null) {
                    sb.append(" and dict_code like '%#{condition.dict_code}%' ");
                }
                String dict_title = condition.getDict_title();
                if (dict_title != null) {
                    sb.append(" and dict_title like '%#{condition.dict_title}%' ");
                }

                String remark = condition.getRemark();
                if (remark != null) {
                    sb.append(" and remark like '%#{condition.remark}%' ");
                }

                Integer enableflag = condition.getEnableflag();
                if (enableflag != null) {
                    sb.append(" and enableflag = #{condition.enableflag} ");
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
            sb.append("where dict_id =#{condition.dict_id}");
            return sb.toString();
        }*/
        return new SQL(){{
            UPDATE("cnf_dict");
            //条件写法.
            if(condition.getDict_title()!=null){
                SET("dict_title=#{condition.dict_title}");
            }
            if(condition.getDict_code()!=null){
                SET("dict_code=#{condition.dict_code}");
            }
            if(condition.getEnableflag() != null){
                SET("enableflag=#{condition.enableflag}");
            }
            WHERE("dict_id=#{dict_id}");
        }}.toString();
    }

}

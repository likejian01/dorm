package com.likejian.dorm.util.domain;

import java.util.Date;

/**
 * 时间：2018/8/12
 * 作者：李科建
 */
public class CnfConfigPojo {
    private Integer cnf_id;
    private String cnf_key;
    private String cnf_value;
    private Date createtime;

    public Integer getDict_id() {
        return dict_id;
    }

    public void setDict_id(Integer dict_id) {
        this.dict_id = dict_id;
    }

    private String remark;
    private Integer enableflag;
    private Integer dict_id;

    //非表结构字段
    private Date createtimefrom;
    private Date createtimeto;

    public Integer getCnf_id() {
        return cnf_id;
    }

    public Date getCreatetimefrom() {
        return createtimefrom;
    }

    public void setCreatetimefrom(Date createtimefrom) {
        this.createtimefrom = createtimefrom;
    }

    public Date getCreatetimeto() {
        return createtimeto;
    }

    public void setCreatetimeto(Date createtimeto) {
        this.createtimeto = createtimeto;
    }

    public void setCnf_id(Integer cnf_id) {
        this.cnf_id = cnf_id;
    }

    public String getCnf_key() {
        return cnf_key;
    }

    public void setCnf_key(String cnf_key) {
        this.cnf_key = cnf_key;
    }

    public String getCnf_value() {
        return cnf_value;
    }

    public void setCnf_value(String cnf_value) {
        this.cnf_value = cnf_value;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }
}

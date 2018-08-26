package com.likejian.dorm.util.domain;

import java.util.Date;

/**
 * 时间：2018/8/12
 * 作者：李科建
 */
public class CnfDictPojo {
    private Integer dict_id;
    private String dict_code;
    private String dict_title;
    private Integer enableflag;
    private Date createtime;
    private String remark;

    private Date createtimefrom;
    private Date createtimeto;

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

    public Integer getDict_id() {
        return dict_id;
    }

    public void setDict_id(Integer dict_id) {
        this.dict_id = dict_id;
    }

    public String getDict_code() {
        return dict_code;
    }

    public void setDict_code(String dict_code) {
        this.dict_code = dict_code;
    }

    public String getDict_title() {
        return dict_title;
    }

    public void setDict_title(String dict_title) {
        this.dict_title = dict_title;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
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
}

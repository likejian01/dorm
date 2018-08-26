package com.likejian.dorm.menu.domain;

import javax.print.DocFlavor;

/**
 * 时间：2018/8/11
 * 作者：李科建
 */
public class DormPojo {
    private Integer dorm_id;
    private String dorm_code;
    private Integer dorm_sex;
    private Integer dorm_type;
    private Integer dorm_lived_num;
    private Integer dorm_staff_change_flag;
    private Integer dorm_leader_id;

    public Integer getDorm_id() {
        return dorm_id;
    }

    public void setDorm_id(Integer dorm_id) {
        this.dorm_id = dorm_id;
    }

    public String getDorm_code() {
        return dorm_code;
    }

    public void setDorm_code(String dorm_code) {
        this.dorm_code = dorm_code;
    }

    public Integer getDorm_sex() {
        return dorm_sex;
    }

    public void setDorm_sex(Integer dorm_sex) {
        this.dorm_sex = dorm_sex;
    }

    public Integer getDorm_type() {
        return dorm_type;
    }

    public void setDorm_type(Integer dorm_type) {
        this.dorm_type = dorm_type;
    }

    public Integer getDorm_lived_num() {
        return dorm_lived_num;
    }

    public void setDorm_lived_num(Integer dorm_lived_num) {
        this.dorm_lived_num = dorm_lived_num;
    }

    public Integer getDorm_staff_change_flag() {
        return dorm_staff_change_flag;
    }

    public void setDorm_staff_change_flag(Integer dorm_staff_change_flag) {
        this.dorm_staff_change_flag = dorm_staff_change_flag;
    }

    public Integer getDorm_leader_id() {
        return dorm_leader_id;
    }

    public void setDorm_leader_id(Integer dorm_leader_id) {
        this.dorm_leader_id = dorm_leader_id;
    }

    public String getDorm_leader_name() {
        return dorm_leader_name;
    }

    public void setDorm_leader_name(String dorm_leader_name) {
        this.dorm_leader_name = dorm_leader_name;
    }

    private String dorm_leader_name;
}

package com.sysyu.cmis.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("drug_info")
public class Order implements Serializable {

    private String drug_id;
    private String drug_name;
    private String drug_spec;
    private String manufactory;

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getDrug_spec() {
        return drug_spec;
    }

    public void setDrug_spec(String drug_spec) {
        this.drug_spec = drug_spec;
    }

    public String getManufactory() {
        return manufactory;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    @Override
    public String toString() {
        return "drug{" +
                "drug_id=" + drug_id +
                ", drug_name='" + drug_name + '\'' +
                ", drug_spec='" + drug_spec + '\'' +
                ", manufactory=" + manufactory +
                '}';
    }
}

package com.cunhou.service.web.investment.entry;

import java.util.List;

import com.cunhou.service.web.common.BasicBean;

public class OperateInfo extends BasicBean {
    private Integer operateId;

    private String coding;

    private String province;

    private String city;

    private String county;

    private Double operateMoney;
    
    private List<Agent> agentList;
    
    private String status;
    
    private String lock = "0";
    
    private static final long serialVersionUID = 1L;

    public OperateInfo(Integer operateId, String coding, String province, String city, String county, Double operateMoney) {
        this.operateId = operateId;
        this.coding = coding;
        this.province = province;
        this.city = city;
        this.county = county;
        this.operateMoney = operateMoney;
    }

    public OperateInfo() {
        super();
    }

    public Integer getOperateId() {
        return operateId;
    }

    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding == null ? null : coding.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public Double getOperateMoney() {
        return operateMoney;
    }

    public void setOperateMoney(Double operateMoney) {
        this.operateMoney = operateMoney;
    }

    public List<Agent> getAgentList() {
        return agentList;
    }

    public void setAgentList(List<Agent> agentList) {
        this.agentList = agentList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLock() {
        return lock;
    }

    public void setLock(String lock) {
        this.lock = lock;
    }
}
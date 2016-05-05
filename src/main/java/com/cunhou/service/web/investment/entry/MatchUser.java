package com.cunhou.service.web.investment.entry;

import com.cunhou.service.web.common.BasicBean;
import java.util.Date;

public class MatchUser extends BasicBean {
    private Integer userid;

    private String username;

    private String certtype;

    private String certnum;

    private String bankname;

    private String banknumber;

    private String accountorg;

    private String investortype;

    private String sex;

    private String emercontact;

    private String emercontactphone;

    private String address;

    private String province;

    private String city;

    private String phone;

    private String email;

    private String fax;

    private String postcode;

    private String photo;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public MatchUser(Integer userid, String username, String certtype, String certnum, String bankname, String banknumber, String accountorg, String investortype, String sex, String emercontact, String emercontactphone, String address, String province, String city, String phone, String email, String fax, String postcode, String photo, Date createtime) {
        this.userid = userid;
        this.username = username;
        this.certtype = certtype;
        this.certnum = certnum;
        this.bankname = bankname;
        this.banknumber = banknumber;
        this.accountorg = accountorg;
        this.investortype = investortype;
        this.sex = sex;
        this.emercontact = emercontact;
        this.emercontactphone = emercontactphone;
        this.address = address;
        this.province = province;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.fax = fax;
        this.postcode = postcode;
        this.photo = photo;
        this.createtime = createtime;
    }

    public MatchUser() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCerttype() {
        return certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype == null ? null : certtype.trim();
    }

    public String getCertnum() {
        return certnum;
    }

    public void setCertnum(String certnum) {
        this.certnum = certnum == null ? null : certnum.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber == null ? null : banknumber.trim();
    }

    public String getAccountorg() {
        return accountorg;
    }

    public void setAccountorg(String accountorg) {
        this.accountorg = accountorg == null ? null : accountorg.trim();
    }

    public String getInvestortype() {
        return investortype;
    }

    public void setInvestortype(String investortype) {
        this.investortype = investortype == null ? null : investortype.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmercontact() {
        return emercontact;
    }

    public void setEmercontact(String emercontact) {
        this.emercontact = emercontact == null ? null : emercontact.trim();
    }

    public String getEmercontactphone() {
        return emercontactphone;
    }

    public void setEmercontactphone(String emercontactphone) {
        this.emercontactphone = emercontactphone == null ? null : emercontactphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
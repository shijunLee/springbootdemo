package com.lee.springbootdemo.model;

import java.util.Date;

public class UserInfo {
    private Long id;

    private String rolename;

    private String username;

    private String showname;

    private String nickname;

    private Integer channelid;

    private String thridparty;

    private Date registertime;

    private Date lastlogintime;

    private String lastloginip;

    private Long extend1;

    private String extend2;

    private String phonenumber;

    private Integer isagency;

    private Integer isprotect;

    private String headimgurl;

    private String promoter;

    private Date promotetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname == null ? null : showname.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }

    public String getThridparty() {
        return thridparty;
    }

    public void setThridparty(String thridparty) {
        this.thridparty = thridparty == null ? null : thridparty.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public Long getExtend1() {
        return extend1;
    }

    public void setExtend1(Long extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2 == null ? null : extend2.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Integer getIsagency() {
        return isagency;
    }

    public void setIsagency(Integer isagency) {
        this.isagency = isagency;
    }

    public Integer getIsprotect() {
        return isprotect;
    }

    public void setIsprotect(Integer isprotect) {
        this.isprotect = isprotect;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter == null ? null : promoter.trim();
    }

    public Date getPromotetime() {
        return promotetime;
    }

    public void setPromotetime(Date promotetime) {
        this.promotetime = promotetime;
    }
}
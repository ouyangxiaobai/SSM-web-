package com.bs.bean;

public class Liuyan {
    private Integer liuyanId;

    private String liuyanTitle;

    private String liuyanContent;

    private String liuyanDate;

    private String liuyanUser;

    private String recontent;

    public Integer getLiuyanId() {
        return liuyanId;
    }

    public void setLiuyanId(Integer liuyanId) {
        this.liuyanId = liuyanId;
    }

    public String getLiuyanTitle() {
        return liuyanTitle;
    }

    public void setLiuyanTitle(String liuyanTitle) {
        this.liuyanTitle = liuyanTitle == null ? null : liuyanTitle.trim();
    }

    public String getLiuyanContent() {
        return liuyanContent;
    }

    public void setLiuyanContent(String liuyanContent) {
        this.liuyanContent = liuyanContent == null ? null : liuyanContent.trim();
    }

    public String getLiuyanDate() {
        return liuyanDate;
    }

    public void setLiuyanDate(String liuyanDate) {
        this.liuyanDate = liuyanDate == null ? null : liuyanDate.trim();
    }

    public String getLiuyanUser() {
        return liuyanUser;
    }

    public void setLiuyanUser(String liuyanUser) {
        this.liuyanUser = liuyanUser == null ? null : liuyanUser.trim();
    }

    public String getRecontent() {
        return recontent;
    }

    public void setRecontent(String recontent) {
        this.recontent = recontent == null ? null : recontent.trim();
    }
}
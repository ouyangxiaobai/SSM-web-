package com.bs.bean;

public class Review {
    private Integer reid;

    private String recontent;

    private String reviewtime;

    private Integer reuid;

    private String mid;
    
    private User user;
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public String getRecontent() {
        return recontent;
    }

    public void setRecontent(String recontent) {
        this.recontent = recontent == null ? null : recontent.trim();
    }

    public String getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(String reviewtime) {
        this.reviewtime = reviewtime == null ? null : reviewtime.trim();
    }

    public Integer getReuid() {
        return reuid;
    }

    public void setReuid(Integer reuid) {
        this.reuid = reuid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }
}
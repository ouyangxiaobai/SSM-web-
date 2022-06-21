package com.bs.bean;

public class LifeFile {
    private Integer fid;

    private String contentfile;

    private Integer olifeid;

    private String filetype;

    @Override
	public String toString() {
		return "LifeFile [fid=" + fid + ", contentfile=" + contentfile + ", olifeid=" + olifeid + ", filetype="
				+ filetype + "]";
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getContentfile() {
        return contentfile;
    }

    public void setContentfile(String contentfile) {
        this.contentfile = contentfile == null ? null : contentfile.trim();
    }

    public Integer getOlifeid() {
        return olifeid;
    }

    public void setOlifeid(Integer olifeid) {
        this.olifeid = olifeid;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }
}
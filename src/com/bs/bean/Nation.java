package com.bs.bean;

public class Nation {
    private Integer id;

    private String nation;

    @Override
	public String toString() {
		return "Nation [id=" + id + ", nation=" + nation + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }
}
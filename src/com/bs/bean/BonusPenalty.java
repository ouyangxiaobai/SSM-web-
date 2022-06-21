package com.bs.bean;

public class BonusPenalty {
    private Integer id;

    private String partymemName;

    private Integer gender;

    private String birthday;

    private String nation;

    private String occupation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartymemName() {
        return partymemName;
    }

    public void setPartymemName(String partymemName) {
        this.partymemName = partymemName == null ? null : partymemName.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }
}
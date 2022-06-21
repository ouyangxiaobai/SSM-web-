package com.bs.bean;

public class ProActive {
    private Integer id;

    private String organizationName;	//机构名称

    private String partymemName;		//党员姓名

    private Integer gender;				//1男0女

    private String birthday;			//出生日期

    private String occupation;			//职业

    private String nation;				//民族

    private String nativePlace;			//籍贯

    private String educationLevel;		//文化程度

    private String incubationTime;		//培养时间

    private String incubationPeople;	//培养人

    private String remarks;				//备注

    private String photo;				//照片

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel == null ? null : educationLevel.trim();
    }

    public String getIncubationTime() {
        return incubationTime;
    }

    public void setIncubationTime(String incubationTime) {
        this.incubationTime = incubationTime == null ? null : incubationTime.trim();
    }

    public String getIncubationPeople() {
        return incubationPeople;
    }

    public void setIncubationPeople(String incubationPeople) {
        this.incubationPeople = incubationPeople == null ? null : incubationPeople.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}
package com.bs.bean;

public class PartymemOutflow {
    private Integer id;

    private String organizationName;			//机构名称

    private String partymemName;				//党员姓名

    private Integer gender;						//1男0女

    private String birthday;					//出生日期

    private String occupation;					//职业

    private String joiningPartytime;			//入党时间

    private String partyPosts;					//党内职务

    private String nonPartyduties;				//党外职务

    private String outflowCauses;				//流出原因

    private String outflowtime;					//流出时间

    private String outflowMechanism;			//流出地机构

    private String outflowTelephone;			//流出地电话

    private String originalinstitutionPhone;	//原机构电话

    private String originalinstitutionName;		//原机构名称

    private String partymemRemarks;				//党员备注

    private String photo;						//照片

    private String nation;						//民族

    private String educationLevel;				//文化程度

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

    public String getJoiningPartytime() {
        return joiningPartytime;
    }

    public void setJoiningPartytime(String joiningPartytime) {
        this.joiningPartytime = joiningPartytime == null ? null : joiningPartytime.trim();
    }

    public String getPartyPosts() {
        return partyPosts;
    }

    public void setPartyPosts(String partyPosts) {
        this.partyPosts = partyPosts == null ? null : partyPosts.trim();
    }

    public String getNonPartyduties() {
        return nonPartyduties;
    }

    public void setNonPartyduties(String nonPartyduties) {
        this.nonPartyduties = nonPartyduties == null ? null : nonPartyduties.trim();
    }

    public String getOutflowCauses() {
        return outflowCauses;
    }

    public void setOutflowCauses(String outflowCauses) {
        this.outflowCauses = outflowCauses == null ? null : outflowCauses.trim();
    }

    public String getOutflowtime() {
        return outflowtime;
    }

    public void setOutflowtime(String outflowtime) {
        this.outflowtime = outflowtime == null ? null : outflowtime.trim();
    }

    public String getOutflowMechanism() {
        return outflowMechanism;
    }

    public void setOutflowMechanism(String outflowMechanism) {
        this.outflowMechanism = outflowMechanism == null ? null : outflowMechanism.trim();
    }

    public String getOutflowTelephone() {
        return outflowTelephone;
    }

    public void setOutflowTelephone(String outflowTelephone) {
        this.outflowTelephone = outflowTelephone == null ? null : outflowTelephone.trim();
    }

    public String getOriginalinstitutionPhone() {
        return originalinstitutionPhone;
    }

    public void setOriginalinstitutionPhone(String originalinstitutionPhone) {
        this.originalinstitutionPhone = originalinstitutionPhone == null ? null : originalinstitutionPhone.trim();
    }

    public String getOriginalinstitutionName() {
        return originalinstitutionName;
    }

    public void setOriginalinstitutionName(String originalinstitutionName) {
        this.originalinstitutionName = originalinstitutionName == null ? null : originalinstitutionName.trim();
    }

    public String getPartymemRemarks() {
        return partymemRemarks;
    }

    public void setPartymemRemarks(String partymemRemarks) {
        this.partymemRemarks = partymemRemarks == null ? null : partymemRemarks.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel == null ? null : educationLevel.trim();
    }
}
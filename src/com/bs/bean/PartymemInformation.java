package com.bs.bean;

public class PartymemInformation {
    private Integer id;

    private String organizationName;			//机构名称

    private String partymemName;				//党员姓名

    private Integer gender;						//1男0女

    private String birthday;					//出生日期

    private String occupation;					//职业

    private String joiningPartytime;			//入党时间

    private String partyPosts;					//党内职务

    private String nonPartyduties;				//党外职务

    private String originalinstitutionPhone;	//原机构电话

    private String originalinstitutionName;		//原机构名称

    private String inflowTime;					//流入时间

    private String introducer;					//入党介绍人

    private String photo;						//照片

    private String status;						//党员状态

    private String partymemRemarks;				//党员备注

    private String nation;						//民族

    private String nativePlace;					//籍贯

    private String educationLevel;				//文化程度

    private String bonuspenalty;
    
    private String appraise;
    
    @Override
	public String toString() {
		return "PartymemInformation [id=" + id + ", organizationName=" + organizationName + ", partymemName="
				+ partymemName + ", gender=" + gender + ", birthday=" + birthday + ", occupation=" + occupation
				+ ", joiningPartytime=" + joiningPartytime + ", partyPosts=" + partyPosts + ", nonPartyduties="
				+ nonPartyduties + ", originalinstitutionPhone=" + originalinstitutionPhone
				+ ", originalinstitutionName=" + originalinstitutionName + ", inflowTime=" + inflowTime
				+ ", introducer=" + introducer + ", photo=" + photo + ", status=" + status + ", partymemRemarks="
				+ partymemRemarks + ", nation=" + nation + ", nativePlace=" + nativePlace + ", educationLevel="
				+ educationLevel + "]";
	}

	public String getAppraise() {
		return appraise;
	}

	public void setAppraise(String appraise) {
		this.appraise = appraise;
	}

	public String getBonuspenalty() {
		return bonuspenalty;
	}

	public void setBonuspenalty(String bonuspenalty) {
		this.bonuspenalty = bonuspenalty;
	}

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

    public String getInflowTime() {
        return inflowTime;
    }

    public void setInflowTime(String inflowTime) {
        this.inflowTime = inflowTime == null ? null : inflowTime.trim();
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer == null ? null : introducer.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPartymemRemarks() {
        return partymemRemarks;
    }

    public void setPartymemRemarks(String partymemRemarks) {
        this.partymemRemarks = partymemRemarks == null ? null : partymemRemarks.trim();
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
}
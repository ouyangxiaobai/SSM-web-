package com.bs.bean;

import java.util.List;

public class OrganizationalLife {
    private Integer id;

    private String organizationalUnit;	//组织单位

    private String activityName;		//活动名称

    private String personCharge;		//负责人

    private String activityTime;		//时间

    private String peoplenumber;		//人数

    private String activityContent;		//内容

    private String remarks;				//备注

    private String place;				//地点

    private List<LifeFile> lifeFile;

	public List<LifeFile> getLifeFile() {
		return lifeFile;
	}

	public void setLifeFile(List<LifeFile> lifeFile) {
		this.lifeFile = lifeFile;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit == null ? null : organizationalUnit.trim();
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getPersonCharge() {
        return personCharge;
    }

    public void setPersonCharge(String personCharge) {
        this.personCharge = personCharge == null ? null : personCharge.trim();
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime == null ? null : activityTime.trim();
    }

    public String getPeoplenumber() {
        return peoplenumber;
    }

    public void setPeoplenumber(String peoplenumber) {
        this.peoplenumber = peoplenumber == null ? null : peoplenumber.trim();
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }
}
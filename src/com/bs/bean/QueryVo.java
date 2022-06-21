package com.bs.bean;

public class QueryVo {
	private Integer currentPage = 1;
	private Integer totalPage;
	private Integer recordNumber;
	private String oname; // 机构名称查询关键字
	private String name; // 姓名查询关键字
	private String birth; // 出生日期查询关键字
	private String joiningtime; // 入党时间查询关键字
	private String originphone; // 原机构电话查询关键字
	private String originname; // 原机构名称查询关键字
	private String inftime; // 流入时间查询关键字

	private String pyear; // 年份

	private String outfcauses; // 流出原因查询关键字
	private String outftime; // 流出日期查询关键字

	private String incubatime; // 培养时间查询关键字
	private String incubapeople; // 培养人查询关键字
	private String develdate; // 发展日期查询关键字

	private String selectdate; // 评选日期查询关键字

	private String organunit; // 组织单位查询关键字
	private String actname; // 活动名称查询关键字
	private String personcha; // 负责人查询关键字
	private String acttime; // 时间查询关键字

	private String nation;
	private String educationLevel;
	private String nativePlace;
	
	private Integer start;
	private Integer size = 5;
	
	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getRecordNumber() {
		return recordNumber;
	}
	public void setRecordNumber(Integer recordNumber) {
		this.recordNumber = recordNumber;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJoiningtime() {
		return joiningtime;
	}
	public void setJoiningtime(String joiningtime) {
		this.joiningtime = joiningtime;
	}
	public String getOriginphone() {
		return originphone;
	}
	public void setOriginphone(String originphone) {
		this.originphone = originphone;
	}
	public String getOriginname() {
		return originname;
	}
	public void setOriginname(String originname) {
		this.originname = originname;
	}
	public String getInftime() {
		return inftime;
	}
	public void setInftime(String inftime) {
		this.inftime = inftime;
	}
	public String getPyear() {
		return pyear;
	}
	public void setPyear(String pyear) {
		this.pyear = pyear;
	}
	public String getOutfcauses() {
		return outfcauses;
	}
	public void setOutfcauses(String outfcauses) {
		this.outfcauses = outfcauses;
	}
	public String getOutftime() {
		return outftime;
	}
	public void setOutftime(String outftime) {
		this.outftime = outftime;
	}
	public String getIncubatime() {
		return incubatime;
	}
	public void setIncubatime(String incubatime) {
		this.incubatime = incubatime;
	}
	public String getIncubapeople() {
		return incubapeople;
	}
	public void setIncubapeople(String incubapeople) {
		this.incubapeople = incubapeople;
	}
	public String getDeveldate() {
		return develdate;
	}
	public void setDeveldate(String develdate) {
		this.develdate = develdate;
	}
	public String getSelectdate() {
		return selectdate;
	}
	public void setSelectdate(String selectdate) {
		this.selectdate = selectdate;
	}
	public String getOrganunit() {
		return organunit;
	}
	public void setOrganunit(String organunit) {
		this.organunit = organunit;
	}
	public String getActname() {
		return actname;
	}
	public void setActname(String actname) {
		this.actname = actname;
	}
	public String getPersoncha() {
		return personcha;
	}
	public void setPersoncha(String personcha) {
		this.personcha = personcha;
	}
	public String getActtime() {
		return acttime;
	}
	public void setActtime(String acttime) {
		this.acttime = acttime;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	
}

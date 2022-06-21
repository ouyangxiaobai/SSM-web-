package com.bs.bean;

public class PartymemDues {
    private Integer id;

    private Integer partymemId;
    
    private String organizationName;

    private String partymemName;

    private String particularYear;

    private String january;

    private String february;

    private String march;

    private String april;

    private String may;

    private String june;

    private String july;

    private String august;

    private String september;

    private String october;

    private String november;

    private String december;

    private PartymemInformation partymem;
    
    public PartymemInformation getPartymem() {
		return partymem;
	}

	public void setPartymem(PartymemInformation partymem) {
		this.partymem = partymem;
	}

	public Integer getPartymemId() {
		return partymemId;
	}

	public void setPartymemId(Integer partymemId) {
		this.partymemId = partymemId;
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

    public String getParticularYear() {
        return particularYear;
    }

    public void setParticularYear(String particularYear) {
        this.particularYear = particularYear == null ? null : particularYear.trim();
    }

    public String getJanuary() {
        return january;
    }

    public void setJanuary(String january) {
        this.january = january == null ? null : january.trim();
    }

    public String getFebruary() {
        return february;
    }

    public void setFebruary(String february) {
        this.february = february == null ? null : february.trim();
    }

    public String getMarch() {
        return march;
    }

    public void setMarch(String march) {
        this.march = march == null ? null : march.trim();
    }

    public String getApril() {
        return april;
    }

    public void setApril(String april) {
        this.april = april == null ? null : april.trim();
    }

    public String getMay() {
        return may;
    }

    public void setMay(String may) {
        this.may = may == null ? null : may.trim();
    }

    public String getJune() {
        return june;
    }

    public void setJune(String june) {
        this.june = june == null ? null : june.trim();
    }

    public String getJuly() {
        return july;
    }

    public void setJuly(String july) {
        this.july = july == null ? null : july.trim();
    }

    public String getAugust() {
        return august;
    }

    public void setAugust(String august) {
        this.august = august == null ? null : august.trim();
    }

    public String getSeptember() {
        return september;
    }

    public void setSeptember(String september) {
        this.september = september == null ? null : september.trim();
    }

    public String getOctober() {
        return october;
    }

    public void setOctober(String october) {
        this.october = october == null ? null : october.trim();
    }

    public String getNovember() {
        return november;
    }

    public void setNovember(String november) {
        this.november = november == null ? null : november.trim();
    }

    public String getDecember() {
        return december;
    }

    public void setDecember(String december) {
        this.december = december == null ? null : december.trim();
    }
}
package com.bs.bean;

import java.util.ArrayList;
import java.util.List;

public class PartymemDuesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartymemDuesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIsNull() {
            addCriterion("organization_name is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIsNotNull() {
            addCriterion("organization_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEqualTo(String value) {
            addCriterion("organization_name =", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotEqualTo(String value) {
            addCriterion("organization_name <>", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThan(String value) {
            addCriterion("organization_name >", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThanOrEqualTo(String value) {
            addCriterion("organization_name >=", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThan(String value) {
            addCriterion("organization_name <", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThanOrEqualTo(String value) {
            addCriterion("organization_name <=", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLike(String value) {
            addCriterion("organization_name like", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotLike(String value) {
            addCriterion("organization_name not like", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIn(List<String> values) {
            addCriterion("organization_name in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotIn(List<String> values) {
            addCriterion("organization_name not in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameBetween(String value1, String value2) {
            addCriterion("organization_name between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotBetween(String value1, String value2) {
            addCriterion("organization_name not between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameIsNull() {
            addCriterion("partymem_name is null");
            return (Criteria) this;
        }

        public Criteria andPartymemNameIsNotNull() {
            addCriterion("partymem_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartymemNameEqualTo(String value) {
            addCriterion("partymem_name =", value, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameNotEqualTo(String value) {
            addCriterion("partymem_name <>", value, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameGreaterThan(String value) {
            addCriterion("partymem_name >", value, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameGreaterThanOrEqualTo(String value) {
            addCriterion("partymem_name >=", value, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameLessThan(String value) {
            addCriterion("partymem_name <", value, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameLessThanOrEqualTo(String value) {
            addCriterion("partymem_name <=", value, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameLike(String value) {
            addCriterion("partymem_name like", value, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameNotLike(String value) {
            addCriterion("partymem_name not like", value, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameIn(List<String> values) {
            addCriterion("partymem_name in", values, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameNotIn(List<String> values) {
            addCriterion("partymem_name not in", values, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameBetween(String value1, String value2) {
            addCriterion("partymem_name between", value1, value2, "partymemName");
            return (Criteria) this;
        }

        public Criteria andPartymemNameNotBetween(String value1, String value2) {
            addCriterion("partymem_name not between", value1, value2, "partymemName");
            return (Criteria) this;
        }

        public Criteria andParticularYearIsNull() {
            addCriterion("particular_year is null");
            return (Criteria) this;
        }

        public Criteria andParticularYearIsNotNull() {
            addCriterion("particular_year is not null");
            return (Criteria) this;
        }

        public Criteria andParticularYearEqualTo(String value) {
            addCriterion("particular_year =", value, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearNotEqualTo(String value) {
            addCriterion("particular_year <>", value, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearGreaterThan(String value) {
            addCriterion("particular_year >", value, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearGreaterThanOrEqualTo(String value) {
            addCriterion("particular_year >=", value, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearLessThan(String value) {
            addCriterion("particular_year <", value, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearLessThanOrEqualTo(String value) {
            addCriterion("particular_year <=", value, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearLike(String value) {
            addCriterion("particular_year like", value, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearNotLike(String value) {
            addCriterion("particular_year not like", value, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearIn(List<String> values) {
            addCriterion("particular_year in", values, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearNotIn(List<String> values) {
            addCriterion("particular_year not in", values, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearBetween(String value1, String value2) {
            addCriterion("particular_year between", value1, value2, "particularYear");
            return (Criteria) this;
        }

        public Criteria andParticularYearNotBetween(String value1, String value2) {
            addCriterion("particular_year not between", value1, value2, "particularYear");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNull() {
            addCriterion("january is null");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNotNull() {
            addCriterion("january is not null");
            return (Criteria) this;
        }

        public Criteria andJanuaryEqualTo(String value) {
            addCriterion("january =", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotEqualTo(String value) {
            addCriterion("january <>", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThan(String value) {
            addCriterion("january >", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThanOrEqualTo(String value) {
            addCriterion("january >=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThan(String value) {
            addCriterion("january <", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThanOrEqualTo(String value) {
            addCriterion("january <=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLike(String value) {
            addCriterion("january like", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotLike(String value) {
            addCriterion("january not like", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryIn(List<String> values) {
            addCriterion("january in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotIn(List<String> values) {
            addCriterion("january not in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryBetween(String value1, String value2) {
            addCriterion("january between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotBetween(String value1, String value2) {
            addCriterion("january not between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andFebruaryIsNull() {
            addCriterion("february is null");
            return (Criteria) this;
        }

        public Criteria andFebruaryIsNotNull() {
            addCriterion("february is not null");
            return (Criteria) this;
        }

        public Criteria andFebruaryEqualTo(String value) {
            addCriterion("february =", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotEqualTo(String value) {
            addCriterion("february <>", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThan(String value) {
            addCriterion("february >", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThanOrEqualTo(String value) {
            addCriterion("february >=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThan(String value) {
            addCriterion("february <", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThanOrEqualTo(String value) {
            addCriterion("february <=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLike(String value) {
            addCriterion("february like", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotLike(String value) {
            addCriterion("february not like", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryIn(List<String> values) {
            addCriterion("february in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotIn(List<String> values) {
            addCriterion("february not in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryBetween(String value1, String value2) {
            addCriterion("february between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotBetween(String value1, String value2) {
            addCriterion("february not between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andMarchIsNull() {
            addCriterion("march is null");
            return (Criteria) this;
        }

        public Criteria andMarchIsNotNull() {
            addCriterion("march is not null");
            return (Criteria) this;
        }

        public Criteria andMarchEqualTo(String value) {
            addCriterion("march =", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotEqualTo(String value) {
            addCriterion("march <>", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThan(String value) {
            addCriterion("march >", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThanOrEqualTo(String value) {
            addCriterion("march >=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThan(String value) {
            addCriterion("march <", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThanOrEqualTo(String value) {
            addCriterion("march <=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLike(String value) {
            addCriterion("march like", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotLike(String value) {
            addCriterion("march not like", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchIn(List<String> values) {
            addCriterion("march in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotIn(List<String> values) {
            addCriterion("march not in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchBetween(String value1, String value2) {
            addCriterion("march between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotBetween(String value1, String value2) {
            addCriterion("march not between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andAprilIsNull() {
            addCriterion("april is null");
            return (Criteria) this;
        }

        public Criteria andAprilIsNotNull() {
            addCriterion("april is not null");
            return (Criteria) this;
        }

        public Criteria andAprilEqualTo(String value) {
            addCriterion("april =", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotEqualTo(String value) {
            addCriterion("april <>", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThan(String value) {
            addCriterion("april >", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThanOrEqualTo(String value) {
            addCriterion("april >=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThan(String value) {
            addCriterion("april <", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThanOrEqualTo(String value) {
            addCriterion("april <=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLike(String value) {
            addCriterion("april like", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotLike(String value) {
            addCriterion("april not like", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilIn(List<String> values) {
            addCriterion("april in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotIn(List<String> values) {
            addCriterion("april not in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilBetween(String value1, String value2) {
            addCriterion("april between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotBetween(String value1, String value2) {
            addCriterion("april not between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andMayIsNull() {
            addCriterion("may is null");
            return (Criteria) this;
        }

        public Criteria andMayIsNotNull() {
            addCriterion("may is not null");
            return (Criteria) this;
        }

        public Criteria andMayEqualTo(String value) {
            addCriterion("may =", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotEqualTo(String value) {
            addCriterion("may <>", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThan(String value) {
            addCriterion("may >", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThanOrEqualTo(String value) {
            addCriterion("may >=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThan(String value) {
            addCriterion("may <", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThanOrEqualTo(String value) {
            addCriterion("may <=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLike(String value) {
            addCriterion("may like", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotLike(String value) {
            addCriterion("may not like", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayIn(List<String> values) {
            addCriterion("may in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotIn(List<String> values) {
            addCriterion("may not in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayBetween(String value1, String value2) {
            addCriterion("may between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotBetween(String value1, String value2) {
            addCriterion("may not between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andJuneIsNull() {
            addCriterion("june is null");
            return (Criteria) this;
        }

        public Criteria andJuneIsNotNull() {
            addCriterion("june is not null");
            return (Criteria) this;
        }

        public Criteria andJuneEqualTo(String value) {
            addCriterion("june =", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotEqualTo(String value) {
            addCriterion("june <>", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThan(String value) {
            addCriterion("june >", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThanOrEqualTo(String value) {
            addCriterion("june >=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThan(String value) {
            addCriterion("june <", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThanOrEqualTo(String value) {
            addCriterion("june <=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLike(String value) {
            addCriterion("june like", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotLike(String value) {
            addCriterion("june not like", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneIn(List<String> values) {
            addCriterion("june in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotIn(List<String> values) {
            addCriterion("june not in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneBetween(String value1, String value2) {
            addCriterion("june between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotBetween(String value1, String value2) {
            addCriterion("june not between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andJulyIsNull() {
            addCriterion("july is null");
            return (Criteria) this;
        }

        public Criteria andJulyIsNotNull() {
            addCriterion("july is not null");
            return (Criteria) this;
        }

        public Criteria andJulyEqualTo(String value) {
            addCriterion("july =", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotEqualTo(String value) {
            addCriterion("july <>", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThan(String value) {
            addCriterion("july >", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThanOrEqualTo(String value) {
            addCriterion("july >=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThan(String value) {
            addCriterion("july <", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThanOrEqualTo(String value) {
            addCriterion("july <=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLike(String value) {
            addCriterion("july like", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotLike(String value) {
            addCriterion("july not like", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyIn(List<String> values) {
            addCriterion("july in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotIn(List<String> values) {
            addCriterion("july not in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyBetween(String value1, String value2) {
            addCriterion("july between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotBetween(String value1, String value2) {
            addCriterion("july not between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andAugustIsNull() {
            addCriterion("august is null");
            return (Criteria) this;
        }

        public Criteria andAugustIsNotNull() {
            addCriterion("august is not null");
            return (Criteria) this;
        }

        public Criteria andAugustEqualTo(String value) {
            addCriterion("august =", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotEqualTo(String value) {
            addCriterion("august <>", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThan(String value) {
            addCriterion("august >", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThanOrEqualTo(String value) {
            addCriterion("august >=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThan(String value) {
            addCriterion("august <", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThanOrEqualTo(String value) {
            addCriterion("august <=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLike(String value) {
            addCriterion("august like", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotLike(String value) {
            addCriterion("august not like", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustIn(List<String> values) {
            addCriterion("august in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotIn(List<String> values) {
            addCriterion("august not in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustBetween(String value1, String value2) {
            addCriterion("august between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotBetween(String value1, String value2) {
            addCriterion("august not between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andSeptemberIsNull() {
            addCriterion("september is null");
            return (Criteria) this;
        }

        public Criteria andSeptemberIsNotNull() {
            addCriterion("september is not null");
            return (Criteria) this;
        }

        public Criteria andSeptemberEqualTo(String value) {
            addCriterion("september =", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotEqualTo(String value) {
            addCriterion("september <>", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThan(String value) {
            addCriterion("september >", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThanOrEqualTo(String value) {
            addCriterion("september >=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThan(String value) {
            addCriterion("september <", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThanOrEqualTo(String value) {
            addCriterion("september <=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLike(String value) {
            addCriterion("september like", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotLike(String value) {
            addCriterion("september not like", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberIn(List<String> values) {
            addCriterion("september in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotIn(List<String> values) {
            addCriterion("september not in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberBetween(String value1, String value2) {
            addCriterion("september between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotBetween(String value1, String value2) {
            addCriterion("september not between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andOctoberIsNull() {
            addCriterion("october is null");
            return (Criteria) this;
        }

        public Criteria andOctoberIsNotNull() {
            addCriterion("october is not null");
            return (Criteria) this;
        }

        public Criteria andOctoberEqualTo(String value) {
            addCriterion("october =", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotEqualTo(String value) {
            addCriterion("october <>", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThan(String value) {
            addCriterion("october >", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThanOrEqualTo(String value) {
            addCriterion("october >=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThan(String value) {
            addCriterion("october <", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThanOrEqualTo(String value) {
            addCriterion("october <=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLike(String value) {
            addCriterion("october like", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotLike(String value) {
            addCriterion("october not like", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberIn(List<String> values) {
            addCriterion("october in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotIn(List<String> values) {
            addCriterion("october not in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberBetween(String value1, String value2) {
            addCriterion("october between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotBetween(String value1, String value2) {
            addCriterion("october not between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andNovemberIsNull() {
            addCriterion("november is null");
            return (Criteria) this;
        }

        public Criteria andNovemberIsNotNull() {
            addCriterion("november is not null");
            return (Criteria) this;
        }

        public Criteria andNovemberEqualTo(String value) {
            addCriterion("november =", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotEqualTo(String value) {
            addCriterion("november <>", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThan(String value) {
            addCriterion("november >", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThanOrEqualTo(String value) {
            addCriterion("november >=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThan(String value) {
            addCriterion("november <", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThanOrEqualTo(String value) {
            addCriterion("november <=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLike(String value) {
            addCriterion("november like", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotLike(String value) {
            addCriterion("november not like", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberIn(List<String> values) {
            addCriterion("november in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotIn(List<String> values) {
            addCriterion("november not in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberBetween(String value1, String value2) {
            addCriterion("november between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotBetween(String value1, String value2) {
            addCriterion("november not between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andDecemberIsNull() {
            addCriterion("december is null");
            return (Criteria) this;
        }

        public Criteria andDecemberIsNotNull() {
            addCriterion("december is not null");
            return (Criteria) this;
        }

        public Criteria andDecemberEqualTo(String value) {
            addCriterion("december =", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotEqualTo(String value) {
            addCriterion("december <>", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThan(String value) {
            addCriterion("december >", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThanOrEqualTo(String value) {
            addCriterion("december >=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThan(String value) {
            addCriterion("december <", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThanOrEqualTo(String value) {
            addCriterion("december <=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLike(String value) {
            addCriterion("december like", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotLike(String value) {
            addCriterion("december not like", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberIn(List<String> values) {
            addCriterion("december in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotIn(List<String> values) {
            addCriterion("december not in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberBetween(String value1, String value2) {
            addCriterion("december between", value1, value2, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotBetween(String value1, String value2) {
            addCriterion("december not between", value1, value2, "december");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
package com.bs.bean;

import java.util.ArrayList;
import java.util.List;

public class OrganizationalLifeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationalLifeExample() {
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

        public Criteria andOrganizationalUnitIsNull() {
            addCriterion("organizational_unit is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitIsNotNull() {
            addCriterion("organizational_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitEqualTo(String value) {
            addCriterion("organizational_unit =", value, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitNotEqualTo(String value) {
            addCriterion("organizational_unit <>", value, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitGreaterThan(String value) {
            addCriterion("organizational_unit >", value, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitGreaterThanOrEqualTo(String value) {
            addCriterion("organizational_unit >=", value, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitLessThan(String value) {
            addCriterion("organizational_unit <", value, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitLessThanOrEqualTo(String value) {
            addCriterion("organizational_unit <=", value, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitLike(String value) {
            addCriterion("organizational_unit like", value, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitNotLike(String value) {
            addCriterion("organizational_unit not like", value, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitIn(List<String> values) {
            addCriterion("organizational_unit in", values, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitNotIn(List<String> values) {
            addCriterion("organizational_unit not in", values, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitBetween(String value1, String value2) {
            addCriterion("organizational_unit between", value1, value2, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizationalUnitNotBetween(String value1, String value2) {
            addCriterion("organizational_unit not between", value1, value2, "organizationalUnit");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIsNull() {
            addCriterion("person_charge is null");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIsNotNull() {
            addCriterion("person_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPersonChargeEqualTo(String value) {
            addCriterion("person_charge =", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotEqualTo(String value) {
            addCriterion("person_charge <>", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeGreaterThan(String value) {
            addCriterion("person_charge >", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeGreaterThanOrEqualTo(String value) {
            addCriterion("person_charge >=", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeLessThan(String value) {
            addCriterion("person_charge <", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeLessThanOrEqualTo(String value) {
            addCriterion("person_charge <=", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeLike(String value) {
            addCriterion("person_charge like", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotLike(String value) {
            addCriterion("person_charge not like", value, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeIn(List<String> values) {
            addCriterion("person_charge in", values, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotIn(List<String> values) {
            addCriterion("person_charge not in", values, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeBetween(String value1, String value2) {
            addCriterion("person_charge between", value1, value2, "personCharge");
            return (Criteria) this;
        }

        public Criteria andPersonChargeNotBetween(String value1, String value2) {
            addCriterion("person_charge not between", value1, value2, "personCharge");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNull() {
            addCriterion("activity_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNotNull() {
            addCriterion("activity_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeEqualTo(String value) {
            addCriterion("activity_time =", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotEqualTo(String value) {
            addCriterion("activity_time <>", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThan(String value) {
            addCriterion("activity_time >", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_time >=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThan(String value) {
            addCriterion("activity_time <", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThanOrEqualTo(String value) {
            addCriterion("activity_time <=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLike(String value) {
            addCriterion("activity_time like", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotLike(String value) {
            addCriterion("activity_time not like", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIn(List<String> values) {
            addCriterion("activity_time in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotIn(List<String> values) {
            addCriterion("activity_time not in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeBetween(String value1, String value2) {
            addCriterion("activity_time between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotBetween(String value1, String value2) {
            addCriterion("activity_time not between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberIsNull() {
            addCriterion("peoplenumber is null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberIsNotNull() {
            addCriterion("peoplenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberEqualTo(String value) {
            addCriterion("peoplenumber =", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberNotEqualTo(String value) {
            addCriterion("peoplenumber <>", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberGreaterThan(String value) {
            addCriterion("peoplenumber >", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberGreaterThanOrEqualTo(String value) {
            addCriterion("peoplenumber >=", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberLessThan(String value) {
            addCriterion("peoplenumber <", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberLessThanOrEqualTo(String value) {
            addCriterion("peoplenumber <=", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberLike(String value) {
            addCriterion("peoplenumber like", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberNotLike(String value) {
            addCriterion("peoplenumber not like", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberIn(List<String> values) {
            addCriterion("peoplenumber in", values, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberNotIn(List<String> values) {
            addCriterion("peoplenumber not in", values, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberBetween(String value1, String value2) {
            addCriterion("peoplenumber between", value1, value2, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberNotBetween(String value1, String value2) {
            addCriterion("peoplenumber not between", value1, value2, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNull() {
            addCriterion("activity_content is null");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNotNull() {
            addCriterion("activity_content is not null");
            return (Criteria) this;
        }

        public Criteria andActivityContentEqualTo(String value) {
            addCriterion("activity_content =", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotEqualTo(String value) {
            addCriterion("activity_content <>", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThan(String value) {
            addCriterion("activity_content >", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThanOrEqualTo(String value) {
            addCriterion("activity_content >=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThan(String value) {
            addCriterion("activity_content <", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThanOrEqualTo(String value) {
            addCriterion("activity_content <=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLike(String value) {
            addCriterion("activity_content like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotLike(String value) {
            addCriterion("activity_content not like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentIn(List<String> values) {
            addCriterion("activity_content in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotIn(List<String> values) {
            addCriterion("activity_content not in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentBetween(String value1, String value2) {
            addCriterion("activity_content between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotBetween(String value1, String value2) {
            addCriterion("activity_content not between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
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
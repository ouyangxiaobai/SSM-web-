package com.bs.bean;

import java.util.ArrayList;
import java.util.List;

public class LiuyanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiuyanExample() {
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

        public Criteria andLiuyanIdIsNull() {
            addCriterion("liuyan_id is null");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdIsNotNull() {
            addCriterion("liuyan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdEqualTo(Integer value) {
            addCriterion("liuyan_id =", value, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdNotEqualTo(Integer value) {
            addCriterion("liuyan_id <>", value, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdGreaterThan(Integer value) {
            addCriterion("liuyan_id >", value, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("liuyan_id >=", value, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdLessThan(Integer value) {
            addCriterion("liuyan_id <", value, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdLessThanOrEqualTo(Integer value) {
            addCriterion("liuyan_id <=", value, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdIn(List<Integer> values) {
            addCriterion("liuyan_id in", values, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdNotIn(List<Integer> values) {
            addCriterion("liuyan_id not in", values, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdBetween(Integer value1, Integer value2) {
            addCriterion("liuyan_id between", value1, value2, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("liuyan_id not between", value1, value2, "liuyanId");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleIsNull() {
            addCriterion("liuyan_title is null");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleIsNotNull() {
            addCriterion("liuyan_title is not null");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleEqualTo(String value) {
            addCriterion("liuyan_title =", value, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleNotEqualTo(String value) {
            addCriterion("liuyan_title <>", value, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleGreaterThan(String value) {
            addCriterion("liuyan_title >", value, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleGreaterThanOrEqualTo(String value) {
            addCriterion("liuyan_title >=", value, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleLessThan(String value) {
            addCriterion("liuyan_title <", value, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleLessThanOrEqualTo(String value) {
            addCriterion("liuyan_title <=", value, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleLike(String value) {
            addCriterion("liuyan_title like", value, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleNotLike(String value) {
            addCriterion("liuyan_title not like", value, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleIn(List<String> values) {
            addCriterion("liuyan_title in", values, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleNotIn(List<String> values) {
            addCriterion("liuyan_title not in", values, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleBetween(String value1, String value2) {
            addCriterion("liuyan_title between", value1, value2, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanTitleNotBetween(String value1, String value2) {
            addCriterion("liuyan_title not between", value1, value2, "liuyanTitle");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentIsNull() {
            addCriterion("liuyan_content is null");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentIsNotNull() {
            addCriterion("liuyan_content is not null");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentEqualTo(String value) {
            addCriterion("liuyan_content =", value, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentNotEqualTo(String value) {
            addCriterion("liuyan_content <>", value, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentGreaterThan(String value) {
            addCriterion("liuyan_content >", value, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentGreaterThanOrEqualTo(String value) {
            addCriterion("liuyan_content >=", value, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentLessThan(String value) {
            addCriterion("liuyan_content <", value, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentLessThanOrEqualTo(String value) {
            addCriterion("liuyan_content <=", value, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentLike(String value) {
            addCriterion("liuyan_content like", value, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentNotLike(String value) {
            addCriterion("liuyan_content not like", value, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentIn(List<String> values) {
            addCriterion("liuyan_content in", values, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentNotIn(List<String> values) {
            addCriterion("liuyan_content not in", values, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentBetween(String value1, String value2) {
            addCriterion("liuyan_content between", value1, value2, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanContentNotBetween(String value1, String value2) {
            addCriterion("liuyan_content not between", value1, value2, "liuyanContent");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateIsNull() {
            addCriterion("liuyan_date is null");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateIsNotNull() {
            addCriterion("liuyan_date is not null");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateEqualTo(String value) {
            addCriterion("liuyan_date =", value, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateNotEqualTo(String value) {
            addCriterion("liuyan_date <>", value, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateGreaterThan(String value) {
            addCriterion("liuyan_date >", value, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateGreaterThanOrEqualTo(String value) {
            addCriterion("liuyan_date >=", value, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateLessThan(String value) {
            addCriterion("liuyan_date <", value, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateLessThanOrEqualTo(String value) {
            addCriterion("liuyan_date <=", value, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateLike(String value) {
            addCriterion("liuyan_date like", value, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateNotLike(String value) {
            addCriterion("liuyan_date not like", value, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateIn(List<String> values) {
            addCriterion("liuyan_date in", values, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateNotIn(List<String> values) {
            addCriterion("liuyan_date not in", values, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateBetween(String value1, String value2) {
            addCriterion("liuyan_date between", value1, value2, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanDateNotBetween(String value1, String value2) {
            addCriterion("liuyan_date not between", value1, value2, "liuyanDate");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserIsNull() {
            addCriterion("liuyan_user is null");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserIsNotNull() {
            addCriterion("liuyan_user is not null");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserEqualTo(String value) {
            addCriterion("liuyan_user =", value, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserNotEqualTo(String value) {
            addCriterion("liuyan_user <>", value, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserGreaterThan(String value) {
            addCriterion("liuyan_user >", value, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserGreaterThanOrEqualTo(String value) {
            addCriterion("liuyan_user >=", value, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserLessThan(String value) {
            addCriterion("liuyan_user <", value, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserLessThanOrEqualTo(String value) {
            addCriterion("liuyan_user <=", value, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserLike(String value) {
            addCriterion("liuyan_user like", value, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserNotLike(String value) {
            addCriterion("liuyan_user not like", value, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserIn(List<String> values) {
            addCriterion("liuyan_user in", values, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserNotIn(List<String> values) {
            addCriterion("liuyan_user not in", values, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserBetween(String value1, String value2) {
            addCriterion("liuyan_user between", value1, value2, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andLiuyanUserNotBetween(String value1, String value2) {
            addCriterion("liuyan_user not between", value1, value2, "liuyanUser");
            return (Criteria) this;
        }

        public Criteria andRecontentIsNull() {
            addCriterion("recontent is null");
            return (Criteria) this;
        }

        public Criteria andRecontentIsNotNull() {
            addCriterion("recontent is not null");
            return (Criteria) this;
        }

        public Criteria andRecontentEqualTo(String value) {
            addCriterion("recontent =", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotEqualTo(String value) {
            addCriterion("recontent <>", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentGreaterThan(String value) {
            addCriterion("recontent >", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentGreaterThanOrEqualTo(String value) {
            addCriterion("recontent >=", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLessThan(String value) {
            addCriterion("recontent <", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLessThanOrEqualTo(String value) {
            addCriterion("recontent <=", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLike(String value) {
            addCriterion("recontent like", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotLike(String value) {
            addCriterion("recontent not like", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentIn(List<String> values) {
            addCriterion("recontent in", values, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotIn(List<String> values) {
            addCriterion("recontent not in", values, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentBetween(String value1, String value2) {
            addCriterion("recontent between", value1, value2, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotBetween(String value1, String value2) {
            addCriterion("recontent not between", value1, value2, "recontent");
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
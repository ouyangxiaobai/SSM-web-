package com.bs.bean;

import java.util.ArrayList;
import java.util.List;

public class PartymemOutflowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartymemOutflowExample() {
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("occupation like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("occupation not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeIsNull() {
            addCriterion("joining_partytime is null");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeIsNotNull() {
            addCriterion("joining_partytime is not null");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeEqualTo(String value) {
            addCriterion("joining_partytime =", value, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeNotEqualTo(String value) {
            addCriterion("joining_partytime <>", value, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeGreaterThan(String value) {
            addCriterion("joining_partytime >", value, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeGreaterThanOrEqualTo(String value) {
            addCriterion("joining_partytime >=", value, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeLessThan(String value) {
            addCriterion("joining_partytime <", value, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeLessThanOrEqualTo(String value) {
            addCriterion("joining_partytime <=", value, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeLike(String value) {
            addCriterion("joining_partytime like", value, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeNotLike(String value) {
            addCriterion("joining_partytime not like", value, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeIn(List<String> values) {
            addCriterion("joining_partytime in", values, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeNotIn(List<String> values) {
            addCriterion("joining_partytime not in", values, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeBetween(String value1, String value2) {
            addCriterion("joining_partytime between", value1, value2, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andJoiningPartytimeNotBetween(String value1, String value2) {
            addCriterion("joining_partytime not between", value1, value2, "joiningPartytime");
            return (Criteria) this;
        }

        public Criteria andPartyPostsIsNull() {
            addCriterion("party_posts is null");
            return (Criteria) this;
        }

        public Criteria andPartyPostsIsNotNull() {
            addCriterion("party_posts is not null");
            return (Criteria) this;
        }

        public Criteria andPartyPostsEqualTo(String value) {
            addCriterion("party_posts =", value, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsNotEqualTo(String value) {
            addCriterion("party_posts <>", value, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsGreaterThan(String value) {
            addCriterion("party_posts >", value, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsGreaterThanOrEqualTo(String value) {
            addCriterion("party_posts >=", value, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsLessThan(String value) {
            addCriterion("party_posts <", value, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsLessThanOrEqualTo(String value) {
            addCriterion("party_posts <=", value, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsLike(String value) {
            addCriterion("party_posts like", value, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsNotLike(String value) {
            addCriterion("party_posts not like", value, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsIn(List<String> values) {
            addCriterion("party_posts in", values, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsNotIn(List<String> values) {
            addCriterion("party_posts not in", values, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsBetween(String value1, String value2) {
            addCriterion("party_posts between", value1, value2, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andPartyPostsNotBetween(String value1, String value2) {
            addCriterion("party_posts not between", value1, value2, "partyPosts");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesIsNull() {
            addCriterion("non_partyduties is null");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesIsNotNull() {
            addCriterion("non_partyduties is not null");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesEqualTo(String value) {
            addCriterion("non_partyduties =", value, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesNotEqualTo(String value) {
            addCriterion("non_partyduties <>", value, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesGreaterThan(String value) {
            addCriterion("non_partyduties >", value, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesGreaterThanOrEqualTo(String value) {
            addCriterion("non_partyduties >=", value, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesLessThan(String value) {
            addCriterion("non_partyduties <", value, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesLessThanOrEqualTo(String value) {
            addCriterion("non_partyduties <=", value, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesLike(String value) {
            addCriterion("non_partyduties like", value, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesNotLike(String value) {
            addCriterion("non_partyduties not like", value, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesIn(List<String> values) {
            addCriterion("non_partyduties in", values, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesNotIn(List<String> values) {
            addCriterion("non_partyduties not in", values, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesBetween(String value1, String value2) {
            addCriterion("non_partyduties between", value1, value2, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andNonPartydutiesNotBetween(String value1, String value2) {
            addCriterion("non_partyduties not between", value1, value2, "nonPartyduties");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesIsNull() {
            addCriterion("outflow_causes is null");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesIsNotNull() {
            addCriterion("outflow_causes is not null");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesEqualTo(String value) {
            addCriterion("outflow_causes =", value, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesNotEqualTo(String value) {
            addCriterion("outflow_causes <>", value, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesGreaterThan(String value) {
            addCriterion("outflow_causes >", value, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesGreaterThanOrEqualTo(String value) {
            addCriterion("outflow_causes >=", value, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesLessThan(String value) {
            addCriterion("outflow_causes <", value, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesLessThanOrEqualTo(String value) {
            addCriterion("outflow_causes <=", value, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesLike(String value) {
            addCriterion("outflow_causes like", value, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesNotLike(String value) {
            addCriterion("outflow_causes not like", value, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesIn(List<String> values) {
            addCriterion("outflow_causes in", values, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesNotIn(List<String> values) {
            addCriterion("outflow_causes not in", values, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesBetween(String value1, String value2) {
            addCriterion("outflow_causes between", value1, value2, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowCausesNotBetween(String value1, String value2) {
            addCriterion("outflow_causes not between", value1, value2, "outflowCauses");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeIsNull() {
            addCriterion("outflowtime is null");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeIsNotNull() {
            addCriterion("outflowtime is not null");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeEqualTo(String value) {
            addCriterion("outflowtime =", value, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeNotEqualTo(String value) {
            addCriterion("outflowtime <>", value, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeGreaterThan(String value) {
            addCriterion("outflowtime >", value, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeGreaterThanOrEqualTo(String value) {
            addCriterion("outflowtime >=", value, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeLessThan(String value) {
            addCriterion("outflowtime <", value, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeLessThanOrEqualTo(String value) {
            addCriterion("outflowtime <=", value, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeLike(String value) {
            addCriterion("outflowtime like", value, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeNotLike(String value) {
            addCriterion("outflowtime not like", value, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeIn(List<String> values) {
            addCriterion("outflowtime in", values, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeNotIn(List<String> values) {
            addCriterion("outflowtime not in", values, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeBetween(String value1, String value2) {
            addCriterion("outflowtime between", value1, value2, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowtimeNotBetween(String value1, String value2) {
            addCriterion("outflowtime not between", value1, value2, "outflowtime");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismIsNull() {
            addCriterion("outflow_mechanism is null");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismIsNotNull() {
            addCriterion("outflow_mechanism is not null");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismEqualTo(String value) {
            addCriterion("outflow_mechanism =", value, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismNotEqualTo(String value) {
            addCriterion("outflow_mechanism <>", value, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismGreaterThan(String value) {
            addCriterion("outflow_mechanism >", value, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismGreaterThanOrEqualTo(String value) {
            addCriterion("outflow_mechanism >=", value, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismLessThan(String value) {
            addCriterion("outflow_mechanism <", value, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismLessThanOrEqualTo(String value) {
            addCriterion("outflow_mechanism <=", value, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismLike(String value) {
            addCriterion("outflow_mechanism like", value, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismNotLike(String value) {
            addCriterion("outflow_mechanism not like", value, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismIn(List<String> values) {
            addCriterion("outflow_mechanism in", values, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismNotIn(List<String> values) {
            addCriterion("outflow_mechanism not in", values, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismBetween(String value1, String value2) {
            addCriterion("outflow_mechanism between", value1, value2, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowMechanismNotBetween(String value1, String value2) {
            addCriterion("outflow_mechanism not between", value1, value2, "outflowMechanism");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneIsNull() {
            addCriterion("outflow_telephone is null");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneIsNotNull() {
            addCriterion("outflow_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneEqualTo(String value) {
            addCriterion("outflow_telephone =", value, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneNotEqualTo(String value) {
            addCriterion("outflow_telephone <>", value, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneGreaterThan(String value) {
            addCriterion("outflow_telephone >", value, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("outflow_telephone >=", value, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneLessThan(String value) {
            addCriterion("outflow_telephone <", value, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneLessThanOrEqualTo(String value) {
            addCriterion("outflow_telephone <=", value, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneLike(String value) {
            addCriterion("outflow_telephone like", value, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneNotLike(String value) {
            addCriterion("outflow_telephone not like", value, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneIn(List<String> values) {
            addCriterion("outflow_telephone in", values, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneNotIn(List<String> values) {
            addCriterion("outflow_telephone not in", values, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneBetween(String value1, String value2) {
            addCriterion("outflow_telephone between", value1, value2, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOutflowTelephoneNotBetween(String value1, String value2) {
            addCriterion("outflow_telephone not between", value1, value2, "outflowTelephone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneIsNull() {
            addCriterion("originalinstitution_phone is null");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneIsNotNull() {
            addCriterion("originalinstitution_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneEqualTo(String value) {
            addCriterion("originalinstitution_phone =", value, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneNotEqualTo(String value) {
            addCriterion("originalinstitution_phone <>", value, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneGreaterThan(String value) {
            addCriterion("originalinstitution_phone >", value, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("originalinstitution_phone >=", value, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneLessThan(String value) {
            addCriterion("originalinstitution_phone <", value, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneLessThanOrEqualTo(String value) {
            addCriterion("originalinstitution_phone <=", value, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneLike(String value) {
            addCriterion("originalinstitution_phone like", value, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneNotLike(String value) {
            addCriterion("originalinstitution_phone not like", value, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneIn(List<String> values) {
            addCriterion("originalinstitution_phone in", values, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneNotIn(List<String> values) {
            addCriterion("originalinstitution_phone not in", values, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneBetween(String value1, String value2) {
            addCriterion("originalinstitution_phone between", value1, value2, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionPhoneNotBetween(String value1, String value2) {
            addCriterion("originalinstitution_phone not between", value1, value2, "originalinstitutionPhone");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameIsNull() {
            addCriterion("originalinstitution_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameIsNotNull() {
            addCriterion("originalinstitution_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameEqualTo(String value) {
            addCriterion("originalinstitution_name =", value, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameNotEqualTo(String value) {
            addCriterion("originalinstitution_name <>", value, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameGreaterThan(String value) {
            addCriterion("originalinstitution_name >", value, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("originalinstitution_name >=", value, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameLessThan(String value) {
            addCriterion("originalinstitution_name <", value, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameLessThanOrEqualTo(String value) {
            addCriterion("originalinstitution_name <=", value, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameLike(String value) {
            addCriterion("originalinstitution_name like", value, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameNotLike(String value) {
            addCriterion("originalinstitution_name not like", value, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameIn(List<String> values) {
            addCriterion("originalinstitution_name in", values, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameNotIn(List<String> values) {
            addCriterion("originalinstitution_name not in", values, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameBetween(String value1, String value2) {
            addCriterion("originalinstitution_name between", value1, value2, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andOriginalinstitutionNameNotBetween(String value1, String value2) {
            addCriterion("originalinstitution_name not between", value1, value2, "originalinstitutionName");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksIsNull() {
            addCriterion("partymem_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksIsNotNull() {
            addCriterion("partymem_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksEqualTo(String value) {
            addCriterion("partymem_remarks =", value, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksNotEqualTo(String value) {
            addCriterion("partymem_remarks <>", value, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksGreaterThan(String value) {
            addCriterion("partymem_remarks >", value, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("partymem_remarks >=", value, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksLessThan(String value) {
            addCriterion("partymem_remarks <", value, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksLessThanOrEqualTo(String value) {
            addCriterion("partymem_remarks <=", value, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksLike(String value) {
            addCriterion("partymem_remarks like", value, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksNotLike(String value) {
            addCriterion("partymem_remarks not like", value, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksIn(List<String> values) {
            addCriterion("partymem_remarks in", values, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksNotIn(List<String> values) {
            addCriterion("partymem_remarks not in", values, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksBetween(String value1, String value2) {
            addCriterion("partymem_remarks between", value1, value2, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPartymemRemarksNotBetween(String value1, String value2) {
            addCriterion("partymem_remarks not between", value1, value2, "partymemRemarks");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIsNull() {
            addCriterion("education_level is null");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIsNotNull() {
            addCriterion("education_level is not null");
            return (Criteria) this;
        }

        public Criteria andEducationLevelEqualTo(String value) {
            addCriterion("education_level =", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotEqualTo(String value) {
            addCriterion("education_level <>", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelGreaterThan(String value) {
            addCriterion("education_level >", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelGreaterThanOrEqualTo(String value) {
            addCriterion("education_level >=", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLessThan(String value) {
            addCriterion("education_level <", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLessThanOrEqualTo(String value) {
            addCriterion("education_level <=", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLike(String value) {
            addCriterion("education_level like", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotLike(String value) {
            addCriterion("education_level not like", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIn(List<String> values) {
            addCriterion("education_level in", values, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotIn(List<String> values) {
            addCriterion("education_level not in", values, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelBetween(String value1, String value2) {
            addCriterion("education_level between", value1, value2, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotBetween(String value1, String value2) {
            addCriterion("education_level not between", value1, value2, "educationLevel");
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
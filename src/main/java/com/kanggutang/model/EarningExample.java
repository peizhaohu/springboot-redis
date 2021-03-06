package com.kanggutang.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EarningExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table earning
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table earning
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table earning
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public EarningExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table earning
     *
     * @mbggenerated
     */
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

        public Criteria andEarningIdIsNull() {
            addCriterion("EARNING_ID is null");
            return (Criteria) this;
        }

        public Criteria andEarningIdIsNotNull() {
            addCriterion("EARNING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEarningIdEqualTo(Integer value) {
            addCriterion("EARNING_ID =", value, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdNotEqualTo(Integer value) {
            addCriterion("EARNING_ID <>", value, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdGreaterThan(Integer value) {
            addCriterion("EARNING_ID >", value, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EARNING_ID >=", value, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdLessThan(Integer value) {
            addCriterion("EARNING_ID <", value, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdLessThanOrEqualTo(Integer value) {
            addCriterion("EARNING_ID <=", value, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdIn(List<Integer> values) {
            addCriterion("EARNING_ID in", values, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdNotIn(List<Integer> values) {
            addCriterion("EARNING_ID not in", values, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdBetween(Integer value1, Integer value2) {
            addCriterion("EARNING_ID between", value1, value2, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EARNING_ID not between", value1, value2, "earningId");
            return (Criteria) this;
        }

        public Criteria andEarningTypeIsNull() {
            addCriterion("EARNING_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEarningTypeIsNotNull() {
            addCriterion("EARNING_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEarningTypeEqualTo(Integer value) {
            addCriterion("EARNING_TYPE =", value, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeNotEqualTo(Integer value) {
            addCriterion("EARNING_TYPE <>", value, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeGreaterThan(Integer value) {
            addCriterion("EARNING_TYPE >", value, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("EARNING_TYPE >=", value, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeLessThan(Integer value) {
            addCriterion("EARNING_TYPE <", value, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeLessThanOrEqualTo(Integer value) {
            addCriterion("EARNING_TYPE <=", value, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeIn(List<Integer> values) {
            addCriterion("EARNING_TYPE in", values, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeNotIn(List<Integer> values) {
            addCriterion("EARNING_TYPE not in", values, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeBetween(Integer value1, Integer value2) {
            addCriterion("EARNING_TYPE between", value1, value2, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("EARNING_TYPE not between", value1, value2, "earningType");
            return (Criteria) this;
        }

        public Criteria andEarningNameIsNull() {
            addCriterion("EARNING_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEarningNameIsNotNull() {
            addCriterion("EARNING_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEarningNameEqualTo(String value) {
            addCriterion("EARNING_NAME =", value, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameNotEqualTo(String value) {
            addCriterion("EARNING_NAME <>", value, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameGreaterThan(String value) {
            addCriterion("EARNING_NAME >", value, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameGreaterThanOrEqualTo(String value) {
            addCriterion("EARNING_NAME >=", value, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameLessThan(String value) {
            addCriterion("EARNING_NAME <", value, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameLessThanOrEqualTo(String value) {
            addCriterion("EARNING_NAME <=", value, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameLike(String value) {
            addCriterion("EARNING_NAME like", value, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameNotLike(String value) {
            addCriterion("EARNING_NAME not like", value, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameIn(List<String> values) {
            addCriterion("EARNING_NAME in", values, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameNotIn(List<String> values) {
            addCriterion("EARNING_NAME not in", values, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameBetween(String value1, String value2) {
            addCriterion("EARNING_NAME between", value1, value2, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningNameNotBetween(String value1, String value2) {
            addCriterion("EARNING_NAME not between", value1, value2, "earningName");
            return (Criteria) this;
        }

        public Criteria andEarningAmountIsNull() {
            addCriterion("EARNING_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andEarningAmountIsNotNull() {
            addCriterion("EARNING_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEarningAmountEqualTo(BigDecimal value) {
            addCriterion("EARNING_AMOUNT =", value, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountNotEqualTo(BigDecimal value) {
            addCriterion("EARNING_AMOUNT <>", value, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountGreaterThan(BigDecimal value) {
            addCriterion("EARNING_AMOUNT >", value, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EARNING_AMOUNT >=", value, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountLessThan(BigDecimal value) {
            addCriterion("EARNING_AMOUNT <", value, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EARNING_AMOUNT <=", value, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountIn(List<BigDecimal> values) {
            addCriterion("EARNING_AMOUNT in", values, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountNotIn(List<BigDecimal> values) {
            addCriterion("EARNING_AMOUNT not in", values, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EARNING_AMOUNT between", value1, value2, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andEarningAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EARNING_AMOUNT not between", value1, value2, "earningAmount");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("`YEAR` is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("`YEAR` is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("`YEAR` =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("`YEAR` <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("`YEAR` >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("`YEAR` >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("`YEAR` <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("`YEAR` <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("`YEAR` in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("`YEAR` not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("`YEAR` between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("`YEAR` not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("`MONTH` is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("`MONTH` is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("`MONTH` =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("`MONTH` <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("`MONTH` >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("`MONTH` >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("`MONTH` <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("`MONTH` <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("`MONTH` in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("`MONTH` not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("`MONTH` between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("`MONTH` not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("`DAY` is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("`DAY` is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("`DAY` =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("`DAY` <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("`DAY` >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("`DAY` >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("`DAY` <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("`DAY` <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("`DAY` in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("`DAY` not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("`DAY` between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("`DAY` not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("CREATION_DATE =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("CREATION_DATE in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("CREATION_DATE not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNull() {
            addCriterion("LAST_UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNotNull() {
            addCriterion("LAST_UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByEqualTo(Integer value) {
            addCriterion("LAST_UPDATED_BY =", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotEqualTo(Integer value) {
            addCriterion("LAST_UPDATED_BY <>", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThan(Integer value) {
            addCriterion("LAST_UPDATED_BY >", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_UPDATED_BY >=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThan(Integer value) {
            addCriterion("LAST_UPDATED_BY <", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_UPDATED_BY <=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIn(List<Integer> values) {
            addCriterion("LAST_UPDATED_BY in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotIn(List<Integer> values) {
            addCriterion("LAST_UPDATED_BY not in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByBetween(Integer value1, Integer value2) {
            addCriterion("LAST_UPDATED_BY between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_UPDATED_BY not between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table earning
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table earning
     *
     * @mbggenerated
     */
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
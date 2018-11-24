package com.kanggutang.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseSubCategoriesDataInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    public BaseSubCategoriesDataInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
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
     * This method corresponds to the database table base_sub_categories_data_info
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
     * This method corresponds to the database table base_sub_categories_data_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_sub_categories_data_info
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
     * This class corresponds to the database table base_sub_categories_data_info
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

        public Criteria andSubCategoriesDataInfoIdIsNull() {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdIsNotNull() {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdEqualTo(Integer value) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID =", value, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdNotEqualTo(Integer value) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID <>", value, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdGreaterThan(Integer value) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID >", value, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID >=", value, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdLessThan(Integer value) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID <", value, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID <=", value, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdIn(List<Integer> values) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID in", values, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdNotIn(List<Integer> values) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID not in", values, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID between", value1, value2, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andSubCategoriesDataInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUB_CATEGORIES_DATA_INFO_ID not between", value1, value2, "subCategoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdIsNull() {
            addCriterion("CATEGORIES_DATA_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdIsNotNull() {
            addCriterion("CATEGORIES_DATA_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdEqualTo(Integer value) {
            addCriterion("CATEGORIES_DATA_INFO_ID =", value, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdNotEqualTo(Integer value) {
            addCriterion("CATEGORIES_DATA_INFO_ID <>", value, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdGreaterThan(Integer value) {
            addCriterion("CATEGORIES_DATA_INFO_ID >", value, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORIES_DATA_INFO_ID >=", value, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdLessThan(Integer value) {
            addCriterion("CATEGORIES_DATA_INFO_ID <", value, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORIES_DATA_INFO_ID <=", value, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdIn(List<Integer> values) {
            addCriterion("CATEGORIES_DATA_INFO_ID in", values, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdNotIn(List<Integer> values) {
            addCriterion("CATEGORIES_DATA_INFO_ID not in", values, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORIES_DATA_INFO_ID between", value1, value2, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesDataInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORIES_DATA_INFO_ID not between", value1, value2, "categoriesDataInfoId");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeIsNull() {
            addCriterion("CATEGORIES_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeIsNotNull() {
            addCriterion("CATEGORIES_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeEqualTo(String value) {
            addCriterion("CATEGORIES_CODE =", value, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeNotEqualTo(String value) {
            addCriterion("CATEGORIES_CODE <>", value, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeGreaterThan(String value) {
            addCriterion("CATEGORIES_CODE >", value, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORIES_CODE >=", value, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeLessThan(String value) {
            addCriterion("CATEGORIES_CODE <", value, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeLessThanOrEqualTo(String value) {
            addCriterion("CATEGORIES_CODE <=", value, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeLike(String value) {
            addCriterion("CATEGORIES_CODE like", value, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeNotLike(String value) {
            addCriterion("CATEGORIES_CODE not like", value, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeIn(List<String> values) {
            addCriterion("CATEGORIES_CODE in", values, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeNotIn(List<String> values) {
            addCriterion("CATEGORIES_CODE not in", values, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeBetween(String value1, String value2) {
            addCriterion("CATEGORIES_CODE between", value1, value2, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesCodeNotBetween(String value1, String value2) {
            addCriterion("CATEGORIES_CODE not between", value1, value2, "categoriesCode");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueIsNull() {
            addCriterion("CATEGORIES_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueIsNotNull() {
            addCriterion("CATEGORIES_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueEqualTo(String value) {
            addCriterion("CATEGORIES_VALUE =", value, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueNotEqualTo(String value) {
            addCriterion("CATEGORIES_VALUE <>", value, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueGreaterThan(String value) {
            addCriterion("CATEGORIES_VALUE >", value, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORIES_VALUE >=", value, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueLessThan(String value) {
            addCriterion("CATEGORIES_VALUE <", value, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueLessThanOrEqualTo(String value) {
            addCriterion("CATEGORIES_VALUE <=", value, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueLike(String value) {
            addCriterion("CATEGORIES_VALUE like", value, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueNotLike(String value) {
            addCriterion("CATEGORIES_VALUE not like", value, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueIn(List<String> values) {
            addCriterion("CATEGORIES_VALUE in", values, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueNotIn(List<String> values) {
            addCriterion("CATEGORIES_VALUE not in", values, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueBetween(String value1, String value2) {
            addCriterion("CATEGORIES_VALUE between", value1, value2, "categoriesValue");
            return (Criteria) this;
        }

        public Criteria andCategoriesValueNotBetween(String value1, String value2) {
            addCriterion("CATEGORIES_VALUE not between", value1, value2, "categoriesValue");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table base_sub_categories_data_info
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
     * This class corresponds to the database table base_sub_categories_data_info
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
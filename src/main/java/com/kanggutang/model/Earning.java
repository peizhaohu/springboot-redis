package com.kanggutang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Earning implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.EARNING_ID
     *
     * @mbggenerated
     */
    private Integer earningId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.EARNING_TYPE
     *
     * @mbggenerated
     */
    private Integer earningType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.EARNING_NAME
     *
     * @mbggenerated
     */
    private String earningName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.EARNING_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal earningAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.YEAR
     *
     * @mbggenerated
     */
    private Integer year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.MONTH
     *
     * @mbggenerated
     */
    private Integer month;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.DAY
     *
     * @mbggenerated
     */
    private Integer day;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.CREATION_DATE
     *
     * @mbggenerated
     */
    private Date creationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.CREATED_BY
     *
     * @mbggenerated
     */
    private Integer createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.LAST_UPDATE_DATE
     *
     * @mbggenerated
     */
    private Date lastUpdateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.LAST_UPDATED_BY
     *
     * @mbggenerated
     */
    private Integer lastUpdatedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table earning
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.EARNING_ID
     *
     * @return the value of earning.EARNING_ID
     *
     * @mbggenerated
     */
    public Integer getEarningId() {
        return earningId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.EARNING_ID
     *
     * @param earningId the value for earning.EARNING_ID
     *
     * @mbggenerated
     */
    public void setEarningId(Integer earningId) {
        this.earningId = earningId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.EARNING_TYPE
     *
     * @return the value of earning.EARNING_TYPE
     *
     * @mbggenerated
     */
    public Integer getEarningType() {
        return earningType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.EARNING_TYPE
     *
     * @param earningType the value for earning.EARNING_TYPE
     *
     * @mbggenerated
     */
    public void setEarningType(Integer earningType) {
        this.earningType = earningType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.EARNING_NAME
     *
     * @return the value of earning.EARNING_NAME
     *
     * @mbggenerated
     */
    public String getEarningName() {
        return earningName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.EARNING_NAME
     *
     * @param earningName the value for earning.EARNING_NAME
     *
     * @mbggenerated
     */
    public void setEarningName(String earningName) {
        this.earningName = earningName == null ? null : earningName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.EARNING_AMOUNT
     *
     * @return the value of earning.EARNING_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getEarningAmount() {
        return earningAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.EARNING_AMOUNT
     *
     * @param earningAmount the value for earning.EARNING_AMOUNT
     *
     * @mbggenerated
     */
    public void setEarningAmount(BigDecimal earningAmount) {
        this.earningAmount = earningAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.YEAR
     *
     * @return the value of earning.YEAR
     *
     * @mbggenerated
     */
    public Integer getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.YEAR
     *
     * @param year the value for earning.YEAR
     *
     * @mbggenerated
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.MONTH
     *
     * @return the value of earning.MONTH
     *
     * @mbggenerated
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.MONTH
     *
     * @param month the value for earning.MONTH
     *
     * @mbggenerated
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.DAY
     *
     * @return the value of earning.DAY
     *
     * @mbggenerated
     */
    public Integer getDay() {
        return day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.DAY
     *
     * @param day the value for earning.DAY
     *
     * @mbggenerated
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.REMARK
     *
     * @return the value of earning.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.REMARK
     *
     * @param remark the value for earning.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.CREATION_DATE
     *
     * @return the value of earning.CREATION_DATE
     *
     * @mbggenerated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.CREATION_DATE
     *
     * @param creationDate the value for earning.CREATION_DATE
     *
     * @mbggenerated
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.CREATED_BY
     *
     * @return the value of earning.CREATED_BY
     *
     * @mbggenerated
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.CREATED_BY
     *
     * @param createdBy the value for earning.CREATED_BY
     *
     * @mbggenerated
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.LAST_UPDATE_DATE
     *
     * @return the value of earning.LAST_UPDATE_DATE
     *
     * @mbggenerated
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.LAST_UPDATE_DATE
     *
     * @param lastUpdateDate the value for earning.LAST_UPDATE_DATE
     *
     * @mbggenerated
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.LAST_UPDATED_BY
     *
     * @return the value of earning.LAST_UPDATED_BY
     *
     * @mbggenerated
     */
    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.LAST_UPDATED_BY
     *
     * @param lastUpdatedBy the value for earning.LAST_UPDATED_BY
     *
     * @mbggenerated
     */
    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", earningId=").append(earningId);
        sb.append(", earningType=").append(earningType);
        sb.append(", earningName=").append(earningName);
        sb.append(", earningAmount=").append(earningAmount);
        sb.append(", year=").append(year);
        sb.append(", month=").append(month);
        sb.append(", day=").append(day);
        sb.append(", remark=").append(remark);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", lastUpdatedBy=").append(lastUpdatedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
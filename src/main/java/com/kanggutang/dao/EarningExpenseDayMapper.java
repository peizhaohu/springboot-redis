package com.kanggutang.dao;

import com.kanggutang.model.EarningExpenseDay;
import com.kanggutang.model.EarningExpenseDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EarningExpenseDayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int countByExample(EarningExpenseDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int deleteByExample(EarningExpenseDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer earningExpenseDayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int insert(EarningExpenseDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int insertSelective(EarningExpenseDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    List<EarningExpenseDay> selectByExample(EarningExpenseDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    EarningExpenseDay selectByPrimaryKey(Integer earningExpenseDayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") EarningExpenseDay record, @Param("example") EarningExpenseDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") EarningExpenseDay record, @Param("example") EarningExpenseDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EarningExpenseDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_day
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(EarningExpenseDay record);
}
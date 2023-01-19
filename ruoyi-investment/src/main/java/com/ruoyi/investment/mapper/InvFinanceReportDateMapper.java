package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceReportDate;

/**
 * 财务分析-报告日期Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface InvFinanceReportDateMapper {
    /**
     * 查询财务分析-报告日期
     * 
     * @param id 财务分析-报告日期主键
     * @return 财务分析-报告日期
     */
    public InvFinanceReportDate selectInvFinanceReportDateById(Integer id);

    /**
     * 查询财务分析-报告日期列表
     * 
     * @param invFinanceReportDate 财务分析-报告日期
     * @return 财务分析-报告日期集合
     */
    public List<InvFinanceReportDate> selectInvFinanceReportDateList(InvFinanceReportDate invFinanceReportDate);

    /**
     * 新增财务分析-报告日期
     * 
     * @param invFinanceReportDate 财务分析-报告日期
     * @return 结果
     */
    public int insertInvFinanceReportDate(InvFinanceReportDate invFinanceReportDate);

    /**
     * 修改财务分析-报告日期
     * 
     * @param invFinanceReportDate 财务分析-报告日期
     * @return 结果
     */
    public int updateInvFinanceReportDate(InvFinanceReportDate invFinanceReportDate);

    /**
     * 删除财务分析-报告日期
     * 
     * @param id 财务分析-报告日期主键
     * @return 结果
     */
    public int deleteInvFinanceReportDateById(Integer id);

    /**
     * 批量删除财务分析-报告日期
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceReportDateByIds(String[] ids);
}

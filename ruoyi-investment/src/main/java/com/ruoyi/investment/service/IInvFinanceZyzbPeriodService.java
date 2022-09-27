package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZyzbPeriod;

/**
 * 财务分析-重要指标-报告期Service接口
 * 
 * @author ruoyi
 * @date 2022-09-26
 */
public interface IInvFinanceZyzbPeriodService 
{
    /**
     * 查询财务分析-重要指标-报告期
     * 
     * @param id 财务分析-重要指标-报告期主键
     * @return 财务分析-重要指标-报告期
     */
    public InvFinanceZyzbPeriod selectInvFinanceZyzbPeriodById(Long id);

    /**
     * 查询财务分析-重要指标-报告期列表
     * 
     * @param invFinanceZyzbPeriod 财务分析-重要指标-报告期
     * @return 财务分析-重要指标-报告期集合
     */
    public List<InvFinanceZyzbPeriod> selectInvFinanceZyzbPeriodList(InvFinanceZyzbPeriod invFinanceZyzbPeriod);

    /**
     * 新增财务分析-重要指标-报告期
     * 
     * @param invFinanceZyzbPeriod 财务分析-重要指标-报告期
     * @return 结果
     */
    public int insertInvFinanceZyzbPeriod(InvFinanceZyzbPeriod invFinanceZyzbPeriod);

    /**
     * 修改财务分析-重要指标-报告期
     * 
     * @param invFinanceZyzbPeriod 财务分析-重要指标-报告期
     * @return 结果
     */
    public int updateInvFinanceZyzbPeriod(InvFinanceZyzbPeriod invFinanceZyzbPeriod);

    /**
     * 批量删除财务分析-重要指标-报告期
     * 
     * @param ids 需要删除的财务分析-重要指标-报告期主键集合
     * @return 结果
     */
    public int deleteInvFinanceZyzbPeriodByIds(String ids);

    /**
     * 删除财务分析-重要指标-报告期信息
     * 
     * @param id 财务分析-重要指标-报告期主键
     * @return 结果
     */
    public int deleteInvFinanceZyzbPeriodById(Long id);
}

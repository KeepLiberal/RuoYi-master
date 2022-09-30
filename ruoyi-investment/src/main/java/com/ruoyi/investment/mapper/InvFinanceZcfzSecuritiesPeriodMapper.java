package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZcfzSecuritiesPeriod;

/**
 * 财务分析-资产负债-证劵类-报告期Mapper接口
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
public interface InvFinanceZcfzSecuritiesPeriodMapper 
{
    /**
     * 查询财务分析-资产负债-证劵类-报告期
     * 
     * @param id 财务分析-资产负债-证劵类-报告期主键
     * @return 财务分析-资产负债-证劵类-报告期
     */
    public InvFinanceZcfzSecuritiesPeriod selectInvFinanceZcfzSecuritiesPeriodById(Long id);

    /**
     * 查询财务分析-资产负债-证劵类-报告期列表
     * 
     * @param invFinanceZcfzSecuritiesPeriod 财务分析-资产负债-证劵类-报告期
     * @return 财务分析-资产负债-证劵类-报告期集合
     */
    public List<InvFinanceZcfzSecuritiesPeriod> selectInvFinanceZcfzSecuritiesPeriodList(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod);

    /**
     * 新增财务分析-资产负债-证劵类-报告期
     * 
     * @param invFinanceZcfzSecuritiesPeriod 财务分析-资产负债-证劵类-报告期
     * @return 结果
     */
    public int insertInvFinanceZcfzSecuritiesPeriod(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod);

    /**
     * 修改财务分析-资产负债-证劵类-报告期
     * 
     * @param invFinanceZcfzSecuritiesPeriod 财务分析-资产负债-证劵类-报告期
     * @return 结果
     */
    public int updateInvFinanceZcfzSecuritiesPeriod(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod);

    /**
     * 删除财务分析-资产负债-证劵类-报告期
     * 
     * @param id 财务分析-资产负债-证劵类-报告期主键
     * @return 结果
     */
    public int deleteInvFinanceZcfzSecuritiesPeriodById(Long id);

    /**
     * 批量删除财务分析-资产负债-证劵类-报告期
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceZcfzSecuritiesPeriodByIds(String[] ids);
}

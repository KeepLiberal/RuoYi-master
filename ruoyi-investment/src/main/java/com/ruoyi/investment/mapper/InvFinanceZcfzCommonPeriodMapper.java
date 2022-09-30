package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZcfzCommonPeriod;

/**
 * 财务分析-资产负债-普通类-报告期Mapper接口
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
public interface InvFinanceZcfzCommonPeriodMapper 
{
    /**
     * 查询财务分析-资产负债-普通类-报告期
     * 
     * @param id 财务分析-资产负债-普通类-报告期主键
     * @return 财务分析-资产负债-普通类-报告期
     */
    public InvFinanceZcfzCommonPeriod selectInvFinanceZcfzCommonPeriodById(Long id);

    /**
     * 查询财务分析-资产负债-普通类-报告期列表
     * 
     * @param invFinanceZcfzCommonPeriod 财务分析-资产负债-普通类-报告期
     * @return 财务分析-资产负债-普通类-报告期集合
     */
    public List<InvFinanceZcfzCommonPeriod> selectInvFinanceZcfzCommonPeriodList(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod);

    /**
     * 新增财务分析-资产负债-普通类-报告期
     * 
     * @param invFinanceZcfzCommonPeriod 财务分析-资产负债-普通类-报告期
     * @return 结果
     */
    public int insertInvFinanceZcfzCommonPeriod(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod);

    /**
     * 修改财务分析-资产负债-普通类-报告期
     * 
     * @param invFinanceZcfzCommonPeriod 财务分析-资产负债-普通类-报告期
     * @return 结果
     */
    public int updateInvFinanceZcfzCommonPeriod(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod);

    /**
     * 删除财务分析-资产负债-普通类-报告期
     * 
     * @param id 财务分析-资产负债-普通类-报告期主键
     * @return 结果
     */
    public int deleteInvFinanceZcfzCommonPeriodById(Long id);

    /**
     * 批量删除财务分析-资产负债-普通类-报告期
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceZcfzCommonPeriodByIds(String[] ids);
}

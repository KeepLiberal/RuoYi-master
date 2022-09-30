package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZcfzBankPeriod;

/**
 * 财务分析-资产负债-银行类-报告期Mapper接口
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
public interface InvFinanceZcfzBankPeriodMapper 
{
    /**
     * 查询财务分析-资产负债-银行类-报告期
     * 
     * @param id 财务分析-资产负债-银行类-报告期主键
     * @return 财务分析-资产负债-银行类-报告期
     */
    public InvFinanceZcfzBankPeriod selectInvFinanceZcfzBankPeriodById(Long id);

    /**
     * 查询财务分析-资产负债-银行类-报告期列表
     * 
     * @param invFinanceZcfzBankPeriod 财务分析-资产负债-银行类-报告期
     * @return 财务分析-资产负债-银行类-报告期集合
     */
    public List<InvFinanceZcfzBankPeriod> selectInvFinanceZcfzBankPeriodList(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod);

    /**
     * 新增财务分析-资产负债-银行类-报告期
     * 
     * @param invFinanceZcfzBankPeriod 财务分析-资产负债-银行类-报告期
     * @return 结果
     */
    public int insertInvFinanceZcfzBankPeriod(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod);

    /**
     * 修改财务分析-资产负债-银行类-报告期
     * 
     * @param invFinanceZcfzBankPeriod 财务分析-资产负债-银行类-报告期
     * @return 结果
     */
    public int updateInvFinanceZcfzBankPeriod(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod);

    /**
     * 删除财务分析-资产负债-银行类-报告期
     * 
     * @param id 财务分析-资产负债-银行类-报告期主键
     * @return 结果
     */
    public int deleteInvFinanceZcfzBankPeriodById(Long id);

    /**
     * 批量删除财务分析-资产负债-银行类-报告期
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceZcfzBankPeriodByIds(String[] ids);
}

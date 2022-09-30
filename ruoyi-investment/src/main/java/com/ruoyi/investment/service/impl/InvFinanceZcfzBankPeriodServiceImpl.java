package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZcfzBankPeriodMapper;
import com.ruoyi.investment.domain.InvFinanceZcfzBankPeriod;
import com.ruoyi.investment.service.IInvFinanceZcfzBankPeriodService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-资产负债-银行类-报告期Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
@Service
public class InvFinanceZcfzBankPeriodServiceImpl implements IInvFinanceZcfzBankPeriodService 
{
    @Autowired
    private InvFinanceZcfzBankPeriodMapper invFinanceZcfzBankPeriodMapper;

    /**
     * 查询财务分析-资产负债-银行类-报告期
     * 
     * @param id 财务分析-资产负债-银行类-报告期主键
     * @return 财务分析-资产负债-银行类-报告期
     */
    @Override
    public InvFinanceZcfzBankPeriod selectInvFinanceZcfzBankPeriodById(Long id)
    {
        return invFinanceZcfzBankPeriodMapper.selectInvFinanceZcfzBankPeriodById(id);
    }

    /**
     * 查询财务分析-资产负债-银行类-报告期列表
     * 
     * @param invFinanceZcfzBankPeriod 财务分析-资产负债-银行类-报告期
     * @return 财务分析-资产负债-银行类-报告期
     */
    @Override
    public List<InvFinanceZcfzBankPeriod> selectInvFinanceZcfzBankPeriodList(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod)
    {
        return invFinanceZcfzBankPeriodMapper.selectInvFinanceZcfzBankPeriodList(invFinanceZcfzBankPeriod);
    }

    /**
     * 新增财务分析-资产负债-银行类-报告期
     * 
     * @param invFinanceZcfzBankPeriod 财务分析-资产负债-银行类-报告期
     * @return 结果
     */
    @Override
    public int insertInvFinanceZcfzBankPeriod(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod)
    {
        return invFinanceZcfzBankPeriodMapper.insertInvFinanceZcfzBankPeriod(invFinanceZcfzBankPeriod);
    }

    /**
     * 修改财务分析-资产负债-银行类-报告期
     * 
     * @param invFinanceZcfzBankPeriod 财务分析-资产负债-银行类-报告期
     * @return 结果
     */
    @Override
    public int updateInvFinanceZcfzBankPeriod(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod)
    {
        return invFinanceZcfzBankPeriodMapper.updateInvFinanceZcfzBankPeriod(invFinanceZcfzBankPeriod);
    }

    /**
     * 批量删除财务分析-资产负债-银行类-报告期
     * 
     * @param ids 需要删除的财务分析-资产负债-银行类-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzBankPeriodByIds(String ids)
    {
        return invFinanceZcfzBankPeriodMapper.deleteInvFinanceZcfzBankPeriodByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-资产负债-银行类-报告期信息
     * 
     * @param id 财务分析-资产负债-银行类-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzBankPeriodById(Long id)
    {
        return invFinanceZcfzBankPeriodMapper.deleteInvFinanceZcfzBankPeriodById(id);
    }
}

package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZcfzSecuritiesPeriodMapper;
import com.ruoyi.investment.domain.InvFinanceZcfzSecuritiesPeriod;
import com.ruoyi.investment.service.IInvFinanceZcfzSecuritiesPeriodService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-资产负债-证劵类-报告期Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
@Service
public class InvFinanceZcfzSecuritiesPeriodServiceImpl implements IInvFinanceZcfzSecuritiesPeriodService 
{
    @Autowired
    private InvFinanceZcfzSecuritiesPeriodMapper invFinanceZcfzSecuritiesPeriodMapper;

    /**
     * 查询财务分析-资产负债-证劵类-报告期
     * 
     * @param id 财务分析-资产负债-证劵类-报告期主键
     * @return 财务分析-资产负债-证劵类-报告期
     */
    @Override
    public InvFinanceZcfzSecuritiesPeriod selectInvFinanceZcfzSecuritiesPeriodById(Long id)
    {
        return invFinanceZcfzSecuritiesPeriodMapper.selectInvFinanceZcfzSecuritiesPeriodById(id);
    }

    /**
     * 查询财务分析-资产负债-证劵类-报告期列表
     * 
     * @param invFinanceZcfzSecuritiesPeriod 财务分析-资产负债-证劵类-报告期
     * @return 财务分析-资产负债-证劵类-报告期
     */
    @Override
    public List<InvFinanceZcfzSecuritiesPeriod> selectInvFinanceZcfzSecuritiesPeriodList(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod)
    {
        return invFinanceZcfzSecuritiesPeriodMapper.selectInvFinanceZcfzSecuritiesPeriodList(invFinanceZcfzSecuritiesPeriod);
    }

    /**
     * 新增财务分析-资产负债-证劵类-报告期
     * 
     * @param invFinanceZcfzSecuritiesPeriod 财务分析-资产负债-证劵类-报告期
     * @return 结果
     */
    @Override
    public int insertInvFinanceZcfzSecuritiesPeriod(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod)
    {
        return invFinanceZcfzSecuritiesPeriodMapper.insertInvFinanceZcfzSecuritiesPeriod(invFinanceZcfzSecuritiesPeriod);
    }

    /**
     * 修改财务分析-资产负债-证劵类-报告期
     * 
     * @param invFinanceZcfzSecuritiesPeriod 财务分析-资产负债-证劵类-报告期
     * @return 结果
     */
    @Override
    public int updateInvFinanceZcfzSecuritiesPeriod(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod)
    {
        return invFinanceZcfzSecuritiesPeriodMapper.updateInvFinanceZcfzSecuritiesPeriod(invFinanceZcfzSecuritiesPeriod);
    }

    /**
     * 批量删除财务分析-资产负债-证劵类-报告期
     * 
     * @param ids 需要删除的财务分析-资产负债-证劵类-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzSecuritiesPeriodByIds(String ids)
    {
        return invFinanceZcfzSecuritiesPeriodMapper.deleteInvFinanceZcfzSecuritiesPeriodByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-资产负债-证劵类-报告期信息
     * 
     * @param id 财务分析-资产负债-证劵类-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzSecuritiesPeriodById(Long id)
    {
        return invFinanceZcfzSecuritiesPeriodMapper.deleteInvFinanceZcfzSecuritiesPeriodById(id);
    }
}

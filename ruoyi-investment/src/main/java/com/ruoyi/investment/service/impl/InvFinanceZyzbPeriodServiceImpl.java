package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZyzbPeriodMapper;
import com.ruoyi.investment.domain.InvFinanceZyzbPeriod;
import com.ruoyi.investment.service.IInvFinanceZyzbPeriodService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-重要指标-报告期Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-26
 */
@Service
public class InvFinanceZyzbPeriodServiceImpl implements IInvFinanceZyzbPeriodService 
{
    @Autowired
    private InvFinanceZyzbPeriodMapper invFinanceZyzbPeriodMapper;

    /**
     * 查询财务分析-重要指标-报告期
     * 
     * @param id 财务分析-重要指标-报告期主键
     * @return 财务分析-重要指标-报告期
     */
    @Override
    public InvFinanceZyzbPeriod selectInvFinanceZyzbPeriodById(Long id)
    {
        return invFinanceZyzbPeriodMapper.selectInvFinanceZyzbPeriodById(id);
    }

    /**
     * 查询财务分析-重要指标-报告期列表
     * 
     * @param invFinanceZyzbPeriod 财务分析-重要指标-报告期
     * @return 财务分析-重要指标-报告期
     */
    @Override
    public List<InvFinanceZyzbPeriod> selectInvFinanceZyzbPeriodList(InvFinanceZyzbPeriod invFinanceZyzbPeriod)
    {
        return invFinanceZyzbPeriodMapper.selectInvFinanceZyzbPeriodList(invFinanceZyzbPeriod);
    }

    /**
     * 新增财务分析-重要指标-报告期
     * 
     * @param invFinanceZyzbPeriod 财务分析-重要指标-报告期
     * @return 结果
     */
    @Override
    public int insertInvFinanceZyzbPeriod(InvFinanceZyzbPeriod invFinanceZyzbPeriod)
    {
        return invFinanceZyzbPeriodMapper.insertInvFinanceZyzbPeriod(invFinanceZyzbPeriod);
    }

    /**
     * 修改财务分析-重要指标-报告期
     * 
     * @param invFinanceZyzbPeriod 财务分析-重要指标-报告期
     * @return 结果
     */
    @Override
    public int updateInvFinanceZyzbPeriod(InvFinanceZyzbPeriod invFinanceZyzbPeriod)
    {
        return invFinanceZyzbPeriodMapper.updateInvFinanceZyzbPeriod(invFinanceZyzbPeriod);
    }

    /**
     * 批量删除财务分析-重要指标-报告期
     * 
     * @param ids 需要删除的财务分析-重要指标-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbPeriodByIds(String ids)
    {
        return invFinanceZyzbPeriodMapper.deleteInvFinanceZyzbPeriodByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-重要指标-报告期信息
     * 
     * @param id 财务分析-重要指标-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbPeriodById(Long id)
    {
        return invFinanceZyzbPeriodMapper.deleteInvFinanceZyzbPeriodById(id);
    }
}

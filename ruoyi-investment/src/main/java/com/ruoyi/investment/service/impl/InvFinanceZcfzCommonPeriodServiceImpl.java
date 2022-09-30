package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZcfzCommonPeriodMapper;
import com.ruoyi.investment.domain.InvFinanceZcfzCommonPeriod;
import com.ruoyi.investment.service.IInvFinanceZcfzCommonPeriodService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-资产负债-普通类-报告期Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
@Service
public class InvFinanceZcfzCommonPeriodServiceImpl implements IInvFinanceZcfzCommonPeriodService 
{
    @Autowired
    private InvFinanceZcfzCommonPeriodMapper invFinanceZcfzCommonPeriodMapper;

    /**
     * 查询财务分析-资产负债-普通类-报告期
     * 
     * @param id 财务分析-资产负债-普通类-报告期主键
     * @return 财务分析-资产负债-普通类-报告期
     */
    @Override
    public InvFinanceZcfzCommonPeriod selectInvFinanceZcfzCommonPeriodById(Long id)
    {
        return invFinanceZcfzCommonPeriodMapper.selectInvFinanceZcfzCommonPeriodById(id);
    }

    /**
     * 查询财务分析-资产负债-普通类-报告期列表
     * 
     * @param invFinanceZcfzCommonPeriod 财务分析-资产负债-普通类-报告期
     * @return 财务分析-资产负债-普通类-报告期
     */
    @Override
    public List<InvFinanceZcfzCommonPeriod> selectInvFinanceZcfzCommonPeriodList(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod)
    {
        return invFinanceZcfzCommonPeriodMapper.selectInvFinanceZcfzCommonPeriodList(invFinanceZcfzCommonPeriod);
    }

    /**
     * 新增财务分析-资产负债-普通类-报告期
     * 
     * @param invFinanceZcfzCommonPeriod 财务分析-资产负债-普通类-报告期
     * @return 结果
     */
    @Override
    public int insertInvFinanceZcfzCommonPeriod(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod)
    {
        return invFinanceZcfzCommonPeriodMapper.insertInvFinanceZcfzCommonPeriod(invFinanceZcfzCommonPeriod);
    }

    /**
     * 修改财务分析-资产负债-普通类-报告期
     * 
     * @param invFinanceZcfzCommonPeriod 财务分析-资产负债-普通类-报告期
     * @return 结果
     */
    @Override
    public int updateInvFinanceZcfzCommonPeriod(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod)
    {
        return invFinanceZcfzCommonPeriodMapper.updateInvFinanceZcfzCommonPeriod(invFinanceZcfzCommonPeriod);
    }

    /**
     * 批量删除财务分析-资产负债-普通类-报告期
     * 
     * @param ids 需要删除的财务分析-资产负债-普通类-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzCommonPeriodByIds(String ids)
    {
        return invFinanceZcfzCommonPeriodMapper.deleteInvFinanceZcfzCommonPeriodByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-资产负债-普通类-报告期信息
     * 
     * @param id 财务分析-资产负债-普通类-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzCommonPeriodById(Long id)
    {
        return invFinanceZcfzCommonPeriodMapper.deleteInvFinanceZcfzCommonPeriodById(id);
    }
}

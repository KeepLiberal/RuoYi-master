package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZcfzInsurancePeriodMapper;
import com.ruoyi.investment.domain.InvFinanceZcfzInsurancePeriod;
import com.ruoyi.investment.service.IInvFinanceZcfzInsurancePeriodService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-资产负债-保险类-报告期Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
@Service
public class InvFinanceZcfzInsurancePeriodServiceImpl implements IInvFinanceZcfzInsurancePeriodService 
{
    @Autowired
    private InvFinanceZcfzInsurancePeriodMapper invFinanceZcfzInsurancePeriodMapper;

    /**
     * 查询财务分析-资产负债-保险类-报告期
     * 
     * @param id 财务分析-资产负债-保险类-报告期主键
     * @return 财务分析-资产负债-保险类-报告期
     */
    @Override
    public InvFinanceZcfzInsurancePeriod selectInvFinanceZcfzInsurancePeriodById(Long id)
    {
        return invFinanceZcfzInsurancePeriodMapper.selectInvFinanceZcfzInsurancePeriodById(id);
    }

    /**
     * 查询财务分析-资产负债-保险类-报告期列表
     * 
     * @param invFinanceZcfzInsurancePeriod 财务分析-资产负债-保险类-报告期
     * @return 财务分析-资产负债-保险类-报告期
     */
    @Override
    public List<InvFinanceZcfzInsurancePeriod> selectInvFinanceZcfzInsurancePeriodList(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod)
    {
        return invFinanceZcfzInsurancePeriodMapper.selectInvFinanceZcfzInsurancePeriodList(invFinanceZcfzInsurancePeriod);
    }

    /**
     * 新增财务分析-资产负债-保险类-报告期
     * 
     * @param invFinanceZcfzInsurancePeriod 财务分析-资产负债-保险类-报告期
     * @return 结果
     */
    @Override
    public int insertInvFinanceZcfzInsurancePeriod(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod)
    {
        return invFinanceZcfzInsurancePeriodMapper.insertInvFinanceZcfzInsurancePeriod(invFinanceZcfzInsurancePeriod);
    }

    /**
     * 修改财务分析-资产负债-保险类-报告期
     * 
     * @param invFinanceZcfzInsurancePeriod 财务分析-资产负债-保险类-报告期
     * @return 结果
     */
    @Override
    public int updateInvFinanceZcfzInsurancePeriod(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod)
    {
        return invFinanceZcfzInsurancePeriodMapper.updateInvFinanceZcfzInsurancePeriod(invFinanceZcfzInsurancePeriod);
    }

    /**
     * 批量删除财务分析-资产负债-保险类-报告期
     * 
     * @param ids 需要删除的财务分析-资产负债-保险类-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzInsurancePeriodByIds(String ids)
    {
        return invFinanceZcfzInsurancePeriodMapper.deleteInvFinanceZcfzInsurancePeriodByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-资产负债-保险类-报告期信息
     * 
     * @param id 财务分析-资产负债-保险类-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzInsurancePeriodById(Long id)
    {
        return invFinanceZcfzInsurancePeriodMapper.deleteInvFinanceZcfzInsurancePeriodById(id);
    }
}

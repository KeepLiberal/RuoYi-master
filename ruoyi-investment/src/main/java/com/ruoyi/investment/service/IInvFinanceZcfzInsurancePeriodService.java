package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZcfzInsurancePeriod;

/**
 * 财务分析-资产负债-保险类-报告期Service接口
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
public interface IInvFinanceZcfzInsurancePeriodService 
{
    /**
     * 查询财务分析-资产负债-保险类-报告期
     * 
     * @param id 财务分析-资产负债-保险类-报告期主键
     * @return 财务分析-资产负债-保险类-报告期
     */
    public InvFinanceZcfzInsurancePeriod selectInvFinanceZcfzInsurancePeriodById(Long id);

    /**
     * 查询财务分析-资产负债-保险类-报告期列表
     * 
     * @param invFinanceZcfzInsurancePeriod 财务分析-资产负债-保险类-报告期
     * @return 财务分析-资产负债-保险类-报告期集合
     */
    public List<InvFinanceZcfzInsurancePeriod> selectInvFinanceZcfzInsurancePeriodList(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod);

    /**
     * 新增财务分析-资产负债-保险类-报告期
     * 
     * @param invFinanceZcfzInsurancePeriod 财务分析-资产负债-保险类-报告期
     * @return 结果
     */
    public int insertInvFinanceZcfzInsurancePeriod(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod);

    /**
     * 修改财务分析-资产负债-保险类-报告期
     * 
     * @param invFinanceZcfzInsurancePeriod 财务分析-资产负债-保险类-报告期
     * @return 结果
     */
    public int updateInvFinanceZcfzInsurancePeriod(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod);

    /**
     * 批量删除财务分析-资产负债-保险类-报告期
     * 
     * @param ids 需要删除的财务分析-资产负债-保险类-报告期主键集合
     * @return 结果
     */
    public int deleteInvFinanceZcfzInsurancePeriodByIds(String ids);

    /**
     * 删除财务分析-资产负债-保险类-报告期信息
     * 
     * @param id 财务分析-资产负债-保险类-报告期主键
     * @return 结果
     */
    public int deleteInvFinanceZcfzInsurancePeriodById(Long id);
}

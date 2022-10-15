package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZcfz;

/**
 * 财务分析-资产负债Service接口
 * 
 * @author yangwenyang
 * @date 2022-10-15
 */
public interface IInvFinanceZcfzService 
{
    /**
     * 查询财务分析-资产负债
     * 
     * @param id 财务分析-资产负债主键
     * @return 财务分析-资产负债
     */
    public InvFinanceZcfz selectInvFinanceZcfzById(Long id);

    /**
     * 查询财务分析-资产负债列表
     * 
     * @param invFinanceZcfz 财务分析-资产负债
     * @return 财务分析-资产负债集合
     */
    public List<InvFinanceZcfz> selectInvFinanceZcfzList(InvFinanceZcfz invFinanceZcfz);

    /**
     * 新增财务分析-资产负债
     * 
     * @param invFinanceZcfz 财务分析-资产负债
     * @return 结果
     */
    public int insertInvFinanceZcfz(InvFinanceZcfz invFinanceZcfz);

    /**
     * 修改财务分析-资产负债
     * 
     * @param invFinanceZcfz 财务分析-资产负债
     * @return 结果
     */
    public int updateInvFinanceZcfz(InvFinanceZcfz invFinanceZcfz);

    /**
     * 批量删除财务分析-资产负债
     * 
     * @param ids 需要删除的财务分析-资产负债主键集合
     * @return 结果
     */
    public int deleteInvFinanceZcfzByIds(String ids);

    /**
     * 删除财务分析-资产负债信息
     * 
     * @param id 财务分析-资产负债主键
     * @return 结果
     */
    public int deleteInvFinanceZcfzById(Long id);
}

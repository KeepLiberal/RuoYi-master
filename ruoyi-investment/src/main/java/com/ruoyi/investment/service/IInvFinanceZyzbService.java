package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZyzb;

/**
 * 财务分析-重要指标Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-09
 */
public interface IInvFinanceZyzbService {
    /**
     * 查询财务分析-重要指标
     * 
     * @param id 财务分析-重要指标主键
     * @return 财务分析-重要指标
     */
    public InvFinanceZyzb selectInvFinanceZyzbById(Long id);

    /**
     * 查询财务分析-重要指标列表
     * 
     * @param invFinanceZyzb 财务分析-重要指标
     * @return 财务分析-重要指标集合
     */
    public List<InvFinanceZyzb> selectInvFinanceZyzbList(InvFinanceZyzb invFinanceZyzb);

    /**
     * 新增财务分析-重要指标
     * 
     * @param invFinanceZyzb 财务分析-重要指标
     * @return 结果
     */
    public int insertInvFinanceZyzb(InvFinanceZyzb invFinanceZyzb);

    /**
     * 修改财务分析-重要指标
     * 
     * @param invFinanceZyzb 财务分析-重要指标
     * @return 结果
     */
    public int updateInvFinanceZyzb(InvFinanceZyzb invFinanceZyzb);

    /**
     * 批量删除财务分析-重要指标
     * 
     * @param ids 需要删除的财务分析-重要指标主键集合
     * @return 结果
     */
    public int deleteInvFinanceZyzbByIds(String ids);

    /**
     * 删除财务分析-重要指标信息
     * 
     * @param id 财务分析-重要指标主键
     * @return 结果
     */
    public int deleteInvFinanceZyzbById(Long id);
}

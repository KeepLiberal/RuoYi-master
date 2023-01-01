package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceBfb;

/**
 * 财务分析-百分比Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-01
 */
public interface IInvFinanceBfbService {
    /**
     * 查询财务分析-百分比
     * 
     * @param id 财务分析-百分比主键
     * @return 财务分析-百分比
     */
    public InvFinanceBfb selectInvFinanceBfbById(Long id);

    /**
     * 查询财务分析-百分比列表
     * 
     * @param invFinanceBfb 财务分析-百分比
     * @return 财务分析-百分比集合
     */
    public List<InvFinanceBfb> selectInvFinanceBfbList(InvFinanceBfb invFinanceBfb);

    /**
     * 新增财务分析-百分比
     * 
     * @param invFinanceBfb 财务分析-百分比
     * @return 结果
     */
    public int insertInvFinanceBfb(InvFinanceBfb invFinanceBfb);

    /**
     * 修改财务分析-百分比
     * 
     * @param invFinanceBfb 财务分析-百分比
     * @return 结果
     */
    public int updateInvFinanceBfb(InvFinanceBfb invFinanceBfb);

    /**
     * 批量删除财务分析-百分比
     * 
     * @param ids 需要删除的财务分析-百分比主键集合
     * @return 结果
     */
    public int deleteInvFinanceBfbByIds(String ids);

    /**
     * 删除财务分析-百分比信息
     * 
     * @param id 财务分析-百分比主键
     * @return 结果
     */
    public int deleteInvFinanceBfbById(Long id);
}

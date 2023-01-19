package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceLr;

/**
 * 财务分析-利润Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface IInvFinanceLrService {
    /**
     * 查询财务分析-利润
     * 
     * @param id 财务分析-利润主键
     * @return 财务分析-利润
     */
    public InvFinanceLr selectInvFinanceLrById(Integer id);

    /**
     * 查询财务分析-利润列表
     * 
     * @param invFinanceLr 财务分析-利润
     * @return 财务分析-利润集合
     */
    public List<InvFinanceLr> selectInvFinanceLrList(InvFinanceLr invFinanceLr);

    /**
     * 新增财务分析-利润
     * 
     * @param invFinanceLr 财务分析-利润
     * @return 结果
     */
    public int insertInvFinanceLr(InvFinanceLr invFinanceLr);

    /**
     * 修改财务分析-利润
     * 
     * @param invFinanceLr 财务分析-利润
     * @return 结果
     */
    public int updateInvFinanceLr(InvFinanceLr invFinanceLr);

    /**
     * 批量删除财务分析-利润
     * 
     * @param ids 需要删除的财务分析-利润主键集合
     * @return 结果
     */
    public int deleteInvFinanceLrByIds(String ids);

    /**
     * 删除财务分析-利润信息
     * 
     * @param id 财务分析-利润主键
     * @return 结果
     */
    public int deleteInvFinanceLrById(Integer id);
}

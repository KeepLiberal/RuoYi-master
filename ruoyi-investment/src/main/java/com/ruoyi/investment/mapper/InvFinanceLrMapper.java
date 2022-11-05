package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceLr;

/**
 * 财务分析-利润Mapper接口
 * 
 * @author yangwenyang
 * @date 2022-11-05
 */
public interface InvFinanceLrMapper 
{
    /**
     * 查询财务分析-利润
     * 
     * @param id 财务分析-利润主键
     * @return 财务分析-利润
     */
    public InvFinanceLr selectInvFinanceLrById(Long id);

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
     * 删除财务分析-利润
     * 
     * @param id 财务分析-利润主键
     * @return 结果
     */
    public int deleteInvFinanceLrById(Long id);

    /**
     * 批量删除财务分析-利润
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceLrByIds(String[] ids);
}

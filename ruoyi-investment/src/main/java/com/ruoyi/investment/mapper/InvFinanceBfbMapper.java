package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceBfb;

/**
 * 财务分析-百分比Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface InvFinanceBfbMapper {
    /**
     * 查询财务分析-百分比
     * 
     * @param id 财务分析-百分比主键
     * @return 财务分析-百分比
     */
    public InvFinanceBfb selectInvFinanceBfbById(Integer id);

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
     * 删除财务分析-百分比
     * 
     * @param id 财务分析-百分比主键
     * @return 结果
     */
    public int deleteInvFinanceBfbById(Integer id);

    /**
     * 批量删除财务分析-百分比
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceBfbByIds(String[] ids);
}

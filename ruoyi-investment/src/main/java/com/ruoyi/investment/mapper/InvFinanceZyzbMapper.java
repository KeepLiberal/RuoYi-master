package com.ruoyi.investment.mapper;

import com.ruoyi.investment.domain.InvFinanceZyzb;

import java.util.List;

/**
 * 财务分析-主要指标Mapper接口
 *
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface InvFinanceZyzbMapper {
    /**
     * 查询财务分析-主要指标
     *
     * @param id 财务分析-主要指标主键
     * @return 财务分析-主要指标
     */
    public InvFinanceZyzb selectInvFinanceZyzbById(Integer id);

    /**
     * 查询财务分析-主要指标列表
     *
     * @param invFinanceZyzb 财务分析-主要指标
     * @return 财务分析-主要指标集合
     */
    public List<InvFinanceZyzb> selectInvFinanceZyzbList(InvFinanceZyzb invFinanceZyzb);

    /**
     * 新增财务分析-主要指标
     *
     * @param invFinanceZyzb 财务分析-主要指标
     * @return 结果
     */
    public int insertInvFinanceZyzb(InvFinanceZyzb invFinanceZyzb);

    /**
     * 修改财务分析-主要指标
     *
     * @param invFinanceZyzb 财务分析-主要指标
     * @return 结果
     */
    public int updateInvFinanceZyzb(InvFinanceZyzb invFinanceZyzb);

    /**
     * 删除财务分析-主要指标
     *
     * @param id 财务分析-主要指标主键
     * @return 结果
     */
    public int deleteInvFinanceZyzbById(Integer id);

    /**
     * 批量删除财务分析-主要指标
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceZyzbByIds(String[] ids);

}

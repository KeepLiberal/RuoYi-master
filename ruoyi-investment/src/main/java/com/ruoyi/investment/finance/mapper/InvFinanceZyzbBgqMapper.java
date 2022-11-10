package com.ruoyi.investment.finance.mapper;

import java.util.List;

import com.ruoyi.investment.finance.domain.InvFinanceZyzbBgq;

/**
 * 财务分析-重要指标-报告期Mapper接口
 *
 * @author yangwenyang
 * @date 2022-11-10
 */
public interface InvFinanceZyzbBgqMapper {
    /**
     * 查询财务分析-重要指标-报告期
     *
     * @param id 财务分析-重要指标-报告期主键
     * @return 财务分析-重要指标-报告期
     */
    public InvFinanceZyzbBgq selectInvFinanceZyzbBgqById(Long id);

    /**
     * 查询财务分析-重要指标-报告期列表
     *
     * @param invFinanceZyzbBgq 财务分析-重要指标-报告期
     * @return 财务分析-重要指标-报告期集合
     */
    public List<InvFinanceZyzbBgq> selectInvFinanceZyzbBgqList(InvFinanceZyzbBgq invFinanceZyzbBgq);

    /**
     * 新增财务分析-重要指标-报告期
     *
     * @param invFinanceZyzbBgq 财务分析-重要指标-报告期
     * @return 结果
     */
    public int insertInvFinanceZyzbBgq(InvFinanceZyzbBgq invFinanceZyzbBgq);

    /**
     * 修改财务分析-重要指标-报告期
     *
     * @param invFinanceZyzbBgq 财务分析-重要指标-报告期
     * @return 结果
     */
    public int updateInvFinanceZyzbBgq(InvFinanceZyzbBgq invFinanceZyzbBgq);

    /**
     * 删除财务分析-重要指标-报告期
     *
     * @param id 财务分析-重要指标-报告期主键
     * @return 结果
     */
    public int deleteInvFinanceZyzbBgqById(Long id);

    /**
     * 批量删除财务分析-重要指标-报告期
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceZyzbBgqByIds(String[] ids);
}

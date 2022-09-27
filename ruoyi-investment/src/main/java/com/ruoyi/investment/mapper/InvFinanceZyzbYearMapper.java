package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZyzbYear;

/**
 * 财务分析-重要指标-年度Mapper接口
 * 
 * @author wenyong.yang
 * @date 2022-09-26
 */
public interface InvFinanceZyzbYearMapper 
{
    /**
     * 查询财务分析-重要指标-年度
     * 
     * @param id 财务分析-重要指标-年度主键
     * @return 财务分析-重要指标-年度
     */
    public InvFinanceZyzbYear selectInvFinanceZyzbYearById(Long id);

    /**
     * 查询财务分析-重要指标-年度列表
     * 
     * @param invFinanceZyzbYear 财务分析-重要指标-年度
     * @return 财务分析-重要指标-年度集合
     */
    public List<InvFinanceZyzbYear> selectInvFinanceZyzbYearList(InvFinanceZyzbYear invFinanceZyzbYear);

    /**
     * 新增财务分析-重要指标-年度
     * 
     * @param invFinanceZyzbYear 财务分析-重要指标-年度
     * @return 结果
     */
    public int insertInvFinanceZyzbYear(InvFinanceZyzbYear invFinanceZyzbYear);

    /**
     * 修改财务分析-重要指标-年度
     * 
     * @param invFinanceZyzbYear 财务分析-重要指标-年度
     * @return 结果
     */
    public int updateInvFinanceZyzbYear(InvFinanceZyzbYear invFinanceZyzbYear);

    /**
     * 删除财务分析-重要指标-年度
     * 
     * @param id 财务分析-重要指标-年度主键
     * @return 结果
     */
    public int deleteInvFinanceZyzbYearById(Long id);

    /**
     * 批量删除财务分析-重要指标-年度
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceZyzbYearByIds(String[] ids);
}

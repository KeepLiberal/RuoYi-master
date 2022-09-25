package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZyzbQuarter;

/**
 * 财务分析-重要指标-季度Mapper接口
 * 
 * @author wenyong.yang
 * @date 2022-09-24
 */
public interface InvFinanceZyzbQuarterMapper 
{
    /**
     * 查询财务分析-重要指标-季度
     * 
     * @param id 财务分析-重要指标-季度主键
     * @return 财务分析-重要指标-季度
     */
    public InvFinanceZyzbQuarter selectInvFinanceZyzbQuarterById(Long id);

    /**
     * 查询财务分析-重要指标-季度列表
     * 
     * @param invFinanceZyzbQuarter 财务分析-重要指标-季度
     * @return 财务分析-重要指标-季度集合
     */
    public List<InvFinanceZyzbQuarter> selectInvFinanceZyzbQuarterList(InvFinanceZyzbQuarter invFinanceZyzbQuarter);

    /**
     * 新增财务分析-重要指标-季度
     * 
     * @param invFinanceZyzbQuarter 财务分析-重要指标-季度
     * @return 结果
     */
    public int insertInvFinanceZyzbQuarter(InvFinanceZyzbQuarter invFinanceZyzbQuarter);

    /**
     * 修改财务分析-重要指标-季度
     * 
     * @param invFinanceZyzbQuarter 财务分析-重要指标-季度
     * @return 结果
     */
    public int updateInvFinanceZyzbQuarter(InvFinanceZyzbQuarter invFinanceZyzbQuarter);

    /**
     * 删除财务分析-重要指标-季度
     * 
     * @param id 财务分析-重要指标-季度主键
     * @return 结果
     */
    public int deleteInvFinanceZyzbQuarterById(Long id);

    /**
     * 批量删除财务分析-重要指标-季度
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceZyzbQuarterByIds(String[] ids);
}

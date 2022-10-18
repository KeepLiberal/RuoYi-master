package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceZcfz;

/**
 * 财务分析-资产负债Mapper接口
 * 
 * @author yangwenyang
 * @date 2022-10-18
 */
public interface InvFinanceZcfzMapper 
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
     * 删除财务分析-资产负债
     * 
     * @param id 财务分析-资产负债主键
     * @return 结果
     */
    public int deleteInvFinanceZcfzById(Long id);

    /**
     * 批量删除财务分析-资产负债
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceZcfzByIds(String[] ids);
}

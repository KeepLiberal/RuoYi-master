package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceXjll;

/**
 * 财务分析-现金流量Mapper接口
 * 
 * @author yangwenyang
 * @date 2022-12-31
 */
public interface InvFinanceXjllMapper {
    /**
     * 查询财务分析-现金流量
     * 
     * @param id 财务分析-现金流量主键
     * @return 财务分析-现金流量
     */
    public InvFinanceXjll selectInvFinanceXjllById(Long id);

    /**
     * 查询财务分析-现金流量列表
     * 
     * @param invFinanceXjll 财务分析-现金流量
     * @return 财务分析-现金流量集合
     */
    public List<InvFinanceXjll> selectInvFinanceXjllList(InvFinanceXjll invFinanceXjll);

    /**
     * 新增财务分析-现金流量
     * 
     * @param invFinanceXjll 财务分析-现金流量
     * @return 结果
     */
    public int insertInvFinanceXjll(InvFinanceXjll invFinanceXjll);

    /**
     * 修改财务分析-现金流量
     * 
     * @param invFinanceXjll 财务分析-现金流量
     * @return 结果
     */
    public int updateInvFinanceXjll(InvFinanceXjll invFinanceXjll);

    /**
     * 删除财务分析-现金流量
     * 
     * @param id 财务分析-现金流量主键
     * @return 结果
     */
    public int deleteInvFinanceXjllById(Long id);

    /**
     * 批量删除财务分析-现金流量
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFinanceXjllByIds(String[] ids);
}

package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceXjll;

/**
 * 财务分析-现金流量Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface IInvFinanceXjllService {
    /**
     * 查询财务分析-现金流量
     * 
     * @param id 财务分析-现金流量主键
     * @return 财务分析-现金流量
     */
    public InvFinanceXjll selectInvFinanceXjllById(Integer id);

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
     * 批量删除财务分析-现金流量
     * 
     * @param ids 需要删除的财务分析-现金流量主键集合
     * @return 结果
     */
    public int deleteInvFinanceXjllByIds(String ids);

    /**
     * 删除财务分析-现金流量信息
     * 
     * @param id 财务分析-现金流量主键
     * @return 结果
     */
    public int deleteInvFinanceXjllById(Integer id);
}

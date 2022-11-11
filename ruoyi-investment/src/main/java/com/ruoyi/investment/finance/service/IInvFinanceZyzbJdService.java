package com.ruoyi.investment.finance.service;

import java.util.List;
import com.ruoyi.investment.finance.domain.InvFinanceZyzbJd;

/**
 * 财务分析-重要指标-季度Service接口
 * 
 * @author yangwenyang
 * @date 2022-11-11
 */
public interface IInvFinanceZyzbJdService {
    /**
     * 查询财务分析-重要指标-季度
     * 
     * @param id 财务分析-重要指标-季度主键
     * @return 财务分析-重要指标-季度
     */
    public InvFinanceZyzbJd selectInvFinanceZyzbJdById(Long id);

    /**
     * 查询财务分析-重要指标-季度列表
     * 
     * @param invFinanceZyzbJd 财务分析-重要指标-季度
     * @return 财务分析-重要指标-季度集合
     */
    public List<InvFinanceZyzbJd> selectInvFinanceZyzbJdList(InvFinanceZyzbJd invFinanceZyzbJd);

    /**
     * 新增财务分析-重要指标-季度
     * 
     * @param invFinanceZyzbJd 财务分析-重要指标-季度
     * @return 结果
     */
    public int insertInvFinanceZyzbJd(InvFinanceZyzbJd invFinanceZyzbJd);

    /**
     * 修改财务分析-重要指标-季度
     * 
     * @param invFinanceZyzbJd 财务分析-重要指标-季度
     * @return 结果
     */
    public int updateInvFinanceZyzbJd(InvFinanceZyzbJd invFinanceZyzbJd);

    /**
     * 批量删除财务分析-重要指标-季度
     * 
     * @param ids 需要删除的财务分析-重要指标-季度主键集合
     * @return 结果
     */
    public int deleteInvFinanceZyzbJdByIds(String ids);

    /**
     * 删除财务分析-重要指标-季度信息
     * 
     * @param id 财务分析-重要指标-季度主键
     * @return 结果
     */
    public int deleteInvFinanceZyzbJdById(Long id);
}

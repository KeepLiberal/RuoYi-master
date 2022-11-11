package com.ruoyi.investment.finance.service;

import java.util.List;
import com.ruoyi.investment.finance.domain.InvFinanceZyzbNd;

/**
 * 财务分析-重要指标-年度Service接口
 * 
 * @author yangwenyang
 * @date 2022-11-11
 */
public interface IInvFinanceZyzbNdService {
    /**
     * 查询财务分析-重要指标-年度
     * 
     * @param id 财务分析-重要指标-年度主键
     * @return 财务分析-重要指标-年度
     */
    public InvFinanceZyzbNd selectInvFinanceZyzbNdById(Long id);

    /**
     * 查询财务分析-重要指标-年度列表
     * 
     * @param invFinanceZyzbNd 财务分析-重要指标-年度
     * @return 财务分析-重要指标-年度集合
     */
    public List<InvFinanceZyzbNd> selectInvFinanceZyzbNdList(InvFinanceZyzbNd invFinanceZyzbNd);

    /**
     * 新增财务分析-重要指标-年度
     * 
     * @param invFinanceZyzbNd 财务分析-重要指标-年度
     * @return 结果
     */
    public int insertInvFinanceZyzbNd(InvFinanceZyzbNd invFinanceZyzbNd);

    /**
     * 修改财务分析-重要指标-年度
     * 
     * @param invFinanceZyzbNd 财务分析-重要指标-年度
     * @return 结果
     */
    public int updateInvFinanceZyzbNd(InvFinanceZyzbNd invFinanceZyzbNd);

    /**
     * 批量删除财务分析-重要指标-年度
     * 
     * @param ids 需要删除的财务分析-重要指标-年度主键集合
     * @return 结果
     */
    public int deleteInvFinanceZyzbNdByIds(String ids);

    /**
     * 删除财务分析-重要指标-年度信息
     * 
     * @param id 财务分析-重要指标-年度主键
     * @return 结果
     */
    public int deleteInvFinanceZyzbNdById(Long id);
}

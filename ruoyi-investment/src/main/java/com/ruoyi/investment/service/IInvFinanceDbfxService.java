package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFinanceDbfx;

/**
 * 财务分析-杜邦分析Service接口
 * 
 * @author yangwenyang
 * @date 2022-10-18
 */
public interface IInvFinanceDbfxService 
{
    /**
     * 查询财务分析-杜邦分析
     * 
     * @param id 财务分析-杜邦分析主键
     * @return 财务分析-杜邦分析
     */
    public InvFinanceDbfx selectInvFinanceDbfxById(Long id);

    /**
     * 查询财务分析-杜邦分析列表
     * 
     * @param invFinanceDbfx 财务分析-杜邦分析
     * @return 财务分析-杜邦分析集合
     */
    public List<InvFinanceDbfx> selectInvFinanceDbfxList(InvFinanceDbfx invFinanceDbfx);

    /**
     * 新增财务分析-杜邦分析
     * 
     * @param invFinanceDbfx 财务分析-杜邦分析
     * @return 结果
     */
    public int insertInvFinanceDbfx(InvFinanceDbfx invFinanceDbfx);

    /**
     * 修改财务分析-杜邦分析
     * 
     * @param invFinanceDbfx 财务分析-杜邦分析
     * @return 结果
     */
    public int updateInvFinanceDbfx(InvFinanceDbfx invFinanceDbfx);

    /**
     * 批量删除财务分析-杜邦分析
     * 
     * @param ids 需要删除的财务分析-杜邦分析主键集合
     * @return 结果
     */
    public int deleteInvFinanceDbfxByIds(String ids);

    /**
     * 删除财务分析-杜邦分析信息
     * 
     * @param id 财务分析-杜邦分析主键
     * @return 结果
     */
    public int deleteInvFinanceDbfxById(Long id);
}

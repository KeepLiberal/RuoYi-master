package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvLhbStockMrtj;

/**
 * 个股龙虎榜统计Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-28
 */
public interface IInvLhbStockMrtjService {
    /**
     * 查询个股龙虎榜统计
     * 
     * @param id 个股龙虎榜统计主键
     * @return 个股龙虎榜统计
     */
    public InvLhbStockMrtj selectInvLhbStockMrtjById(Integer id);

    /**
     * 查询个股龙虎榜统计列表
     * 
     * @param invLhbStockMrtj 个股龙虎榜统计
     * @return 个股龙虎榜统计集合
     */
    public List<InvLhbStockMrtj> selectInvLhbStockMrtjList(InvLhbStockMrtj invLhbStockMrtj);

    /**
     * 新增个股龙虎榜统计
     * 
     * @param invLhbStockMrtj 个股龙虎榜统计
     * @return 结果
     */
    public int insertInvLhbStockMrtj(InvLhbStockMrtj invLhbStockMrtj);

    /**
     * 修改个股龙虎榜统计
     * 
     * @param invLhbStockMrtj 个股龙虎榜统计
     * @return 结果
     */
    public int updateInvLhbStockMrtj(InvLhbStockMrtj invLhbStockMrtj);

    /**
     * 批量删除个股龙虎榜统计
     * 
     * @param ids 需要删除的个股龙虎榜统计主键集合
     * @return 结果
     */
    public int deleteInvLhbStockMrtjByIds(String ids);

    /**
     * 删除个股龙虎榜统计信息
     * 
     * @param id 个股龙虎榜统计主键
     * @return 结果
     */
    public int deleteInvLhbStockMrtjById(Integer id);
}

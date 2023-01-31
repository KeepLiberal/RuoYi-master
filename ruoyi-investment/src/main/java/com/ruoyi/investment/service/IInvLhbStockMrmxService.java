package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvLhbStockMrmx;

/**
 * 个股龙虎榜明细Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-28
 */
public interface IInvLhbStockMrmxService {
    /**
     * 查询个股龙虎榜明细
     * 
     * @param id 个股龙虎榜明细主键
     * @return 个股龙虎榜明细
     */
    public InvLhbStockMrmx selectInvLhbStockMrmxById(Integer id);

    /**
     * 查询个股龙虎榜明细列表
     * 
     * @param invLhbStockMrmx 个股龙虎榜明细
     * @return 个股龙虎榜明细集合
     */
    public List<InvLhbStockMrmx> selectInvLhbStockMrmxList(InvLhbStockMrmx invLhbStockMrmx);

    /**
     * 新增个股龙虎榜明细
     * 
     * @param invLhbStockMrmx 个股龙虎榜明细
     * @return 结果
     */
    public int insertInvLhbStockMrmx(InvLhbStockMrmx invLhbStockMrmx);

    /**
     * 修改个股龙虎榜明细
     * 
     * @param invLhbStockMrmx 个股龙虎榜明细
     * @return 结果
     */
    public int updateInvLhbStockMrmx(InvLhbStockMrmx invLhbStockMrmx);

    /**
     * 批量删除个股龙虎榜明细
     * 
     * @param ids 需要删除的个股龙虎榜明细主键集合
     * @return 结果
     */
    public int deleteInvLhbStockMrmxByIds(String ids);

    /**
     * 删除个股龙虎榜明细信息
     * 
     * @param id 个股龙虎榜明细主键
     * @return 结果
     */
    public int deleteInvLhbStockMrmxById(Integer id);
}

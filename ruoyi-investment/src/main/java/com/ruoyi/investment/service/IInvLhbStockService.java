package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvLhbStock;

/**
 * 个股龙虎榜Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
public interface IInvLhbStockService {
    /**
     * 查询个股龙虎榜
     * 
     * @param id 个股龙虎榜主键
     * @return 个股龙虎榜
     */
    public InvLhbStock selectInvLhbStockById(Integer id);

    /**
     * 查询个股龙虎榜列表
     * 
     * @param invLhbStock 个股龙虎榜
     * @return 个股龙虎榜集合
     */
    public List<InvLhbStock> selectInvLhbStockList(InvLhbStock invLhbStock);

    /**
     * 新增个股龙虎榜
     * 
     * @param invLhbStock 个股龙虎榜
     * @return 结果
     */
    public int insertInvLhbStock(InvLhbStock invLhbStock);

    /**
     * 修改个股龙虎榜
     * 
     * @param invLhbStock 个股龙虎榜
     * @return 结果
     */
    public int updateInvLhbStock(InvLhbStock invLhbStock);

    /**
     * 批量删除个股龙虎榜
     * 
     * @param ids 需要删除的个股龙虎榜主键集合
     * @return 结果
     */
    public int deleteInvLhbStockByIds(String ids);

    /**
     * 删除个股龙虎榜信息
     * 
     * @param id 个股龙虎榜主键
     * @return 结果
     */
    public int deleteInvLhbStockById(Integer id);
}

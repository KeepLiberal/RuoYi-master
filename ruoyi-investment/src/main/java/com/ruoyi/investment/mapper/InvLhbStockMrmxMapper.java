package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvLhbStockMrmx;

/**
 * 个股龙虎榜明细Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-28
 */
public interface InvLhbStockMrmxMapper {
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
     * 删除个股龙虎榜明细
     * 
     * @param id 个股龙虎榜明细主键
     * @return 结果
     */
    public int deleteInvLhbStockMrmxById(Integer id);

    /**
     * 批量删除个股龙虎榜明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvLhbStockMrmxByIds(String[] ids);
}

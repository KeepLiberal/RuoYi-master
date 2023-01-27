package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvLhbStockMapper;
import com.ruoyi.investment.domain.InvLhbStock;
import com.ruoyi.investment.service.IInvLhbStockService;
import com.ruoyi.common.core.text.Convert;

/**
 * 个股龙虎榜Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-27
 */
@Service
public class InvLhbStockServiceImpl implements IInvLhbStockService {
    @Resource
    private InvLhbStockMapper invLhbStockMapper;

    /**
     * 查询个股龙虎榜
     * 
     * @param id 个股龙虎榜主键
     * @return 个股龙虎榜
     */
    @Override
    public InvLhbStock selectInvLhbStockById(Integer id) {
        return invLhbStockMapper.selectInvLhbStockById(id);
    }

    /**
     * 查询个股龙虎榜列表
     * 
     * @param invLhbStock 个股龙虎榜
     * @return 个股龙虎榜
     */
    @Override
    public List<InvLhbStock> selectInvLhbStockList(InvLhbStock invLhbStock) {
        return invLhbStockMapper.selectInvLhbStockList(invLhbStock);
    }

    /**
     * 新增个股龙虎榜
     * 
     * @param invLhbStock 个股龙虎榜
     * @return 结果
     */
    @Override
    public int insertInvLhbStock(InvLhbStock invLhbStock) {
        return invLhbStockMapper.insertInvLhbStock(invLhbStock);
    }

    /**
     * 修改个股龙虎榜
     * 
     * @param invLhbStock 个股龙虎榜
     * @return 结果
     */
    @Override
    public int updateInvLhbStock(InvLhbStock invLhbStock) {
        return invLhbStockMapper.updateInvLhbStock(invLhbStock);
    }

    /**
     * 批量删除个股龙虎榜
     * 
     * @param ids 需要删除的个股龙虎榜主键
     * @return 结果
     */
    @Override
    public int deleteInvLhbStockByIds(String ids) {
        return invLhbStockMapper.deleteInvLhbStockByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除个股龙虎榜信息
     * 
     * @param id 个股龙虎榜主键
     * @return 结果
     */
    @Override
    public int deleteInvLhbStockById(Integer id) {
        return invLhbStockMapper.deleteInvLhbStockById(id);
    }
}

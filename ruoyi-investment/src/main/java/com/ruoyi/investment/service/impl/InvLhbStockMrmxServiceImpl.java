package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvLhbStockMrmxMapper;
import com.ruoyi.investment.domain.InvLhbStockMrmx;
import com.ruoyi.investment.service.IInvLhbStockMrmxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 个股龙虎榜明细Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-28
 */
@Service
public class InvLhbStockMrmxServiceImpl implements IInvLhbStockMrmxService {
    @Resource
    private InvLhbStockMrmxMapper invLhbStockMrmxMapper;

    /**
     * 查询个股龙虎榜明细
     * 
     * @param id 个股龙虎榜明细主键
     * @return 个股龙虎榜明细
     */
    @Override
    public InvLhbStockMrmx selectInvLhbStockMrmxById(Integer id) {
        return invLhbStockMrmxMapper.selectInvLhbStockMrmxById(id);
    }

    /**
     * 查询个股龙虎榜明细列表
     * 
     * @param invLhbStockMrmx 个股龙虎榜明细
     * @return 个股龙虎榜明细
     */
    @Override
    public List<InvLhbStockMrmx> selectInvLhbStockMrmxList(InvLhbStockMrmx invLhbStockMrmx) {
        return invLhbStockMrmxMapper.selectInvLhbStockMrmxList(invLhbStockMrmx);
    }

    /**
     * 新增个股龙虎榜明细
     * 
     * @param invLhbStockMrmx 个股龙虎榜明细
     * @return 结果
     */
    @Override
    public int insertInvLhbStockMrmx(InvLhbStockMrmx invLhbStockMrmx) {
        return invLhbStockMrmxMapper.insertInvLhbStockMrmx(invLhbStockMrmx);
    }

    /**
     * 修改个股龙虎榜明细
     * 
     * @param invLhbStockMrmx 个股龙虎榜明细
     * @return 结果
     */
    @Override
    public int updateInvLhbStockMrmx(InvLhbStockMrmx invLhbStockMrmx) {
        return invLhbStockMrmxMapper.updateInvLhbStockMrmx(invLhbStockMrmx);
    }

    /**
     * 批量删除个股龙虎榜明细
     * 
     * @param ids 需要删除的个股龙虎榜明细主键
     * @return 结果
     */
    @Override
    public int deleteInvLhbStockMrmxByIds(String ids) {
        return invLhbStockMrmxMapper.deleteInvLhbStockMrmxByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除个股龙虎榜明细信息
     * 
     * @param id 个股龙虎榜明细主键
     * @return 结果
     */
    @Override
    public int deleteInvLhbStockMrmxById(Integer id) {
        return invLhbStockMrmxMapper.deleteInvLhbStockMrmxById(id);
    }
}

package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvLhbStockMrtjMapper;
import com.ruoyi.investment.domain.InvLhbStockMrtj;
import com.ruoyi.investment.service.IInvLhbStockMrtjService;
import com.ruoyi.common.core.text.Convert;

/**
 * 个股龙虎榜统计Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-28
 */
@Service
public class InvLhbStockMrtjServiceImpl implements IInvLhbStockMrtjService {
    @Resource
    private InvLhbStockMrtjMapper invLhbStockMrtjMapper;

    /**
     * 查询个股龙虎榜统计
     * 
     * @param id 个股龙虎榜统计主键
     * @return 个股龙虎榜统计
     */
    @Override
    public InvLhbStockMrtj selectInvLhbStockMrtjById(Integer id) {
        return invLhbStockMrtjMapper.selectInvLhbStockMrtjById(id);
    }

    /**
     * 查询个股龙虎榜统计列表
     * 
     * @param invLhbStockMrtj 个股龙虎榜统计
     * @return 个股龙虎榜统计
     */
    @Override
    public List<InvLhbStockMrtj> selectInvLhbStockMrtjList(InvLhbStockMrtj invLhbStockMrtj) {
        return invLhbStockMrtjMapper.selectInvLhbStockMrtjList(invLhbStockMrtj);
    }

    /**
     * 新增个股龙虎榜统计
     * 
     * @param invLhbStockMrtj 个股龙虎榜统计
     * @return 结果
     */
    @Override
    public int insertInvLhbStockMrtj(InvLhbStockMrtj invLhbStockMrtj) {
        return invLhbStockMrtjMapper.insertInvLhbStockMrtj(invLhbStockMrtj);
    }

    /**
     * 修改个股龙虎榜统计
     * 
     * @param invLhbStockMrtj 个股龙虎榜统计
     * @return 结果
     */
    @Override
    public int updateInvLhbStockMrtj(InvLhbStockMrtj invLhbStockMrtj) {
        return invLhbStockMrtjMapper.updateInvLhbStockMrtj(invLhbStockMrtj);
    }

    /**
     * 批量删除个股龙虎榜统计
     * 
     * @param ids 需要删除的个股龙虎榜统计主键
     * @return 结果
     */
    @Override
    public int deleteInvLhbStockMrtjByIds(String ids) {
        return invLhbStockMrtjMapper.deleteInvLhbStockMrtjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除个股龙虎榜统计信息
     * 
     * @param id 个股龙虎榜统计主键
     * @return 结果
     */
    @Override
    public int deleteInvLhbStockMrtjById(Integer id) {
        return invLhbStockMrtjMapper.deleteInvLhbStockMrtjById(id);
    }
}

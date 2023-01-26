package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvStockExchangeMapper;
import com.ruoyi.investment.domain.InvStockExchange;
import com.ruoyi.investment.service.IInvStockExchangeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 证劵交易所Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
@Service
public class InvStockExchangeServiceImpl implements IInvStockExchangeService {
    @Resource
    private InvStockExchangeMapper invStockExchangeMapper;

    /**
     * 查询证劵交易所
     * 
     * @param id 证劵交易所主键
     * @return 证劵交易所
     */
    @Override
    public InvStockExchange selectInvStockExchangeById(Integer id) {
        return invStockExchangeMapper.selectInvStockExchangeById(id);
    }

    /**
     * 查询证劵交易所列表
     * 
     * @param invStockExchange 证劵交易所
     * @return 证劵交易所
     */
    @Override
    public List<InvStockExchange> selectInvStockExchangeList(InvStockExchange invStockExchange) {
        return invStockExchangeMapper.selectInvStockExchangeList(invStockExchange);
    }

    /**
     * 新增证劵交易所
     * 
     * @param invStockExchange 证劵交易所
     * @return 结果
     */
    @Override
    public int insertInvStockExchange(InvStockExchange invStockExchange) {
        return invStockExchangeMapper.insertInvStockExchange(invStockExchange);
    }

    /**
     * 修改证劵交易所
     * 
     * @param invStockExchange 证劵交易所
     * @return 结果
     */
    @Override
    public int updateInvStockExchange(InvStockExchange invStockExchange) {
        return invStockExchangeMapper.updateInvStockExchange(invStockExchange);
    }

    /**
     * 批量删除证劵交易所
     * 
     * @param ids 需要删除的证劵交易所主键
     * @return 结果
     */
    @Override
    public int deleteInvStockExchangeByIds(String ids) {
        return invStockExchangeMapper.deleteInvStockExchangeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除证劵交易所信息
     * 
     * @param id 证劵交易所主键
     * @return 结果
     */
    @Override
    public int deleteInvStockExchangeById(Integer id) {
        return invStockExchangeMapper.deleteInvStockExchangeById(id);
    }
}

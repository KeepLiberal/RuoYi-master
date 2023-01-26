package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvStockExchange;

/**
 * 证劵交易所Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
public interface InvStockExchangeMapper {
    /**
     * 查询证劵交易所
     * 
     * @param id 证劵交易所主键
     * @return 证劵交易所
     */
    public InvStockExchange selectInvStockExchangeById(Integer id);

    /**
     * 查询证劵交易所列表
     * 
     * @param invStockExchange 证劵交易所
     * @return 证劵交易所集合
     */
    public List<InvStockExchange> selectInvStockExchangeList(InvStockExchange invStockExchange);

    /**
     * 新增证劵交易所
     * 
     * @param invStockExchange 证劵交易所
     * @return 结果
     */
    public int insertInvStockExchange(InvStockExchange invStockExchange);

    /**
     * 修改证劵交易所
     * 
     * @param invStockExchange 证劵交易所
     * @return 结果
     */
    public int updateInvStockExchange(InvStockExchange invStockExchange);

    /**
     * 删除证劵交易所
     * 
     * @param id 证劵交易所主键
     * @return 结果
     */
    public int deleteInvStockExchangeById(Integer id);

    /**
     * 批量删除证劵交易所
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvStockExchangeByIds(String[] ids);
}

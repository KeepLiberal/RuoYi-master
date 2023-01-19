package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvStock;

/**
 * A股基本信息Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface IInvStockService {
    /**
     * 查询A股基本信息
     * 
     * @param id A股基本信息主键
     * @return A股基本信息
     */
    public InvStock selectInvStockById(Integer id);

    /**
     * 查询A股基本信息列表
     * 
     * @param invStock A股基本信息
     * @return A股基本信息集合
     */
    public List<InvStock> selectInvStockList(InvStock invStock);

    /**
     * 新增A股基本信息
     * 
     * @param invStock A股基本信息
     * @return 结果
     */
    public int insertInvStock(InvStock invStock);

    /**
     * 修改A股基本信息
     * 
     * @param invStock A股基本信息
     * @return 结果
     */
    public int updateInvStock(InvStock invStock);

    /**
     * 批量删除A股基本信息
     * 
     * @param ids 需要删除的A股基本信息主键集合
     * @return 结果
     */
    public int deleteInvStockByIds(String ids);

    /**
     * 删除A股基本信息信息
     * 
     * @param id A股基本信息主键
     * @return 结果
     */
    public int deleteInvStockById(Integer id);
}

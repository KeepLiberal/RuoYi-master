package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvStock;

/**
 * A股基本信息Mapper接口
 * 
 * @author yangwenyang
 * @date 2022-10-13
 */
public interface InvStockMapper 
{
    /**
     * 查询A股基本信息
     * 
     * @param code A股基本信息主键
     * @return A股基本信息
     */
    public InvStock selectInvStockByCode(String code);

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
     * 删除A股基本信息
     * 
     * @param code A股基本信息主键
     * @return 结果
     */
    public int deleteInvStockByCode(String code);

    /**
     * 批量删除A股基本信息
     * 
     * @param codes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvStockByCodes(String[] codes);

    List<InvStock> selectInvStockVoNoDelisting();
}

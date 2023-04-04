package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvKLine;

/**
 * 个股K线数据Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-04-01
 */
public interface InvKLineMapper {
    /**
     * 查询个股K线数据
     * 
     * @param id 个股K线数据主键
     * @return 个股K线数据
     */
    public InvKLine selectInvKLineById(Integer id);

    /**
     * 查询个股K线数据列表
     * 
     * @param invKLine 个股K线数据
     * @return 个股K线数据集合
     */
    public List<InvKLine> selectInvKLineList(InvKLine invKLine);

    /**
     * 新增个股K线数据
     * 
     * @param invKLine 个股K线数据
     * @return 结果
     */
    public int insertInvKLine(InvKLine invKLine);

    /**
     * 修改个股K线数据
     * 
     * @param invKLine 个股K线数据
     * @return 结果
     */
    public int updateInvKLine(InvKLine invKLine);

    /**
     * 删除个股K线数据
     * 
     * @param id 个股K线数据主键
     * @return 结果
     */
    public int deleteInvKLineById(Integer id);

    /**
     * 批量删除个股K线数据
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvKLineByIds(String[] ids);

}

package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvRzrq;

/**
 * 融资融券Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-22
 */
public interface InvRzrqMapper {
    /**
     * 查询融资融券
     * 
     * @param id 融资融券主键
     * @return 融资融券
     */
    public InvRzrq selectInvRzrqById(Integer id);

    /**
     * 查询融资融券列表
     * 
     * @param invRzrq 融资融券
     * @return 融资融券集合
     */
    public List<InvRzrq> selectInvRzrqList(InvRzrq invRzrq);

    /**
     * 新增融资融券
     * 
     * @param invRzrq 融资融券
     * @return 结果
     */
    public int insertInvRzrq(InvRzrq invRzrq);

    /**
     * 修改融资融券
     * 
     * @param invRzrq 融资融券
     * @return 结果
     */
    public int updateInvRzrq(InvRzrq invRzrq);

    /**
     * 删除融资融券
     * 
     * @param id 融资融券主键
     * @return 结果
     */
    public int deleteInvRzrqById(Integer id);

    /**
     * 批量删除融资融券
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvRzrqByIds(String[] ids);
}

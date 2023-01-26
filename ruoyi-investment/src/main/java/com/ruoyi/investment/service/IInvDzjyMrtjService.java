package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvDzjyMrtj;

/**
 * 大宗交易-每日统计Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
public interface IInvDzjyMrtjService {
    /**
     * 查询大宗交易-每日统计
     * 
     * @param id 大宗交易-每日统计主键
     * @return 大宗交易-每日统计
     */
    public InvDzjyMrtj selectInvDzjyMrtjById(Integer id);

    /**
     * 查询大宗交易-每日统计列表
     * 
     * @param invDzjyMrtj 大宗交易-每日统计
     * @return 大宗交易-每日统计集合
     */
    public List<InvDzjyMrtj> selectInvDzjyMrtjList(InvDzjyMrtj invDzjyMrtj);

    /**
     * 新增大宗交易-每日统计
     * 
     * @param invDzjyMrtj 大宗交易-每日统计
     * @return 结果
     */
    public int insertInvDzjyMrtj(InvDzjyMrtj invDzjyMrtj);

    /**
     * 修改大宗交易-每日统计
     * 
     * @param invDzjyMrtj 大宗交易-每日统计
     * @return 结果
     */
    public int updateInvDzjyMrtj(InvDzjyMrtj invDzjyMrtj);

    /**
     * 批量删除大宗交易-每日统计
     * 
     * @param ids 需要删除的大宗交易-每日统计主键集合
     * @return 结果
     */
    public int deleteInvDzjyMrtjByIds(String ids);

    /**
     * 删除大宗交易-每日统计信息
     * 
     * @param id 大宗交易-每日统计主键
     * @return 结果
     */
    public int deleteInvDzjyMrtjById(Integer id);
}

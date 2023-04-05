package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFhrzPgmx;

/**
 * 配股明细Service接口
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
public interface IInvFhrzPgmxService {
    /**
     * 查询配股明细
     * 
     * @param id 配股明细主键
     * @return 配股明细
     */
    public InvFhrzPgmx selectInvFhrzPgmxById(Integer id);

    /**
     * 查询配股明细列表
     * 
     * @param invFhrzPgmx 配股明细
     * @return 配股明细集合
     */
    public List<InvFhrzPgmx> selectInvFhrzPgmxList(InvFhrzPgmx invFhrzPgmx);

    /**
     * 新增配股明细
     * 
     * @param invFhrzPgmx 配股明细
     * @return 结果
     */
    public int insertInvFhrzPgmx(InvFhrzPgmx invFhrzPgmx);

    /**
     * 修改配股明细
     * 
     * @param invFhrzPgmx 配股明细
     * @return 结果
     */
    public int updateInvFhrzPgmx(InvFhrzPgmx invFhrzPgmx);

    /**
     * 批量删除配股明细
     * 
     * @param ids 需要删除的配股明细主键集合
     * @return 结果
     */
    public int deleteInvFhrzPgmxByIds(String ids);

    /**
     * 删除配股明细信息
     * 
     * @param id 配股明细主键
     * @return 结果
     */
    public int deleteInvFhrzPgmxById(Integer id);
}

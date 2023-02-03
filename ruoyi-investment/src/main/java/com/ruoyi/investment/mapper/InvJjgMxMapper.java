package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvJjgMx;

/**
 * 解禁股明细Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-02-03
 */
public interface InvJjgMxMapper {
    /**
     * 查询解禁股明细
     * 
     * @param id 解禁股明细主键
     * @return 解禁股明细
     */
    public InvJjgMx selectInvJjgMxById(Integer id);

    /**
     * 查询解禁股明细列表
     * 
     * @param invJjgMx 解禁股明细
     * @return 解禁股明细集合
     */
    public List<InvJjgMx> selectInvJjgMxList(InvJjgMx invJjgMx);

    /**
     * 新增解禁股明细
     * 
     * @param invJjgMx 解禁股明细
     * @return 结果
     */
    public int insertInvJjgMx(InvJjgMx invJjgMx);

    /**
     * 修改解禁股明细
     * 
     * @param invJjgMx 解禁股明细
     * @return 结果
     */
    public int updateInvJjgMx(InvJjgMx invJjgMx);

    /**
     * 删除解禁股明细
     * 
     * @param id 解禁股明细主键
     * @return 结果
     */
    public int deleteInvJjgMxById(Integer id);

    /**
     * 批量删除解禁股明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvJjgMxByIds(String[] ids);
}

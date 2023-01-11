package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvIndustryCsrc;

/**
 * 证监会行业Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public interface IInvIndustryCsrcService {
    /**
     * 查询证监会行业
     * 
     * @param id 证监会行业主键
     * @return 证监会行业
     */
    public InvIndustryCsrc selectInvIndustryCsrcById(Integer id);

    /**
     * 查询证监会行业列表
     * 
     * @param invIndustryCsrc 证监会行业
     * @return 证监会行业集合
     */
    public List<InvIndustryCsrc> selectInvIndustryCsrcList(InvIndustryCsrc invIndustryCsrc);

    /**
     * 新增证监会行业
     * 
     * @param invIndustryCsrc 证监会行业
     * @return 结果
     */
    public int insertInvIndustryCsrc(InvIndustryCsrc invIndustryCsrc);

    /**
     * 修改证监会行业
     * 
     * @param invIndustryCsrc 证监会行业
     * @return 结果
     */
    public int updateInvIndustryCsrc(InvIndustryCsrc invIndustryCsrc);

    /**
     * 批量删除证监会行业
     * 
     * @param ids 需要删除的证监会行业主键集合
     * @return 结果
     */
    public int deleteInvIndustryCsrcByIds(String ids);

    /**
     * 删除证监会行业信息
     * 
     * @param id 证监会行业主键
     * @return 结果
     */
    public int deleteInvIndustryCsrcById(Integer id);
}

package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvIndustryEm;

/**
 * 东财行业Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public interface IInvIndustryEmService {
    /**
     * 查询东财行业
     * 
     * @param id 东财行业主键
     * @return 东财行业
     */
    public InvIndustryEm selectInvIndustryEmById(Long id);

    /**
     * 查询东财行业列表
     * 
     * @param invIndustryEm 东财行业
     * @return 东财行业集合
     */
    public List<InvIndustryEm> selectInvIndustryEmList(InvIndustryEm invIndustryEm);

    /**
     * 新增东财行业
     * 
     * @param invIndustryEm 东财行业
     * @return 结果
     */
    public int insertInvIndustryEm(InvIndustryEm invIndustryEm);

    /**
     * 修改东财行业
     * 
     * @param invIndustryEm 东财行业
     * @return 结果
     */
    public int updateInvIndustryEm(InvIndustryEm invIndustryEm);

    /**
     * 批量删除东财行业
     * 
     * @param ids 需要删除的东财行业主键集合
     * @return 结果
     */
    public int deleteInvIndustryEmByIds(String ids);

    /**
     * 删除东财行业信息
     * 
     * @param id 东财行业主键
     * @return 结果
     */
    public int deleteInvIndustryEmById(Long id);
}

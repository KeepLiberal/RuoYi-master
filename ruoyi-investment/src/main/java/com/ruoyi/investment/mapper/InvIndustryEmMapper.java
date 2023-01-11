package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvIndustryEm;

/**
 * 东财行业Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public interface InvIndustryEmMapper {
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
     * 删除东财行业
     * 
     * @param id 东财行业主键
     * @return 结果
     */
    public int deleteInvIndustryEmById(Long id);

    /**
     * 批量删除东财行业
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvIndustryEmByIds(String[] ids);
}

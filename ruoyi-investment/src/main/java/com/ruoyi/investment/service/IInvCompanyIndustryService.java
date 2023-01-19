package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvCompanyIndustry;

/**
 * 公司所属行业Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface IInvCompanyIndustryService {
    /**
     * 查询公司所属行业
     * 
     * @param id 公司所属行业主键
     * @return 公司所属行业
     */
    public InvCompanyIndustry selectInvCompanyIndustryById(Integer id);

    /**
     * 查询公司所属行业列表
     * 
     * @param invCompanyIndustry 公司所属行业
     * @return 公司所属行业集合
     */
    public List<InvCompanyIndustry> selectInvCompanyIndustryList(InvCompanyIndustry invCompanyIndustry);

    /**
     * 新增公司所属行业
     * 
     * @param invCompanyIndustry 公司所属行业
     * @return 结果
     */
    public int insertInvCompanyIndustry(InvCompanyIndustry invCompanyIndustry);

    /**
     * 修改公司所属行业
     * 
     * @param invCompanyIndustry 公司所属行业
     * @return 结果
     */
    public int updateInvCompanyIndustry(InvCompanyIndustry invCompanyIndustry);

    /**
     * 批量删除公司所属行业
     * 
     * @param ids 需要删除的公司所属行业主键集合
     * @return 结果
     */
    public int deleteInvCompanyIndustryByIds(String ids);

    /**
     * 删除公司所属行业信息
     * 
     * @param id 公司所属行业主键
     * @return 结果
     */
    public int deleteInvCompanyIndustryById(Integer id);
}

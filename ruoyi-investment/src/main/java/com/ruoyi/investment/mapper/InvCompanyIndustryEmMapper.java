package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvCompanyIndustryEm;

/**
 * 所属东财行业Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public interface InvCompanyIndustryEmMapper {
    /**
     * 查询所属东财行业
     * 
     * @param id 所属东财行业主键
     * @return 所属东财行业
     */
    public InvCompanyIndustryEm selectInvCompanyIndustryEmById(Integer id);

    /**
     * 查询所属东财行业列表
     * 
     * @param invCompanyIndustryEm 所属东财行业
     * @return 所属东财行业集合
     */
    public List<InvCompanyIndustryEm> selectInvCompanyIndustryEmList(InvCompanyIndustryEm invCompanyIndustryEm);

    /**
     * 查询所属东财行业列表
     *
     * @return 所属东财行业集合
     */
    public List<InvCompanyIndustryEm> selectInvCompanyIndustryEmList();

    /**
     * 新增所属东财行业
     * 
     * @param invCompanyIndustryEm 所属东财行业
     * @return 结果
     */
    public int insertInvCompanyIndustryEm(InvCompanyIndustryEm invCompanyIndustryEm);

    /**
     * 修改所属东财行业
     * 
     * @param invCompanyIndustryEm 所属东财行业
     * @return 结果
     */
    public int updateInvCompanyIndustryEm(InvCompanyIndustryEm invCompanyIndustryEm);

    /**
     * 删除所属东财行业
     * 
     * @param id 所属东财行业主键
     * @return 结果
     */
    public int deleteInvCompanyIndustryEmById(Integer id);

    /**
     * 批量删除所属东财行业
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvCompanyIndustryEmByIds(String[] ids);
}

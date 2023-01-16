package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvIndustry;

/**
 * 行业Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-16
 */
public interface InvIndustryMapper {
    /**
     * 查询行业
     * 
     * @param id 行业主键
     * @return 行业
     */
    public InvIndustry selectInvIndustryById(Integer id);

    /**
     * 查询行业列表
     * 
     * @param invIndustry 行业
     * @return 行业集合
     */
    public List<InvIndustry> selectInvIndustryList(InvIndustry invIndustry);

    /**
     * 新增行业
     * 
     * @param invIndustry 行业
     * @return 结果
     */
    public int insertInvIndustry(InvIndustry invIndustry);

    /**
     * 修改行业
     * 
     * @param invIndustry 行业
     * @return 结果
     */
    public int updateInvIndustry(InvIndustry invIndustry);

    /**
     * 删除行业
     * 
     * @param id 行业主键
     * @return 结果
     */
    public int deleteInvIndustryById(Integer id);

    /**
     * 批量删除行业
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvIndustryByIds(String[] ids);

    /**
     * 查询行业最大id
     *
     * @return 结果
     */
    public InvIndustry selectMaxId();
}

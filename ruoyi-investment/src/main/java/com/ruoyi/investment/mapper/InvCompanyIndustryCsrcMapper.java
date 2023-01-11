package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvCompanyIndustryCsrc;

/**
 * 所属证监会行业Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public interface InvCompanyIndustryCsrcMapper {
    /**
     * 查询所属证监会行业
     * 
     * @param id 所属证监会行业主键
     * @return 所属证监会行业
     */
    public InvCompanyIndustryCsrc selectInvCompanyIndustryCsrcById(Integer id);

    /**
     * 查询所属证监会行业列表
     * 
     * @param invCompanyIndustryCsrc 所属证监会行业
     * @return 所属证监会行业集合
     */
    public List<InvCompanyIndustryCsrc> selectInvCompanyIndustryCsrcList(InvCompanyIndustryCsrc invCompanyIndustryCsrc);

    /**
     * 新增所属证监会行业
     * 
     * @param invCompanyIndustryCsrc 所属证监会行业
     * @return 结果
     */
    public int insertInvCompanyIndustryCsrc(InvCompanyIndustryCsrc invCompanyIndustryCsrc);

    /**
     * 修改所属证监会行业
     * 
     * @param invCompanyIndustryCsrc 所属证监会行业
     * @return 结果
     */
    public int updateInvCompanyIndustryCsrc(InvCompanyIndustryCsrc invCompanyIndustryCsrc);

    /**
     * 删除所属证监会行业
     * 
     * @param id 所属证监会行业主键
     * @return 结果
     */
    public int deleteInvCompanyIndustryCsrcById(Integer id);

    /**
     * 批量删除所属证监会行业
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvCompanyIndustryCsrcByIds(String[] ids);
}

package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvCompany;

/**
 * 公司概况Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-09
 */
public interface InvCompanyMapper {
    /**
     * 查询公司概况
     * 
     * @param code 公司概况主键
     * @return 公司概况
     */
    public InvCompany selectInvCompanyByCode(String code);

    /**
     * 查询公司概况列表
     * 
     * @param invCompany 公司概况
     * @return 公司概况集合
     */
    public List<InvCompany> selectInvCompanyList(InvCompany invCompany);

    /**
     * 查询公司概况列表
     *
     * @return 公司概况集合
     */
    public List<InvCompany> selectInvCompanyShortList();


    /**
     * 新增公司概况
     * 
     * @param invCompany 公司概况
     * @return 结果
     */
    public int insertInvCompany(InvCompany invCompany);

    /**
     * 修改公司概况
     * 
     * @param invCompany 公司概况
     * @return 结果
     */
    public int updateInvCompany(InvCompany invCompany);

    /**
     * 删除公司概况
     * 
     * @param code 公司概况主键
     * @return 结果
     */
    public int deleteInvCompanyByCode(String code);

    /**
     * 批量删除公司概况
     * 
     * @param codes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvCompanyByCodes(String[] codes);
}

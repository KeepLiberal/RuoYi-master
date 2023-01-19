package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvCompany;

/**
 * 公司概况Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface IInvCompanyService {
    /**
     * 查询公司概况
     * 
     * @param id 公司概况主键
     * @return 公司概况
     */
    public InvCompany selectInvCompanyById(Integer id);

    /**
     * 查询公司概况列表
     * 
     * @param invCompany 公司概况
     * @return 公司概况集合
     */
    public List<InvCompany> selectInvCompanyList(InvCompany invCompany);

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
     * 批量删除公司概况
     * 
     * @param ids 需要删除的公司概况主键集合
     * @return 结果
     */
    public int deleteInvCompanyByIds(String ids);

    /**
     * 删除公司概况信息
     * 
     * @param id 公司概况主键
     * @return 结果
     */
    public int deleteInvCompanyById(Integer id);
}

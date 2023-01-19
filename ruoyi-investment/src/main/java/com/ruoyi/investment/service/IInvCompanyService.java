package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvCompany;

/**
 * 沪深A股公司概况Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface IInvCompanyService {
    /**
     * 查询沪深A股公司概况
     * 
     * @param id 沪深A股公司概况主键
     * @return 沪深A股公司概况
     */
    public InvCompany selectInvCompanyById(Integer id);

    /**
     * 查询沪深A股公司概况列表
     * 
     * @param invCompany 沪深A股公司概况
     * @return 沪深A股公司概况集合
     */
    public List<InvCompany> selectInvCompanyList(InvCompany invCompany);

    /**
     * 新增沪深A股公司概况
     * 
     * @param invCompany 沪深A股公司概况
     * @return 结果
     */
    public int insertInvCompany(InvCompany invCompany);

    /**
     * 修改沪深A股公司概况
     * 
     * @param invCompany 沪深A股公司概况
     * @return 结果
     */
    public int updateInvCompany(InvCompany invCompany);

    /**
     * 批量删除沪深A股公司概况
     * 
     * @param ids 需要删除的沪深A股公司概况主键集合
     * @return 结果
     */
    public int deleteInvCompanyByIds(String ids);

    /**
     * 删除沪深A股公司概况信息
     * 
     * @param id 沪深A股公司概况主键
     * @return 结果
     */
    public int deleteInvCompanyById(Integer id);
}

package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvCompanyAddress;

/**
 * 公司地址Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-16
 */
public interface IInvCompanyAddressService {
    /**
     * 查询公司地址
     * 
     * @param id 公司地址主键
     * @return 公司地址
     */
    public InvCompanyAddress selectInvCompanyAddressById(Integer id);

    /**
     * 查询公司地址列表
     * 
     * @param invCompanyAddress 公司地址
     * @return 公司地址集合
     */
    public List<InvCompanyAddress> selectInvCompanyAddressList(InvCompanyAddress invCompanyAddress);

    /**
     * 新增公司地址
     * 
     * @param invCompanyAddress 公司地址
     * @return 结果
     */
    public int insertInvCompanyAddress(InvCompanyAddress invCompanyAddress);

    /**
     * 修改公司地址
     * 
     * @param invCompanyAddress 公司地址
     * @return 结果
     */
    public int updateInvCompanyAddress(InvCompanyAddress invCompanyAddress);

    /**
     * 批量删除公司地址
     * 
     * @param ids 需要删除的公司地址主键集合
     * @return 结果
     */
    public int deleteInvCompanyAddressByIds(String ids);

    /**
     * 删除公司地址信息
     * 
     * @param id 公司地址主键
     * @return 结果
     */
    public int deleteInvCompanyAddressById(Integer id);
}

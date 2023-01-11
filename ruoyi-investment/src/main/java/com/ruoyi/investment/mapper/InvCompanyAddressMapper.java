package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvCompanyAddress;

/**
 * 公司地址Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public interface InvCompanyAddressMapper {
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
     * 删除公司地址
     * 
     * @param id 公司地址主键
     * @return 结果
     */
    public int deleteInvCompanyAddressById(Integer id);

    /**
     * 批量删除公司地址
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvCompanyAddressByIds(String[] ids);
}

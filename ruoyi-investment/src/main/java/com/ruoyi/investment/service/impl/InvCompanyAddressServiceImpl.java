package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvCompanyAddressMapper;
import com.ruoyi.investment.domain.InvCompanyAddress;
import com.ruoyi.investment.service.IInvCompanyAddressService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公司地址Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Service
public class InvCompanyAddressServiceImpl implements IInvCompanyAddressService {
    @Resource
    private InvCompanyAddressMapper invCompanyAddressMapper;

    /**
     * 查询公司地址
     * 
     * @param id 公司地址主键
     * @return 公司地址
     */
    @Override
    public InvCompanyAddress selectInvCompanyAddressById(Integer id) {
        return invCompanyAddressMapper.selectInvCompanyAddressById(id);
    }

    /**
     * 查询公司地址列表
     * 
     * @param invCompanyAddress 公司地址
     * @return 公司地址
     */
    @Override
    public List<InvCompanyAddress> selectInvCompanyAddressList(InvCompanyAddress invCompanyAddress) {
        return invCompanyAddressMapper.selectInvCompanyAddressList(invCompanyAddress);
    }

    /**
     * 新增公司地址
     * 
     * @param invCompanyAddress 公司地址
     * @return 结果
     */
    @Override
    public int insertInvCompanyAddress(InvCompanyAddress invCompanyAddress) {
        return invCompanyAddressMapper.insertInvCompanyAddress(invCompanyAddress);
    }

    /**
     * 修改公司地址
     * 
     * @param invCompanyAddress 公司地址
     * @return 结果
     */
    @Override
    public int updateInvCompanyAddress(InvCompanyAddress invCompanyAddress) {
        return invCompanyAddressMapper.updateInvCompanyAddress(invCompanyAddress);
    }

    /**
     * 批量删除公司地址
     * 
     * @param ids 需要删除的公司地址主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyAddressByIds(String ids) {
        return invCompanyAddressMapper.deleteInvCompanyAddressByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公司地址信息
     * 
     * @param id 公司地址主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyAddressById(Integer id) {
        return invCompanyAddressMapper.deleteInvCompanyAddressById(id);
    }
}

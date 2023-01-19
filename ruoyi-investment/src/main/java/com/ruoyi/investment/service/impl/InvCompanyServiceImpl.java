package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvCompanyMapper;
import com.ruoyi.investment.domain.InvCompany;
import com.ruoyi.investment.service.IInvCompanyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公司概况Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Service
public class InvCompanyServiceImpl implements IInvCompanyService {
    @Resource
    private InvCompanyMapper invCompanyMapper;

    /**
     * 查询公司概况
     * 
     * @param id 公司概况主键
     * @return 公司概况
     */
    @Override
    public InvCompany selectInvCompanyById(Integer id) {
        return invCompanyMapper.selectInvCompanyById(id);
    }

    /**
     * 查询公司概况列表
     * 
     * @param invCompany 公司概况
     * @return 公司概况
     */
    @Override
    public List<InvCompany> selectInvCompanyList(InvCompany invCompany) {
        return invCompanyMapper.selectInvCompanyList(invCompany);
    }

    /**
     * 新增公司概况
     * 
     * @param invCompany 公司概况
     * @return 结果
     */
    @Override
    public int insertInvCompany(InvCompany invCompany) {
        return invCompanyMapper.insertInvCompany(invCompany);
    }

    /**
     * 修改公司概况
     * 
     * @param invCompany 公司概况
     * @return 结果
     */
    @Override
    public int updateInvCompany(InvCompany invCompany) {
        return invCompanyMapper.updateInvCompany(invCompany);
    }

    /**
     * 批量删除公司概况
     * 
     * @param ids 需要删除的公司概况主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyByIds(String ids) {
        return invCompanyMapper.deleteInvCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公司概况信息
     * 
     * @param id 公司概况主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyById(Integer id) {
        return invCompanyMapper.deleteInvCompanyById(id);
    }
}

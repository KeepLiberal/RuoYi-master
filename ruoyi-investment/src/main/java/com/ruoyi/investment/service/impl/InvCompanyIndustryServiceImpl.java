package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvCompanyIndustryMapper;
import com.ruoyi.investment.domain.InvCompanyIndustry;
import com.ruoyi.investment.service.IInvCompanyIndustryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公司所属行业Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Service
public class InvCompanyIndustryServiceImpl implements IInvCompanyIndustryService {
    @Resource
    private InvCompanyIndustryMapper invCompanyIndustryMapper;

    /**
     * 查询公司所属行业
     * 
     * @param id 公司所属行业主键
     * @return 公司所属行业
     */
    @Override
    public InvCompanyIndustry selectInvCompanyIndustryById(Integer id) {
        return invCompanyIndustryMapper.selectInvCompanyIndustryById(id);
    }

    /**
     * 查询公司所属行业列表
     * 
     * @param invCompanyIndustry 公司所属行业
     * @return 公司所属行业
     */
    @Override
    public List<InvCompanyIndustry> selectInvCompanyIndustryList(InvCompanyIndustry invCompanyIndustry) {
        return invCompanyIndustryMapper.selectInvCompanyIndustryList(invCompanyIndustry);
    }

    /**
     * 新增公司所属行业
     * 
     * @param invCompanyIndustry 公司所属行业
     * @return 结果
     */
    @Override
    public int insertInvCompanyIndustry(InvCompanyIndustry invCompanyIndustry) {
        return invCompanyIndustryMapper.insertInvCompanyIndustry(invCompanyIndustry);
    }

    /**
     * 修改公司所属行业
     * 
     * @param invCompanyIndustry 公司所属行业
     * @return 结果
     */
    @Override
    public int updateInvCompanyIndustry(InvCompanyIndustry invCompanyIndustry) {
        return invCompanyIndustryMapper.updateInvCompanyIndustry(invCompanyIndustry);
    }

    /**
     * 批量删除公司所属行业
     * 
     * @param ids 需要删除的公司所属行业主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyIndustryByIds(String ids) {
        return invCompanyIndustryMapper.deleteInvCompanyIndustryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公司所属行业信息
     * 
     * @param id 公司所属行业主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyIndustryById(Integer id) {
        return invCompanyIndustryMapper.deleteInvCompanyIndustryById(id);
    }
}

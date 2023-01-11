package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvCompanyIndustryEmMapper;
import com.ruoyi.investment.domain.InvCompanyIndustryEm;
import com.ruoyi.investment.service.IInvCompanyIndustryEmService;
import com.ruoyi.common.core.text.Convert;

/**
 * 所属东财行业Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
@Service
public class InvCompanyIndustryEmServiceImpl implements IInvCompanyIndustryEmService {
    @Resource
    private InvCompanyIndustryEmMapper invCompanyIndustryEmMapper;

    /**
     * 查询所属东财行业
     * 
     * @param id 所属东财行业主键
     * @return 所属东财行业
     */
    @Override
    public InvCompanyIndustryEm selectInvCompanyIndustryEmById(Integer id) {
        return invCompanyIndustryEmMapper.selectInvCompanyIndustryEmById(id);
    }

    /**
     * 查询所属东财行业列表
     * 
     * @param invCompanyIndustryEm 所属东财行业
     * @return 所属东财行业
     */
    @Override
    public List<InvCompanyIndustryEm> selectInvCompanyIndustryEmList(InvCompanyIndustryEm invCompanyIndustryEm) {
        return invCompanyIndustryEmMapper.selectInvCompanyIndustryEmList(invCompanyIndustryEm);
    }

    /**
     * 新增所属东财行业
     * 
     * @param invCompanyIndustryEm 所属东财行业
     * @return 结果
     */
    @Override
    public int insertInvCompanyIndustryEm(InvCompanyIndustryEm invCompanyIndustryEm) {
        return invCompanyIndustryEmMapper.insertInvCompanyIndustryEm(invCompanyIndustryEm);
    }

    /**
     * 修改所属东财行业
     * 
     * @param invCompanyIndustryEm 所属东财行业
     * @return 结果
     */
    @Override
    public int updateInvCompanyIndustryEm(InvCompanyIndustryEm invCompanyIndustryEm) {
        return invCompanyIndustryEmMapper.updateInvCompanyIndustryEm(invCompanyIndustryEm);
    }

    /**
     * 批量删除所属东财行业
     * 
     * @param ids 需要删除的所属东财行业主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyIndustryEmByIds(String ids) {
        return invCompanyIndustryEmMapper.deleteInvCompanyIndustryEmByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除所属东财行业信息
     * 
     * @param id 所属东财行业主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyIndustryEmById(Integer id) {
        return invCompanyIndustryEmMapper.deleteInvCompanyIndustryEmById(id);
    }
}

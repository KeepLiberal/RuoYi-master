package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvIndustryEmMapper;
import com.ruoyi.investment.domain.InvIndustryEm;
import com.ruoyi.investment.service.IInvIndustryEmService;
import com.ruoyi.common.core.text.Convert;

/**
 * 东财行业Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
@Service
public class InvIndustryEmServiceImpl implements IInvIndustryEmService {
    @Resource
    private InvIndustryEmMapper invIndustryEmMapper;

    /**
     * 查询东财行业
     * 
     * @param id 东财行业主键
     * @return 东财行业
     */
    @Override
    public InvIndustryEm selectInvIndustryEmById(Integer id) {
        return invIndustryEmMapper.selectInvIndustryEmById(id);
    }

    /**
     * 查询东财行业列表
     * 
     * @param invIndustryEm 东财行业
     * @return 东财行业
     */
    @Override
    public List<InvIndustryEm> selectInvIndustryEmList(InvIndustryEm invIndustryEm) {
        return invIndustryEmMapper.selectInvIndustryEmList(invIndustryEm);
    }

    /**
     * 新增东财行业
     * 
     * @param invIndustryEm 东财行业
     * @return 结果
     */
    @Override
    public int insertInvIndustryEm(InvIndustryEm invIndustryEm) {
        return invIndustryEmMapper.insertInvIndustryEm(invIndustryEm);
    }

    /**
     * 修改东财行业
     * 
     * @param invIndustryEm 东财行业
     * @return 结果
     */
    @Override
    public int updateInvIndustryEm(InvIndustryEm invIndustryEm) {
        return invIndustryEmMapper.updateInvIndustryEm(invIndustryEm);
    }

    /**
     * 批量删除东财行业
     * 
     * @param ids 需要删除的东财行业主键
     * @return 结果
     */
    @Override
    public int deleteInvIndustryEmByIds(String ids) {
        return invIndustryEmMapper.deleteInvIndustryEmByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除东财行业信息
     * 
     * @param id 东财行业主键
     * @return 结果
     */
    @Override
    public int deleteInvIndustryEmById(Integer id) {
        return invIndustryEmMapper.deleteInvIndustryEmById(id);
    }
}

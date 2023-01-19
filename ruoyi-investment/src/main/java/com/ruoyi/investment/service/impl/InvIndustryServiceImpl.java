package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvIndustryMapper;
import com.ruoyi.investment.domain.InvIndustry;
import com.ruoyi.investment.service.IInvIndustryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 行业Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Service
public class InvIndustryServiceImpl implements IInvIndustryService {
    @Resource
    private InvIndustryMapper invIndustryMapper;

    /**
     * 查询行业
     * 
     * @param id 行业主键
     * @return 行业
     */
    @Override
    public InvIndustry selectInvIndustryById(Integer id) {
        return invIndustryMapper.selectInvIndustryById(id);
    }

    /**
     * 查询行业列表
     * 
     * @param invIndustry 行业
     * @return 行业
     */
    @Override
    public List<InvIndustry> selectInvIndustryList(InvIndustry invIndustry) {
        return invIndustryMapper.selectInvIndustryList(invIndustry);
    }

    /**
     * 新增行业
     * 
     * @param invIndustry 行业
     * @return 结果
     */
    @Override
    public int insertInvIndustry(InvIndustry invIndustry) {
        return invIndustryMapper.insertInvIndustry(invIndustry);
    }

    /**
     * 修改行业
     * 
     * @param invIndustry 行业
     * @return 结果
     */
    @Override
    public int updateInvIndustry(InvIndustry invIndustry) {
        return invIndustryMapper.updateInvIndustry(invIndustry);
    }

    /**
     * 批量删除行业
     * 
     * @param ids 需要删除的行业主键
     * @return 结果
     */
    @Override
    public int deleteInvIndustryByIds(String ids) {
        return invIndustryMapper.deleteInvIndustryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除行业信息
     * 
     * @param id 行业主键
     * @return 结果
     */
    @Override
    public int deleteInvIndustryById(Integer id) {
        return invIndustryMapper.deleteInvIndustryById(id);
    }
}

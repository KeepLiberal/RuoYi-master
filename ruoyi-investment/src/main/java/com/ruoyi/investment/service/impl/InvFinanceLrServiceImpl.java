package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceLrMapper;
import com.ruoyi.investment.domain.InvFinanceLr;
import com.ruoyi.investment.service.IInvFinanceLrService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-利润Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-11-05
 */
@Service
public class InvFinanceLrServiceImpl implements IInvFinanceLrService 
{
    @Autowired
    private InvFinanceLrMapper invFinanceLrMapper;

    /**
     * 查询财务分析-利润
     * 
     * @param id 财务分析-利润主键
     * @return 财务分析-利润
     */
    @Override
    public InvFinanceLr selectInvFinanceLrById(Long id)
    {
        return invFinanceLrMapper.selectInvFinanceLrById(id);
    }

    /**
     * 查询财务分析-利润列表
     * 
     * @param invFinanceLr 财务分析-利润
     * @return 财务分析-利润
     */
    @Override
    public List<InvFinanceLr> selectInvFinanceLrList(InvFinanceLr invFinanceLr)
    {
        return invFinanceLrMapper.selectInvFinanceLrList(invFinanceLr);
    }

    /**
     * 新增财务分析-利润
     * 
     * @param invFinanceLr 财务分析-利润
     * @return 结果
     */
    @Override
    public int insertInvFinanceLr(InvFinanceLr invFinanceLr)
    {
        return invFinanceLrMapper.insertInvFinanceLr(invFinanceLr);
    }

    /**
     * 修改财务分析-利润
     * 
     * @param invFinanceLr 财务分析-利润
     * @return 结果
     */
    @Override
    public int updateInvFinanceLr(InvFinanceLr invFinanceLr)
    {
        return invFinanceLrMapper.updateInvFinanceLr(invFinanceLr);
    }

    /**
     * 批量删除财务分析-利润
     * 
     * @param ids 需要删除的财务分析-利润主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceLrByIds(String ids)
    {
        return invFinanceLrMapper.deleteInvFinanceLrByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-利润信息
     * 
     * @param id 财务分析-利润主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceLrById(Long id)
    {
        return invFinanceLrMapper.deleteInvFinanceLrById(id);
    }
}

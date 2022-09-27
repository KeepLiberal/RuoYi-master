package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZyzbYearMapper;
import com.ruoyi.investment.domain.InvFinanceZyzbYear;
import com.ruoyi.investment.service.IInvFinanceZyzbYearService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-重要指标-年度Service业务层处理
 * 
 * @author wenyong.yang
 * @date 2022-09-26
 */
@Service
public class InvFinanceZyzbYearServiceImpl implements IInvFinanceZyzbYearService 
{
    @Autowired
    private InvFinanceZyzbYearMapper invFinanceZyzbYearMapper;

    /**
     * 查询财务分析-重要指标-年度
     * 
     * @param id 财务分析-重要指标-年度主键
     * @return 财务分析-重要指标-年度
     */
    @Override
    public InvFinanceZyzbYear selectInvFinanceZyzbYearById(Long id)
    {
        return invFinanceZyzbYearMapper.selectInvFinanceZyzbYearById(id);
    }

    /**
     * 查询财务分析-重要指标-年度列表
     * 
     * @param invFinanceZyzbYear 财务分析-重要指标-年度
     * @return 财务分析-重要指标-年度
     */
    @Override
    public List<InvFinanceZyzbYear> selectInvFinanceZyzbYearList(InvFinanceZyzbYear invFinanceZyzbYear)
    {
        return invFinanceZyzbYearMapper.selectInvFinanceZyzbYearList(invFinanceZyzbYear);
    }

    /**
     * 新增财务分析-重要指标-年度
     * 
     * @param invFinanceZyzbYear 财务分析-重要指标-年度
     * @return 结果
     */
    @Override
    public int insertInvFinanceZyzbYear(InvFinanceZyzbYear invFinanceZyzbYear)
    {
        return invFinanceZyzbYearMapper.insertInvFinanceZyzbYear(invFinanceZyzbYear);
    }

    /**
     * 修改财务分析-重要指标-年度
     * 
     * @param invFinanceZyzbYear 财务分析-重要指标-年度
     * @return 结果
     */
    @Override
    public int updateInvFinanceZyzbYear(InvFinanceZyzbYear invFinanceZyzbYear)
    {
        return invFinanceZyzbYearMapper.updateInvFinanceZyzbYear(invFinanceZyzbYear);
    }

    /**
     * 批量删除财务分析-重要指标-年度
     * 
     * @param ids 需要删除的财务分析-重要指标-年度主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbYearByIds(String ids)
    {
        return invFinanceZyzbYearMapper.deleteInvFinanceZyzbYearByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-重要指标-年度信息
     * 
     * @param id 财务分析-重要指标-年度主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbYearById(Long id)
    {
        return invFinanceZyzbYearMapper.deleteInvFinanceZyzbYearById(id);
    }
}

package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZyzbQuarterMapper;
import com.ruoyi.investment.domain.InvFinanceZyzbQuarter;
import com.ruoyi.investment.service.IInvFinanceZyzbQuarterService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-重要指标-季度Service业务层处理
 * 
 * @author wenyong.yang
 * @date 2022-09-24
 */
@Service
public class InvFinanceZyzbQuarterServiceImpl implements IInvFinanceZyzbQuarterService 
{
    @Autowired
    private InvFinanceZyzbQuarterMapper invFinanceZyzbQuarterMapper;

    /**
     * 查询财务分析-重要指标-季度
     * 
     * @param id 财务分析-重要指标-季度主键
     * @return 财务分析-重要指标-季度
     */
    @Override
    public InvFinanceZyzbQuarter selectInvFinanceZyzbQuarterById(Long id)
    {
        return invFinanceZyzbQuarterMapper.selectInvFinanceZyzbQuarterById(id);
    }

    /**
     * 查询财务分析-重要指标-季度列表
     * 
     * @param invFinanceZyzbQuarter 财务分析-重要指标-季度
     * @return 财务分析-重要指标-季度
     */
    @Override
    public List<InvFinanceZyzbQuarter> selectInvFinanceZyzbQuarterList(InvFinanceZyzbQuarter invFinanceZyzbQuarter)
    {
        return invFinanceZyzbQuarterMapper.selectInvFinanceZyzbQuarterList(invFinanceZyzbQuarter);
    }

    /**
     * 新增财务分析-重要指标-季度
     * 
     * @param invFinanceZyzbQuarter 财务分析-重要指标-季度
     * @return 结果
     */
    @Override
    public int insertInvFinanceZyzbQuarter(InvFinanceZyzbQuarter invFinanceZyzbQuarter)
    {
        return invFinanceZyzbQuarterMapper.insertInvFinanceZyzbQuarter(invFinanceZyzbQuarter);
    }

    /**
     * 修改财务分析-重要指标-季度
     * 
     * @param invFinanceZyzbQuarter 财务分析-重要指标-季度
     * @return 结果
     */
    @Override
    public int updateInvFinanceZyzbQuarter(InvFinanceZyzbQuarter invFinanceZyzbQuarter)
    {
        return invFinanceZyzbQuarterMapper.updateInvFinanceZyzbQuarter(invFinanceZyzbQuarter);
    }

    /**
     * 批量删除财务分析-重要指标-季度
     * 
     * @param ids 需要删除的财务分析-重要指标-季度主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbQuarterByIds(String ids)
    {
        return invFinanceZyzbQuarterMapper.deleteInvFinanceZyzbQuarterByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-重要指标-季度信息
     * 
     * @param id 财务分析-重要指标-季度主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbQuarterById(Long id)
    {
        return invFinanceZyzbQuarterMapper.deleteInvFinanceZyzbQuarterById(id);
    }
}

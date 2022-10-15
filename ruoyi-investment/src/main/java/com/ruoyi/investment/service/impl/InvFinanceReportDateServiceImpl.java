package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceReportDateMapper;
import com.ruoyi.investment.domain.InvFinanceReportDate;
import com.ruoyi.investment.service.IInvFinanceReportDateService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-报告日期Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-10-15
 */
@Service
public class InvFinanceReportDateServiceImpl implements IInvFinanceReportDateService 
{
    @Autowired
    private InvFinanceReportDateMapper invFinanceReportDateMapper;

    /**
     * 查询财务分析-报告日期
     * 
     * @param id 财务分析-报告日期主键
     * @return 财务分析-报告日期
     */
    @Override
    public InvFinanceReportDate selectInvFinanceReportDateById(Long id)
    {
        return invFinanceReportDateMapper.selectInvFinanceReportDateById(id);
    }

    /**
     * 查询财务分析-报告日期列表
     * 
     * @param invFinanceReportDate 财务分析-报告日期
     * @return 财务分析-报告日期
     */
    @Override
    public List<InvFinanceReportDate> selectInvFinanceReportDateList(InvFinanceReportDate invFinanceReportDate)
    {
        return invFinanceReportDateMapper.selectInvFinanceReportDateList(invFinanceReportDate);
    }

    /**
     * 新增财务分析-报告日期
     * 
     * @param invFinanceReportDate 财务分析-报告日期
     * @return 结果
     */
    @Override
    public int insertInvFinanceReportDate(InvFinanceReportDate invFinanceReportDate)
    {
        return invFinanceReportDateMapper.insertInvFinanceReportDate(invFinanceReportDate);
    }

    /**
     * 修改财务分析-报告日期
     * 
     * @param invFinanceReportDate 财务分析-报告日期
     * @return 结果
     */
    @Override
    public int updateInvFinanceReportDate(InvFinanceReportDate invFinanceReportDate)
    {
        return invFinanceReportDateMapper.updateInvFinanceReportDate(invFinanceReportDate);
    }

    /**
     * 批量删除财务分析-报告日期
     * 
     * @param ids 需要删除的财务分析-报告日期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceReportDateByIds(String ids)
    {
        return invFinanceReportDateMapper.deleteInvFinanceReportDateByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-报告日期信息
     * 
     * @param id 财务分析-报告日期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceReportDateById(Long id)
    {
        return invFinanceReportDateMapper.deleteInvFinanceReportDateById(id);
    }
}

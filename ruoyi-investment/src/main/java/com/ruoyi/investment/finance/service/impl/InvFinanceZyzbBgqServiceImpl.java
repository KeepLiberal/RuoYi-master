package com.ruoyi.investment.finance.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.investment.finance.domain.InvFinanceZyzbBgq;
import com.ruoyi.investment.finance.mapper.InvFinanceZyzbBgqMapper;
import com.ruoyi.investment.finance.service.IInvFinanceZyzbBgqService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 财务分析-重要指标-报告期Service业务层处理
 *
 * @author yangwenyang
 * @date 2022-11-10
 */
@Service
public class InvFinanceZyzbBgqServiceImpl implements IInvFinanceZyzbBgqService {
    @Resource
    private InvFinanceZyzbBgqMapper invFinanceZyzbBgqMapper;

    /**
     * 查询财务分析-重要指标-报告期
     *
     * @param id 财务分析-重要指标-报告期主键
     * @return 财务分析-重要指标-报告期
     */
    @Override
    public InvFinanceZyzbBgq selectInvFinanceZyzbBgqById(Long id) {
        return invFinanceZyzbBgqMapper.selectInvFinanceZyzbBgqById(id);
    }

    /**
     * 查询财务分析-重要指标-报告期列表
     *
     * @param invFinanceZyzbBgq 财务分析-重要指标-报告期
     * @return 财务分析-重要指标-报告期
     */
    @Override
    public List<InvFinanceZyzbBgq> selectInvFinanceZyzbBgqList(InvFinanceZyzbBgq invFinanceZyzbBgq) {
        return invFinanceZyzbBgqMapper.selectInvFinanceZyzbBgqList(invFinanceZyzbBgq);
    }

    /**
     * 新增财务分析-重要指标-报告期
     *
     * @param invFinanceZyzbBgq 财务分析-重要指标-报告期
     * @return 结果
     */
    @Override
    public int insertInvFinanceZyzbBgq(InvFinanceZyzbBgq invFinanceZyzbBgq) {
        return invFinanceZyzbBgqMapper.insertInvFinanceZyzbBgq(invFinanceZyzbBgq);
    }

    /**
     * 修改财务分析-重要指标-报告期
     *
     * @param invFinanceZyzbBgq 财务分析-重要指标-报告期
     * @return 结果
     */
    @Override
    public int updateInvFinanceZyzbBgq(InvFinanceZyzbBgq invFinanceZyzbBgq) {
        return invFinanceZyzbBgqMapper.updateInvFinanceZyzbBgq(invFinanceZyzbBgq);
    }

    /**
     * 批量删除财务分析-重要指标-报告期
     *
     * @param ids 需要删除的财务分析-重要指标-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbBgqByIds(String ids) {
        return invFinanceZyzbBgqMapper.deleteInvFinanceZyzbBgqByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-重要指标-报告期信息
     *
     * @param id 财务分析-重要指标-报告期主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbBgqById(Long id) {
        return invFinanceZyzbBgqMapper.deleteInvFinanceZyzbBgqById(id);
    }
}

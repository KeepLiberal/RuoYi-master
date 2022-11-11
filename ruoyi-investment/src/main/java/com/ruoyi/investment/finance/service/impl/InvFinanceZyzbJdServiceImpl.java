package com.ruoyi.investment.finance.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.finance.mapper.InvFinanceZyzbJdMapper;
import com.ruoyi.investment.finance.domain.InvFinanceZyzbJd;
import com.ruoyi.investment.finance.service.IInvFinanceZyzbJdService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-重要指标-季度Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-11-11
 */
@Service
public class InvFinanceZyzbJdServiceImpl implements IInvFinanceZyzbJdService {
    @Resource
    private InvFinanceZyzbJdMapper invFinanceZyzbJdMapper;

    /**
     * 查询财务分析-重要指标-季度
     * 
     * @param id 财务分析-重要指标-季度主键
     * @return 财务分析-重要指标-季度
     */
    @Override
    public InvFinanceZyzbJd selectInvFinanceZyzbJdById(Long id) {
        return invFinanceZyzbJdMapper.selectInvFinanceZyzbJdById(id);
    }

    /**
     * 查询财务分析-重要指标-季度列表
     * 
     * @param invFinanceZyzbJd 财务分析-重要指标-季度
     * @return 财务分析-重要指标-季度
     */
    @Override
    public List<InvFinanceZyzbJd> selectInvFinanceZyzbJdList(InvFinanceZyzbJd invFinanceZyzbJd) {
        return invFinanceZyzbJdMapper.selectInvFinanceZyzbJdList(invFinanceZyzbJd);
    }

    /**
     * 新增财务分析-重要指标-季度
     * 
     * @param invFinanceZyzbJd 财务分析-重要指标-季度
     * @return 结果
     */
    @Override
    public int insertInvFinanceZyzbJd(InvFinanceZyzbJd invFinanceZyzbJd) {
        return invFinanceZyzbJdMapper.insertInvFinanceZyzbJd(invFinanceZyzbJd);
    }

    /**
     * 修改财务分析-重要指标-季度
     * 
     * @param invFinanceZyzbJd 财务分析-重要指标-季度
     * @return 结果
     */
    @Override
    public int updateInvFinanceZyzbJd(InvFinanceZyzbJd invFinanceZyzbJd) {
        return invFinanceZyzbJdMapper.updateInvFinanceZyzbJd(invFinanceZyzbJd);
    }

    /**
     * 批量删除财务分析-重要指标-季度
     * 
     * @param ids 需要删除的财务分析-重要指标-季度主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbJdByIds(String ids) {
        return invFinanceZyzbJdMapper.deleteInvFinanceZyzbJdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-重要指标-季度信息
     * 
     * @param id 财务分析-重要指标-季度主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbJdById(Long id) {
        return invFinanceZyzbJdMapper.deleteInvFinanceZyzbJdById(id);
    }
}

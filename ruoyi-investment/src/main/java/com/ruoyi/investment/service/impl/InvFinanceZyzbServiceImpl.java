package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZyzbMapper;
import com.ruoyi.investment.domain.InvFinanceZyzb;
import com.ruoyi.investment.service.IInvFinanceZyzbService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-主要指标Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Service
public class InvFinanceZyzbServiceImpl implements IInvFinanceZyzbService {
    @Resource
    private InvFinanceZyzbMapper invFinanceZyzbMapper;

    /**
     * 查询财务分析-主要指标
     * 
     * @param id 财务分析-主要指标主键
     * @return 财务分析-主要指标
     */
    @Override
    public InvFinanceZyzb selectInvFinanceZyzbById(Integer id) {
        return invFinanceZyzbMapper.selectInvFinanceZyzbById(id);
    }

    /**
     * 查询财务分析-主要指标列表
     * 
     * @param invFinanceZyzb 财务分析-主要指标
     * @return 财务分析-主要指标
     */
    @Override
    public List<InvFinanceZyzb> selectInvFinanceZyzbList(InvFinanceZyzb invFinanceZyzb) {
        return invFinanceZyzbMapper.selectInvFinanceZyzbList(invFinanceZyzb);
    }

    /**
     * 新增财务分析-主要指标
     * 
     * @param invFinanceZyzb 财务分析-主要指标
     * @return 结果
     */
    @Override
    public int insertInvFinanceZyzb(InvFinanceZyzb invFinanceZyzb) {
        return invFinanceZyzbMapper.insertInvFinanceZyzb(invFinanceZyzb);
    }

    /**
     * 修改财务分析-主要指标
     * 
     * @param invFinanceZyzb 财务分析-主要指标
     * @return 结果
     */
    @Override
    public int updateInvFinanceZyzb(InvFinanceZyzb invFinanceZyzb) {
        return invFinanceZyzbMapper.updateInvFinanceZyzb(invFinanceZyzb);
    }

    /**
     * 批量删除财务分析-主要指标
     * 
     * @param ids 需要删除的财务分析-主要指标主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbByIds(String ids) {
        return invFinanceZyzbMapper.deleteInvFinanceZyzbByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-主要指标信息
     * 
     * @param id 财务分析-主要指标主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbById(Integer id) {
        return invFinanceZyzbMapper.deleteInvFinanceZyzbById(id);
    }
}

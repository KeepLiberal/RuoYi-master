package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceBfbMapper;
import com.ruoyi.investment.domain.InvFinanceBfb;
import com.ruoyi.investment.service.IInvFinanceBfbService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-百分比Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Service
public class InvFinanceBfbServiceImpl implements IInvFinanceBfbService {
    @Resource
    private InvFinanceBfbMapper invFinanceBfbMapper;

    /**
     * 查询财务分析-百分比
     * 
     * @param id 财务分析-百分比主键
     * @return 财务分析-百分比
     */
    @Override
    public InvFinanceBfb selectInvFinanceBfbById(Integer id) {
        return invFinanceBfbMapper.selectInvFinanceBfbById(id);
    }

    /**
     * 查询财务分析-百分比列表
     * 
     * @param invFinanceBfb 财务分析-百分比
     * @return 财务分析-百分比
     */
    @Override
    public List<InvFinanceBfb> selectInvFinanceBfbList(InvFinanceBfb invFinanceBfb) {
        return invFinanceBfbMapper.selectInvFinanceBfbList(invFinanceBfb);
    }

    /**
     * 新增财务分析-百分比
     * 
     * @param invFinanceBfb 财务分析-百分比
     * @return 结果
     */
    @Override
    public int insertInvFinanceBfb(InvFinanceBfb invFinanceBfb) {
        return invFinanceBfbMapper.insertInvFinanceBfb(invFinanceBfb);
    }

    /**
     * 修改财务分析-百分比
     * 
     * @param invFinanceBfb 财务分析-百分比
     * @return 结果
     */
    @Override
    public int updateInvFinanceBfb(InvFinanceBfb invFinanceBfb) {
        return invFinanceBfbMapper.updateInvFinanceBfb(invFinanceBfb);
    }

    /**
     * 批量删除财务分析-百分比
     * 
     * @param ids 需要删除的财务分析-百分比主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceBfbByIds(String ids) {
        return invFinanceBfbMapper.deleteInvFinanceBfbByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-百分比信息
     * 
     * @param id 财务分析-百分比主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceBfbById(Integer id) {
        return invFinanceBfbMapper.deleteInvFinanceBfbById(id);
    }
}

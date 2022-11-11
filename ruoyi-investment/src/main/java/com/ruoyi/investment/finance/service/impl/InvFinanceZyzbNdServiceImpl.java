package com.ruoyi.investment.finance.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.finance.mapper.InvFinanceZyzbNdMapper;
import com.ruoyi.investment.finance.domain.InvFinanceZyzbNd;
import com.ruoyi.investment.finance.service.IInvFinanceZyzbNdService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-重要指标-年度Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-11-11
 */
@Service
public class InvFinanceZyzbNdServiceImpl implements IInvFinanceZyzbNdService {
    @Resource
    private InvFinanceZyzbNdMapper invFinanceZyzbNdMapper;

    /**
     * 查询财务分析-重要指标-年度
     * 
     * @param id 财务分析-重要指标-年度主键
     * @return 财务分析-重要指标-年度
     */
    @Override
    public InvFinanceZyzbNd selectInvFinanceZyzbNdById(Long id) {
        return invFinanceZyzbNdMapper.selectInvFinanceZyzbNdById(id);
    }

    /**
     * 查询财务分析-重要指标-年度列表
     * 
     * @param invFinanceZyzbNd 财务分析-重要指标-年度
     * @return 财务分析-重要指标-年度
     */
    @Override
    public List<InvFinanceZyzbNd> selectInvFinanceZyzbNdList(InvFinanceZyzbNd invFinanceZyzbNd) {
        return invFinanceZyzbNdMapper.selectInvFinanceZyzbNdList(invFinanceZyzbNd);
    }

    /**
     * 新增财务分析-重要指标-年度
     * 
     * @param invFinanceZyzbNd 财务分析-重要指标-年度
     * @return 结果
     */
    @Override
    public int insertInvFinanceZyzbNd(InvFinanceZyzbNd invFinanceZyzbNd) {
        return invFinanceZyzbNdMapper.insertInvFinanceZyzbNd(invFinanceZyzbNd);
    }

    /**
     * 修改财务分析-重要指标-年度
     * 
     * @param invFinanceZyzbNd 财务分析-重要指标-年度
     * @return 结果
     */
    @Override
    public int updateInvFinanceZyzbNd(InvFinanceZyzbNd invFinanceZyzbNd) {
        return invFinanceZyzbNdMapper.updateInvFinanceZyzbNd(invFinanceZyzbNd);
    }

    /**
     * 批量删除财务分析-重要指标-年度
     * 
     * @param ids 需要删除的财务分析-重要指标-年度主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbNdByIds(String ids) {
        return invFinanceZyzbNdMapper.deleteInvFinanceZyzbNdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-重要指标-年度信息
     * 
     * @param id 财务分析-重要指标-年度主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZyzbNdById(Long id) {
        return invFinanceZyzbNdMapper.deleteInvFinanceZyzbNdById(id);
    }
}

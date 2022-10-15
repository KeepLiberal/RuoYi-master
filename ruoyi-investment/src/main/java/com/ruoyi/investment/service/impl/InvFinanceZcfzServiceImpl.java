package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceZcfzMapper;
import com.ruoyi.investment.domain.InvFinanceZcfz;
import com.ruoyi.investment.service.IInvFinanceZcfzService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-资产负债Service业务层处理
 * 
 * @author yangwenyang
 * @date 2022-10-15
 */
@Service
public class InvFinanceZcfzServiceImpl implements IInvFinanceZcfzService 
{
    @Autowired
    private InvFinanceZcfzMapper invFinanceZcfzMapper;

    /**
     * 查询财务分析-资产负债
     * 
     * @param id 财务分析-资产负债主键
     * @return 财务分析-资产负债
     */
    @Override
    public InvFinanceZcfz selectInvFinanceZcfzById(Long id)
    {
        return invFinanceZcfzMapper.selectInvFinanceZcfzById(id);
    }

    /**
     * 查询财务分析-资产负债列表
     * 
     * @param invFinanceZcfz 财务分析-资产负债
     * @return 财务分析-资产负债
     */
    @Override
    public List<InvFinanceZcfz> selectInvFinanceZcfzList(InvFinanceZcfz invFinanceZcfz)
    {
        return invFinanceZcfzMapper.selectInvFinanceZcfzList(invFinanceZcfz);
    }

    /**
     * 新增财务分析-资产负债
     * 
     * @param invFinanceZcfz 财务分析-资产负债
     * @return 结果
     */
    @Override
    public int insertInvFinanceZcfz(InvFinanceZcfz invFinanceZcfz)
    {
        return invFinanceZcfzMapper.insertInvFinanceZcfz(invFinanceZcfz);
    }

    /**
     * 修改财务分析-资产负债
     * 
     * @param invFinanceZcfz 财务分析-资产负债
     * @return 结果
     */
    @Override
    public int updateInvFinanceZcfz(InvFinanceZcfz invFinanceZcfz)
    {
        return invFinanceZcfzMapper.updateInvFinanceZcfz(invFinanceZcfz);
    }

    /**
     * 批量删除财务分析-资产负债
     * 
     * @param ids 需要删除的财务分析-资产负债主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzByIds(String ids)
    {
        return invFinanceZcfzMapper.deleteInvFinanceZcfzByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-资产负债信息
     * 
     * @param id 财务分析-资产负债主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceZcfzById(Long id)
    {
        return invFinanceZcfzMapper.deleteInvFinanceZcfzById(id);
    }
}

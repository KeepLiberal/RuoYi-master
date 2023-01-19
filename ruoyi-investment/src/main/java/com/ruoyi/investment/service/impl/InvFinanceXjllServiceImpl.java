package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceXjllMapper;
import com.ruoyi.investment.domain.InvFinanceXjll;
import com.ruoyi.investment.service.IInvFinanceXjllService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-现金流量Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Service
public class InvFinanceXjllServiceImpl implements IInvFinanceXjllService {
    @Resource
    private InvFinanceXjllMapper invFinanceXjllMapper;

    /**
     * 查询财务分析-现金流量
     * 
     * @param id 财务分析-现金流量主键
     * @return 财务分析-现金流量
     */
    @Override
    public InvFinanceXjll selectInvFinanceXjllById(Integer id) {
        return invFinanceXjllMapper.selectInvFinanceXjllById(id);
    }

    /**
     * 查询财务分析-现金流量列表
     * 
     * @param invFinanceXjll 财务分析-现金流量
     * @return 财务分析-现金流量
     */
    @Override
    public List<InvFinanceXjll> selectInvFinanceXjllList(InvFinanceXjll invFinanceXjll) {
        return invFinanceXjllMapper.selectInvFinanceXjllList(invFinanceXjll);
    }

    /**
     * 新增财务分析-现金流量
     * 
     * @param invFinanceXjll 财务分析-现金流量
     * @return 结果
     */
    @Override
    public int insertInvFinanceXjll(InvFinanceXjll invFinanceXjll) {
        return invFinanceXjllMapper.insertInvFinanceXjll(invFinanceXjll);
    }

    /**
     * 修改财务分析-现金流量
     * 
     * @param invFinanceXjll 财务分析-现金流量
     * @return 结果
     */
    @Override
    public int updateInvFinanceXjll(InvFinanceXjll invFinanceXjll) {
        return invFinanceXjllMapper.updateInvFinanceXjll(invFinanceXjll);
    }

    /**
     * 批量删除财务分析-现金流量
     * 
     * @param ids 需要删除的财务分析-现金流量主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceXjllByIds(String ids) {
        return invFinanceXjllMapper.deleteInvFinanceXjllByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-现金流量信息
     * 
     * @param id 财务分析-现金流量主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceXjllById(Integer id) {
        return invFinanceXjllMapper.deleteInvFinanceXjllById(id);
    }
}

package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFinanceDbfxMapper;
import com.ruoyi.investment.domain.InvFinanceDbfx;
import com.ruoyi.investment.service.IInvFinanceDbfxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财务分析-杜邦分析Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Service
public class InvFinanceDbfxServiceImpl implements IInvFinanceDbfxService {
    @Resource
    private InvFinanceDbfxMapper invFinanceDbfxMapper;

    /**
     * 查询财务分析-杜邦分析
     * 
     * @param id 财务分析-杜邦分析主键
     * @return 财务分析-杜邦分析
     */
    @Override
    public InvFinanceDbfx selectInvFinanceDbfxById(Integer id) {
        return invFinanceDbfxMapper.selectInvFinanceDbfxById(id);
    }

    /**
     * 查询财务分析-杜邦分析列表
     * 
     * @param invFinanceDbfx 财务分析-杜邦分析
     * @return 财务分析-杜邦分析
     */
    @Override
    public List<InvFinanceDbfx> selectInvFinanceDbfxList(InvFinanceDbfx invFinanceDbfx) {
        return invFinanceDbfxMapper.selectInvFinanceDbfxList(invFinanceDbfx);
    }

    /**
     * 新增财务分析-杜邦分析
     * 
     * @param invFinanceDbfx 财务分析-杜邦分析
     * @return 结果
     */
    @Override
    public int insertInvFinanceDbfx(InvFinanceDbfx invFinanceDbfx) {
        return invFinanceDbfxMapper.insertInvFinanceDbfx(invFinanceDbfx);
    }

    /**
     * 修改财务分析-杜邦分析
     * 
     * @param invFinanceDbfx 财务分析-杜邦分析
     * @return 结果
     */
    @Override
    public int updateInvFinanceDbfx(InvFinanceDbfx invFinanceDbfx) {
        return invFinanceDbfxMapper.updateInvFinanceDbfx(invFinanceDbfx);
    }

    /**
     * 批量删除财务分析-杜邦分析
     * 
     * @param ids 需要删除的财务分析-杜邦分析主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceDbfxByIds(String ids) {
        return invFinanceDbfxMapper.deleteInvFinanceDbfxByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财务分析-杜邦分析信息
     * 
     * @param id 财务分析-杜邦分析主键
     * @return 结果
     */
    @Override
    public int deleteInvFinanceDbfxById(Integer id) {
        return invFinanceDbfxMapper.deleteInvFinanceDbfxById(id);
    }
}

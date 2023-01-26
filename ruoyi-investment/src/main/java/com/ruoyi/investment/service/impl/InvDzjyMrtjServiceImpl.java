package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvDzjyMrtjMapper;
import com.ruoyi.investment.domain.InvDzjyMrtj;
import com.ruoyi.investment.service.IInvDzjyMrtjService;
import com.ruoyi.common.core.text.Convert;

/**
 * 大宗交易-每日统计Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
@Service
public class InvDzjyMrtjServiceImpl implements IInvDzjyMrtjService {
    @Resource
    private InvDzjyMrtjMapper invDzjyMrtjMapper;

    /**
     * 查询大宗交易-每日统计
     * 
     * @param id 大宗交易-每日统计主键
     * @return 大宗交易-每日统计
     */
    @Override
    public InvDzjyMrtj selectInvDzjyMrtjById(Integer id) {
        return invDzjyMrtjMapper.selectInvDzjyMrtjById(id);
    }

    /**
     * 查询大宗交易-每日统计列表
     * 
     * @param invDzjyMrtj 大宗交易-每日统计
     * @return 大宗交易-每日统计
     */
    @Override
    public List<InvDzjyMrtj> selectInvDzjyMrtjList(InvDzjyMrtj invDzjyMrtj) {
        return invDzjyMrtjMapper.selectInvDzjyMrtjList(invDzjyMrtj);
    }

    /**
     * 新增大宗交易-每日统计
     * 
     * @param invDzjyMrtj 大宗交易-每日统计
     * @return 结果
     */
    @Override
    public int insertInvDzjyMrtj(InvDzjyMrtj invDzjyMrtj) {
        return invDzjyMrtjMapper.insertInvDzjyMrtj(invDzjyMrtj);
    }

    /**
     * 修改大宗交易-每日统计
     * 
     * @param invDzjyMrtj 大宗交易-每日统计
     * @return 结果
     */
    @Override
    public int updateInvDzjyMrtj(InvDzjyMrtj invDzjyMrtj) {
        return invDzjyMrtjMapper.updateInvDzjyMrtj(invDzjyMrtj);
    }

    /**
     * 批量删除大宗交易-每日统计
     * 
     * @param ids 需要删除的大宗交易-每日统计主键
     * @return 结果
     */
    @Override
    public int deleteInvDzjyMrtjByIds(String ids) {
        return invDzjyMrtjMapper.deleteInvDzjyMrtjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除大宗交易-每日统计信息
     * 
     * @param id 大宗交易-每日统计主键
     * @return 结果
     */
    @Override
    public int deleteInvDzjyMrtjById(Integer id) {
        return invDzjyMrtjMapper.deleteInvDzjyMrtjById(id);
    }
}

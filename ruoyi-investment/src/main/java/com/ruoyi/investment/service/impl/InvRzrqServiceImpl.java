package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvRzrqMapper;
import com.ruoyi.investment.domain.InvRzrq;
import com.ruoyi.investment.service.IInvRzrqService;
import com.ruoyi.common.core.text.Convert;

/**
 * 融资融券Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-22
 */
@Service
public class InvRzrqServiceImpl implements IInvRzrqService {
    @Resource
    private InvRzrqMapper invRzrqMapper;

    /**
     * 查询融资融券
     * 
     * @param id 融资融券主键
     * @return 融资融券
     */
    @Override
    public InvRzrq selectInvRzrqById(Integer id) {
        return invRzrqMapper.selectInvRzrqById(id);
    }

    /**
     * 查询融资融券列表
     * 
     * @param invRzrq 融资融券
     * @return 融资融券
     */
    @Override
    public List<InvRzrq> selectInvRzrqList(InvRzrq invRzrq) {
        return invRzrqMapper.selectInvRzrqList(invRzrq);
    }

    /**
     * 新增融资融券
     * 
     * @param invRzrq 融资融券
     * @return 结果
     */
    @Override
    public int insertInvRzrq(InvRzrq invRzrq) {
        return invRzrqMapper.insertInvRzrq(invRzrq);
    }

    /**
     * 修改融资融券
     * 
     * @param invRzrq 融资融券
     * @return 结果
     */
    @Override
    public int updateInvRzrq(InvRzrq invRzrq) {
        return invRzrqMapper.updateInvRzrq(invRzrq);
    }

    /**
     * 批量删除融资融券
     * 
     * @param ids 需要删除的融资融券主键
     * @return 结果
     */
    @Override
    public int deleteInvRzrqByIds(String ids) {
        return invRzrqMapper.deleteInvRzrqByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除融资融券信息
     * 
     * @param id 融资融券主键
     * @return 结果
     */
    @Override
    public int deleteInvRzrqById(Integer id) {
        return invRzrqMapper.deleteInvRzrqById(id);
    }
}

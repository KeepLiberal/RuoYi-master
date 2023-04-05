package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFhrzPgmxMapper;
import com.ruoyi.investment.domain.InvFhrzPgmx;
import com.ruoyi.investment.service.IInvFhrzPgmxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 配股明细Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
@Service
public class InvFhrzPgmxServiceImpl implements IInvFhrzPgmxService {
    @Resource
    private InvFhrzPgmxMapper invFhrzPgmxMapper;

    /**
     * 查询配股明细
     * 
     * @param id 配股明细主键
     * @return 配股明细
     */
    @Override
    public InvFhrzPgmx selectInvFhrzPgmxById(Integer id) {
        return invFhrzPgmxMapper.selectInvFhrzPgmxById(id);
    }

    /**
     * 查询配股明细列表
     * 
     * @param invFhrzPgmx 配股明细
     * @return 配股明细
     */
    @Override
    public List<InvFhrzPgmx> selectInvFhrzPgmxList(InvFhrzPgmx invFhrzPgmx) {
        return invFhrzPgmxMapper.selectInvFhrzPgmxList(invFhrzPgmx);
    }

    /**
     * 新增配股明细
     * 
     * @param invFhrzPgmx 配股明细
     * @return 结果
     */
    @Override
    public int insertInvFhrzPgmx(InvFhrzPgmx invFhrzPgmx) {
        return invFhrzPgmxMapper.insertInvFhrzPgmx(invFhrzPgmx);
    }

    /**
     * 修改配股明细
     * 
     * @param invFhrzPgmx 配股明细
     * @return 结果
     */
    @Override
    public int updateInvFhrzPgmx(InvFhrzPgmx invFhrzPgmx) {
        return invFhrzPgmxMapper.updateInvFhrzPgmx(invFhrzPgmx);
    }

    /**
     * 批量删除配股明细
     * 
     * @param ids 需要删除的配股明细主键
     * @return 结果
     */
    @Override
    public int deleteInvFhrzPgmxByIds(String ids) {
        return invFhrzPgmxMapper.deleteInvFhrzPgmxByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除配股明细信息
     * 
     * @param id 配股明细主键
     * @return 结果
     */
    @Override
    public int deleteInvFhrzPgmxById(Integer id) {
        return invFhrzPgmxMapper.deleteInvFhrzPgmxById(id);
    }
}

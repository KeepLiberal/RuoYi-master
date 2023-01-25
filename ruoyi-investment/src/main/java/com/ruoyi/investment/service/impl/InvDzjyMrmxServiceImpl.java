package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvDzjyMrmxMapper;
import com.ruoyi.investment.domain.InvDzjyMrmx;
import com.ruoyi.investment.service.IInvDzjyMrmxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 大宗交易-每日明细Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-24
 */
@Service
public class InvDzjyMrmxServiceImpl implements IInvDzjyMrmxService {
    @Resource
    private InvDzjyMrmxMapper invDzjyMrmxMapper;

    /**
     * 查询大宗交易-每日明细
     * 
     * @param id 大宗交易-每日明细主键
     * @return 大宗交易-每日明细
     */
    @Override
    public InvDzjyMrmx selectInvDzjyMrmxById(Integer id) {
        return invDzjyMrmxMapper.selectInvDzjyMrmxById(id);
    }

    /**
     * 查询大宗交易-每日明细列表
     * 
     * @param invDzjyMrmx 大宗交易-每日明细
     * @return 大宗交易-每日明细
     */
    @Override
    public List<InvDzjyMrmx> selectInvDzjyMrmxList(InvDzjyMrmx invDzjyMrmx) {
        return invDzjyMrmxMapper.selectInvDzjyMrmxList(invDzjyMrmx);
    }

    /**
     * 新增大宗交易-每日明细
     * 
     * @param invDzjyMrmx 大宗交易-每日明细
     * @return 结果
     */
    @Override
    public int insertInvDzjyMrmx(InvDzjyMrmx invDzjyMrmx) {
        return invDzjyMrmxMapper.insertInvDzjyMrmx(invDzjyMrmx);
    }

    /**
     * 修改大宗交易-每日明细
     * 
     * @param invDzjyMrmx 大宗交易-每日明细
     * @return 结果
     */
    @Override
    public int updateInvDzjyMrmx(InvDzjyMrmx invDzjyMrmx) {
        return invDzjyMrmxMapper.updateInvDzjyMrmx(invDzjyMrmx);
    }

    /**
     * 批量删除大宗交易-每日明细
     * 
     * @param ids 需要删除的大宗交易-每日明细主键
     * @return 结果
     */
    @Override
    public int deleteInvDzjyMrmxByIds(String ids) {
        return invDzjyMrmxMapper.deleteInvDzjyMrmxByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除大宗交易-每日明细信息
     * 
     * @param id 大宗交易-每日明细主键
     * @return 结果
     */
    @Override
    public int deleteInvDzjyMrmxById(Integer id) {
        return invDzjyMrmxMapper.deleteInvDzjyMrmxById(id);
    }
}

package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFhrzZfmxMapper;
import com.ruoyi.investment.domain.InvFhrzZfmx;
import com.ruoyi.investment.service.IInvFhrzZfmxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 增发明细Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
@Service
public class InvFhrzZfmxServiceImpl implements IInvFhrzZfmxService {
    @Resource
    private InvFhrzZfmxMapper invFhrzZfmxMapper;

    /**
     * 查询增发明细
     * 
     * @param id 增发明细主键
     * @return 增发明细
     */
    @Override
    public InvFhrzZfmx selectInvFhrzZfmxById(Integer id) {
        return invFhrzZfmxMapper.selectInvFhrzZfmxById(id);
    }

    /**
     * 查询增发明细列表
     * 
     * @param invFhrzZfmx 增发明细
     * @return 增发明细
     */
    @Override
    public List<InvFhrzZfmx> selectInvFhrzZfmxList(InvFhrzZfmx invFhrzZfmx) {
        return invFhrzZfmxMapper.selectInvFhrzZfmxList(invFhrzZfmx);
    }

    /**
     * 新增增发明细
     * 
     * @param invFhrzZfmx 增发明细
     * @return 结果
     */
    @Override
    public int insertInvFhrzZfmx(InvFhrzZfmx invFhrzZfmx) {
        return invFhrzZfmxMapper.insertInvFhrzZfmx(invFhrzZfmx);
    }

    /**
     * 修改增发明细
     * 
     * @param invFhrzZfmx 增发明细
     * @return 结果
     */
    @Override
    public int updateInvFhrzZfmx(InvFhrzZfmx invFhrzZfmx) {
        return invFhrzZfmxMapper.updateInvFhrzZfmx(invFhrzZfmx);
    }

    /**
     * 批量删除增发明细
     * 
     * @param ids 需要删除的增发明细主键
     * @return 结果
     */
    @Override
    public int deleteInvFhrzZfmxByIds(String ids) {
        return invFhrzZfmxMapper.deleteInvFhrzZfmxByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除增发明细信息
     * 
     * @param id 增发明细主键
     * @return 结果
     */
    @Override
    public int deleteInvFhrzZfmxById(Integer id) {
        return invFhrzZfmxMapper.deleteInvFhrzZfmxById(id);
    }
}

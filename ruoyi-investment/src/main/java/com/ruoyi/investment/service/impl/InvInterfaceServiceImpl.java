package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvInterfaceMapper;
import com.ruoyi.investment.domain.InvInterface;
import com.ruoyi.investment.service.IInvInterfaceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 接口配置Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-02
 */
@Service
public class InvInterfaceServiceImpl implements IInvInterfaceService {
    @Resource
    private InvInterfaceMapper invInterfaceMapper;

    /**
     * 查询接口配置
     * 
     * @param id 接口配置主键
     * @return 接口配置
     */
    @Override
    public InvInterface selectInvInterfaceById(Long id) {
        return invInterfaceMapper.selectInvInterfaceById(id);
    }

    /**
     * 查询接口配置列表
     * 
     * @param invInterface 接口配置
     * @return 接口配置
     */
    @Override
    public List<InvInterface> selectInvInterfaceList(InvInterface invInterface) {
        return invInterfaceMapper.selectInvInterfaceList(invInterface);
    }

    /**
     * 新增接口配置
     * 
     * @param invInterface 接口配置
     * @return 结果
     */
    @Override
    public int insertInvInterface(InvInterface invInterface) {
        return invInterfaceMapper.insertInvInterface(invInterface);
    }

    /**
     * 修改接口配置
     * 
     * @param invInterface 接口配置
     * @return 结果
     */
    @Override
    public int updateInvInterface(InvInterface invInterface) {
        return invInterfaceMapper.updateInvInterface(invInterface);
    }

    /**
     * 批量删除接口配置
     * 
     * @param ids 需要删除的接口配置主键
     * @return 结果
     */
    @Override
    public int deleteInvInterfaceByIds(String ids) {
        return invInterfaceMapper.deleteInvInterfaceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除接口配置信息
     * 
     * @param id 接口配置主键
     * @return 结果
     */
    @Override
    public int deleteInvInterfaceById(Long id) {
        return invInterfaceMapper.deleteInvInterfaceById(id);
    }
}

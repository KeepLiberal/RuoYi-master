package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvInterface;

/**
 * 接口配置Service接口
 * 
 * @author yangwenyang
 * @date 2023-01-02
 */
public interface IInvInterfaceService {
    /**
     * 查询接口配置
     * 
     * @param id 接口配置主键
     * @return 接口配置
     */
    public InvInterface selectInvInterfaceById(Long id);

    /**
     * 查询接口配置列表
     * 
     * @param invInterface 接口配置
     * @return 接口配置集合
     */
    public List<InvInterface> selectInvInterfaceList(InvInterface invInterface);

    /**
     * 新增接口配置
     * 
     * @param invInterface 接口配置
     * @return 结果
     */
    public int insertInvInterface(InvInterface invInterface);

    /**
     * 修改接口配置
     * 
     * @param invInterface 接口配置
     * @return 结果
     */
    public int updateInvInterface(InvInterface invInterface);

    /**
     * 批量删除接口配置
     * 
     * @param ids 需要删除的接口配置主键集合
     * @return 结果
     */
    public int deleteInvInterfaceByIds(String ids);

    /**
     * 删除接口配置信息
     * 
     * @param id 接口配置主键
     * @return 结果
     */
    public int deleteInvInterfaceById(Long id);
}

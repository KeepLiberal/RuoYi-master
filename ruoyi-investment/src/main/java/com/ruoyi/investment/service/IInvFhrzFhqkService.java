package com.ruoyi.investment.service;

import java.util.List;
import com.ruoyi.investment.domain.InvFhrzFhqk;

/**
 * 分红情况Service接口
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
public interface IInvFhrzFhqkService {
    /**
     * 查询分红情况
     * 
     * @param id 分红情况主键
     * @return 分红情况
     */
    public InvFhrzFhqk selectInvFhrzFhqkById(Integer id);

    /**
     * 查询分红情况列表
     * 
     * @param invFhrzFhqk 分红情况
     * @return 分红情况集合
     */
    public List<InvFhrzFhqk> selectInvFhrzFhqkList(InvFhrzFhqk invFhrzFhqk);

    /**
     * 新增分红情况
     * 
     * @param invFhrzFhqk 分红情况
     * @return 结果
     */
    public int insertInvFhrzFhqk(InvFhrzFhqk invFhrzFhqk);

    /**
     * 修改分红情况
     * 
     * @param invFhrzFhqk 分红情况
     * @return 结果
     */
    public int updateInvFhrzFhqk(InvFhrzFhqk invFhrzFhqk);

    /**
     * 批量删除分红情况
     * 
     * @param ids 需要删除的分红情况主键集合
     * @return 结果
     */
    public int deleteInvFhrzFhqkByIds(String ids);

    /**
     * 删除分红情况信息
     * 
     * @param id 分红情况主键
     * @return 结果
     */
    public int deleteInvFhrzFhqkById(Integer id);
}

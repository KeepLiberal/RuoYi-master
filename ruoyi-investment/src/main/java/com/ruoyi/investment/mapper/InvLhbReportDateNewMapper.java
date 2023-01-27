package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvLhbReportDateNew;

/**
 * 龙虎榜上榜日期(新增)Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-27
 */
public interface InvLhbReportDateNewMapper {
    /**
     * 查询龙虎榜上榜日期(新增)
     * 
     * @param id 龙虎榜上榜日期(新增)主键
     * @return 龙虎榜上榜日期(新增)
     */
    public InvLhbReportDateNew selectInvLhbReportDateNewById(Integer id);

    /**
     * 查询龙虎榜上榜日期(新增)列表
     * 
     * @param invLhbReportDateNew 龙虎榜上榜日期(新增)
     * @return 龙虎榜上榜日期(新增)集合
     */
    public List<InvLhbReportDateNew> selectInvLhbReportDateNewList(InvLhbReportDateNew invLhbReportDateNew);

    /**
     * 新增龙虎榜上榜日期(新增)
     * 
     * @param invLhbReportDateNew 龙虎榜上榜日期(新增)
     * @return 结果
     */
    public int insertInvLhbReportDateNew(InvLhbReportDateNew invLhbReportDateNew);

    /**
     * 修改龙虎榜上榜日期(新增)
     * 
     * @param invLhbReportDateNew 龙虎榜上榜日期(新增)
     * @return 结果
     */
    public int updateInvLhbReportDateNew(InvLhbReportDateNew invLhbReportDateNew);

    /**
     * 删除龙虎榜上榜日期(新增)
     * 
     * @param id 龙虎榜上榜日期(新增)主键
     * @return 结果
     */
    public int deleteInvLhbReportDateNewById(Integer id);

    /**
     * 批量删除龙虎榜上榜日期(新增)
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvLhbReportDateNewByIds(String[] ids);

    /**
     * 删除所有龙虎榜上榜日期(新增)
     *
     * @return 结果
     */
    public int deleteInvLhbReportDateNewAll();
}

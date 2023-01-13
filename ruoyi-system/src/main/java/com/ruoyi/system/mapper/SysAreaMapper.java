package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysArea;

/**
 * 地区Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-13
 */
public interface SysAreaMapper {
    /**
     * 查询地区
     * 
     * @param id 地区主键
     * @return 地区
     */
    public SysArea selectSysAreaById(Integer id);

    /**
     * 查询地区列表
     * 
     * @param sysArea 地区
     * @return 地区集合
     */
    public List<SysArea> selectSysAreaList(SysArea sysArea);

    /**
     * 查询地区列表
     *
     * @return 地区集合
     */
    public List<SysArea> selectSysAreaList();

    /**
     * 新增地区
     * 
     * @param sysArea 地区
     * @return 结果
     */
    public int insertSysArea(SysArea sysArea);

    /**
     * 修改地区
     * 
     * @param sysArea 地区
     * @return 结果
     */
    public int updateSysArea(SysArea sysArea);

    /**
     * 删除地区
     * 
     * @param id 地区主键
     * @return 结果
     */
    public int deleteSysAreaById(Integer id);

    /**
     * 批量删除地区
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysAreaByIds(String[] ids);
}

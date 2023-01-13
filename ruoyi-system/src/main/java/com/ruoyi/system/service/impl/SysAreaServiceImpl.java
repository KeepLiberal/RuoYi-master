package com.ruoyi.system.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAreaMapper;
import com.ruoyi.system.domain.SysArea;
import com.ruoyi.system.service.ISysAreaService;
import com.ruoyi.common.core.text.Convert;

/**
 * 地区Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-13
 */
@Service
public class SysAreaServiceImpl implements ISysAreaService {
    @Resource
    private SysAreaMapper sysAreaMapper;

    /**
     * 查询地区
     * 
     * @param id 地区主键
     * @return 地区
     */
    @Override
    public SysArea selectSysAreaById(Integer id) {
        return sysAreaMapper.selectSysAreaById(id);
    }

    /**
     * 查询地区列表
     * 
     * @param sysArea 地区
     * @return 地区
     */
    @Override
    public List<SysArea> selectSysAreaList(SysArea sysArea) {
        return sysAreaMapper.selectSysAreaList(sysArea);
    }

    /**
     * 新增地区
     * 
     * @param sysArea 地区
     * @return 结果
     */
    @Override
    public int insertSysArea(SysArea sysArea) {
        return sysAreaMapper.insertSysArea(sysArea);
    }

    /**
     * 修改地区
     * 
     * @param sysArea 地区
     * @return 结果
     */
    @Override
    public int updateSysArea(SysArea sysArea) {
        return sysAreaMapper.updateSysArea(sysArea);
    }

    /**
     * 批量删除地区
     * 
     * @param ids 需要删除的地区主键
     * @return 结果
     */
    @Override
    public int deleteSysAreaByIds(String ids) {
        return sysAreaMapper.deleteSysAreaByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除地区信息
     * 
     * @param id 地区主键
     * @return 结果
     */
    @Override
    public int deleteSysAreaById(Integer id) {
        return sysAreaMapper.deleteSysAreaById(id);
    }
}

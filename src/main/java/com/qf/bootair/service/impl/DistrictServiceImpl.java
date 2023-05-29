package com.qf.bootair.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.bootair.dao.DistrictDao;
import com.qf.bootair.entity.District;
import com.qf.bootair.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Date 2023/5/29 10:45
 * @Author 人来疯
 * Version v1.0
 */
@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class DistrictServiceImpl implements DistrictService {
    final DistrictDao districtDao;
    @Override
    public District selectById(Integer id) {
        return districtDao.queryById(id);
    }

    @Override
    public PageInfo<District> selectByPage(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<District> airs = districtDao.listAll();
        PageInfo<District> info = new PageInfo<>(airs);
        return info;

    }

    @Override
    public Boolean insert(District district) {
        return districtDao.insert(district)>0;
    }

    @Override
    public Boolean update(District district) {
        return districtDao.update(district)>0;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return districtDao.deleteById(id)>0;
    }
}

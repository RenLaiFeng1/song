package com.qf.bootair.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.bootair.dao.AirDao;
import com.qf.bootair.entity.Air;
import com.qf.bootair.service.AirService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Date 2023/5/29 10:40
 * @Author 人来疯
 * Version v1.0
 */
@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class AirServiceImpl implements AirService {
    final AirDao airDao;
    @Override
    public Air selectById(Integer id) {
        return airDao.queryById(id);
    }

    @Override
    public PageInfo<Air> selectByPage(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        List<Air> airs=airDao.listAll();
        PageInfo<Air> info=new PageInfo<>(airs);
        return info;
    }

    @Override
    public Boolean insert(Air air) {
        return airDao.insert(air)>0;
    }

    @Override
    public Boolean update(Air air) {
        return airDao.update(air)>0;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return airDao.deleteById(id)>0;
    }
}

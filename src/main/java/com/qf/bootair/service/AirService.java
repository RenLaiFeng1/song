package com.qf.bootair.service;

import com.github.pagehelper.PageInfo;
import com.qf.bootair.entity.Air;

/**
 * @Date 2023/5/29 10:38
 * @Author 人来疯
 * Version v1.0
 */
public interface AirService {
    Air selectById(Integer id);

    PageInfo<Air> selectByPage(Integer page,Integer size);

    Boolean insert(Air air);
    Boolean update(Air air);
    Boolean deleteById(Integer id);
}

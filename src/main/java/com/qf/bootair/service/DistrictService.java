package com.qf.bootair.service;

import com.github.pagehelper.PageInfo;
import com.qf.bootair.entity.Air;
import com.qf.bootair.entity.District;

/**
 * @Date 2023/5/29 10:44
 * @Author 人来疯
 * Version v1.0
 */
public interface DistrictService {
    District selectById(Integer id);

    PageInfo<District> selectByPage(Integer page, Integer size);

    Boolean insert(District district);
    Boolean update(District district);
    Boolean deleteById(Integer id);
}

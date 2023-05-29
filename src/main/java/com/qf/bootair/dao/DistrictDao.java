package com.qf.bootair.dao;

import com.qf.bootair.entity.District;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (District)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-29 10:33:29
 */
public interface DistrictDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    District queryById(Integer id);

    /**
     * 列出所有
     *
     * @return 实例集合
     */
    List<District> listAll();

    /**
     * 统计总行数
     *
     * @param district 查询条件
     * @return 总行数
     */
    long count(District district);

    /**
     * 新增数据
     *
     * @param district 实例对象
     * @return 影响行数
     */
    int insert(District district);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<District> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<District> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<District> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<District> entities);

    /**
     * 修改数据
     *
     * @param district 实例对象
     * @return 影响行数
     */
    int update(District district);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


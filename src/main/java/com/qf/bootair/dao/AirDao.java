package com.qf.bootair.dao;

import com.qf.bootair.entity.Air;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 空气质量表(Air)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-29 10:33:30
 */
public interface AirDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Air queryById(Integer id);

    /**
     * 列出所有
     *
     * @return 实例集合
     */
    List<Air> listAll();

    /**
     * 统计总行数
     *
     * @param air 查询条件
     * @return 总行数
     */
    long count(Air air);

    /**
     * 新增数据
     *
     * @param air 实例对象
     * @return 影响行数
     */
    int insert(Air air);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Air> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Air> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Air> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Air> entities);

    /**
     * 修改数据
     *
     * @param air 实例对象
     * @return 影响行数
     */
    int update(Air air);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


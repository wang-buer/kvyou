package com.shanzhu.travel.common;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.provider.SqlServerProvider;


/**
 * Mapper 基本类接口
 *
 * @author: ShanZhu
 * @date: 2024-01-26
 */
public interface MapperBase<T> extends Mapper<T> {

    /**
     * 插入数据库，`null`值也会插入，不会使用列的默认值
     *
     * @param record
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @InsertProvider(type = SqlServerProvider.class, method = "dynamicSQL")
    @Override
    int insert(T record);

    /**
     * 插入数据库，`null`值也会插入，不会使用列的默认值
     *
     * @param record
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @InsertProvider(type = SqlServerProvider.class, method = "dynamicSQL")
    @Override
    int insertSelective(T record);

}

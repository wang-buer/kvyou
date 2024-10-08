package com.shanzhu.travel.common;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Service基本类接口
 *
 * @author: ShanZhu
 * @date: 2024-01-26
 */
public interface IServiceBase<E> {
    public List<E> select();

    public List<E> select(E y);

    public E find(Object id);

    public E findEntity(E id);

    public List<E> selectPage(E obj, int page, int pageSize);

    public List<E> selectPageExample(Example obj, int page, int pageSize);

    public int delete(Object id);

    public int insert(E y);

    public int update(E y);
}

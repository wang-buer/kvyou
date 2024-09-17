package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.ShoucangjiluMapper;
import com.shanzhu.travel.entity.Shoucangjilu;
import com.shanzhu.travel.service.ShoucangjiluService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
/**
 *  业务类
 */
@Service
public class ShoucangjiluServiceImpl extends ServiceBase<Shoucangjilu> implements ShoucangjiluService {
    @Resource
    protected ShoucangjiluMapper dao;
    @Override
    protected Mapper<Shoucangjilu> getDao() {
        return dao;
    }
}

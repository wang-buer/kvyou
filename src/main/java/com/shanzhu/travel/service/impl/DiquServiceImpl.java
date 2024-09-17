package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.DiquMapper;
import com.shanzhu.travel.service.DiquService;
import com.shanzhu.travel.entity.Diqu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DiquServiceImpl extends ServiceBase<Diqu> implements DiquService {
    @Resource
    private DiquMapper dao;

    @Override
    protected DiquMapper getDao() {
        return dao;
    }
}

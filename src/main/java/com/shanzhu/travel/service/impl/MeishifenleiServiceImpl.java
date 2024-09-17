package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.MeishifenleiMapper;
import com.shanzhu.travel.entity.Meishifenlei;
import com.shanzhu.travel.service.MeishifenleiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MeishifenleiServiceImpl extends ServiceBase<Meishifenlei> implements MeishifenleiService {
    @Resource
    private MeishifenleiMapper dao;

    @Override
    protected MeishifenleiMapper getDao() {
        return dao;
    }
}

package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.service.DifangmeishiService;
import com.shanzhu.travel.mapper.DifangmeishiMapper;
import com.shanzhu.travel.entity.Difangmeishi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DifangmeishiServiceImpl extends ServiceBase<Difangmeishi> implements DifangmeishiService {
    @Resource
    private DifangmeishiMapper dao;

    @Override
    protected DifangmeishiMapper getDao() {
        return dao;
    }
}

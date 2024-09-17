package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.YouqinglianjieMapper;
import com.shanzhu.travel.entity.Youqinglianjie;
import com.shanzhu.travel.service.YouqinglianjieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class YouqinglianjieServiceImpl extends ServiceBase<Youqinglianjie> implements YouqinglianjieService {
    @Resource
    private YouqinglianjieMapper dao;

    @Override
    protected YouqinglianjieMapper getDao() {
        return dao;
    }
}

package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.YudingMapper;
import com.shanzhu.travel.entity.Yuding;
import com.shanzhu.travel.service.YudingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class YudingServiceImpl extends ServiceBase<Yuding> implements YudingService {
    @Resource
    private YudingMapper dao;

    @Override
    protected YudingMapper getDao() {
        return dao;
    }
}

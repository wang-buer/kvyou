package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.entity.Lvyouxianlu;
import com.shanzhu.travel.mapper.LvyouxianluMapper;
import com.shanzhu.travel.service.LvyouxianluService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LvyouxianluServiceImpl extends ServiceBase<Lvyouxianlu> implements LvyouxianluService {
    @Resource
    private LvyouxianluMapper dao;

    @Override
    protected LvyouxianluMapper getDao() {
        return dao;
    }
}

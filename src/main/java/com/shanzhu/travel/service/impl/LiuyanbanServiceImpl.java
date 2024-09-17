package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.entity.Liuyanban;
import com.shanzhu.travel.service.LiuyanbanService;
import com.shanzhu.travel.mapper.LiuyanbanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LiuyanbanServiceImpl extends ServiceBase<Liuyanban> implements LiuyanbanService {
    @Resource
    private LiuyanbanMapper dao;

    @Override
    protected LiuyanbanMapper getDao() {
        return dao;
    }
}

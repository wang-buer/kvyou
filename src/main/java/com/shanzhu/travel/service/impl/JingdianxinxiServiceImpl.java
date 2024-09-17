package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.service.JingdianxinxiService;
import com.shanzhu.travel.mapper.JingdianxinxiMapper;
import com.shanzhu.travel.entity.Jingdianxinxi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JingdianxinxiServiceImpl extends ServiceBase<Jingdianxinxi> implements JingdianxinxiService {
    @Resource
    private JingdianxinxiMapper dao;

    @Override
    protected JingdianxinxiMapper getDao() {
        return dao;
    }
}

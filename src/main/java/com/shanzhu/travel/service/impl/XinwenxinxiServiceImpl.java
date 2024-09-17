package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.XinwenxinxiMapper;
import com.shanzhu.travel.entity.Xinwenxinxi;
import com.shanzhu.travel.service.XinwenxinxiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class XinwenxinxiServiceImpl extends ServiceBase<Xinwenxinxi> implements XinwenxinxiService {
    @Resource
    private XinwenxinxiMapper dao;

    @Override
    protected XinwenxinxiMapper getDao() {
        return dao;
    }
}

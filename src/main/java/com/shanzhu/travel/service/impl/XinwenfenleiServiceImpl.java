package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.XinwenfenleiMapper;
import com.shanzhu.travel.entity.Xinwenfenlei;
import com.shanzhu.travel.service.XinwenfenleiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class XinwenfenleiServiceImpl extends ServiceBase<Xinwenfenlei> implements XinwenfenleiService {
    @Resource
    private XinwenfenleiMapper dao;

    @Override
    protected XinwenfenleiMapper getDao() {
        return dao;
    }
}

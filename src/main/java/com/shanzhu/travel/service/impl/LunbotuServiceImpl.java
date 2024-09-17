package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.LunbotuMapper;
import com.shanzhu.travel.entity.Lunbotu;
import com.shanzhu.travel.service.LunbotuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LunbotuServiceImpl extends ServiceBase<Lunbotu> implements LunbotuService {
    @Resource
    private LunbotuMapper dao;

    @Override
    protected LunbotuMapper getDao() {
        return dao;
    }
}

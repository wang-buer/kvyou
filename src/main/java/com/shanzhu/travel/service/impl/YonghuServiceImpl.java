package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.mapper.YonghuMapper;
import com.shanzhu.travel.entity.Yonghu;
import com.shanzhu.travel.service.YonghuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class YonghuServiceImpl extends ServiceBase<Yonghu> implements YonghuService {
    @Resource
    private YonghuMapper dao;

    @Override
    protected YonghuMapper getDao() {
        return dao;
    }
    public Yonghu login(String username, String password) {
        Yonghu user = new Yonghu();
        user.setYonghuming(username);
            user.setMima(password);

        return this.dao.login(user);
    }

    public boolean updatePassword(int id, String newPassword) {
        Yonghu user = new Yonghu();
        user.setId(id);
            user.setMima(newPassword);
        int i = this.dao.updateByPrimaryKeySelective(user);
        return i == 1;
    }
}

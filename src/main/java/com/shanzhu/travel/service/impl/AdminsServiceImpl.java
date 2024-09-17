package com.shanzhu.travel.service.impl;

import com.shanzhu.travel.common.ServiceBase;
import com.shanzhu.travel.service.AdminsService;
import com.shanzhu.travel.mapper.AdminsMapper;
import com.shanzhu.travel.entity.Admins;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminsServiceImpl extends ServiceBase<Admins> implements AdminsService {
    @Resource
    private AdminsMapper dao;

    @Override
    protected AdminsMapper getDao() {
        return dao;
    }
    public Admins login(String username, String password) {
        Admins user = new Admins();
        user.setUsername(username);
            user.setPwd(password);

        return this.dao.login(user);
    }

    public boolean updatePassword(int id, String newPassword) {
        Admins user = new Admins();
        user.setId(id);
            user.setPwd(newPassword);
        int i = this.dao.updateByPrimaryKeySelective(user);
        return i == 1;
    }
}

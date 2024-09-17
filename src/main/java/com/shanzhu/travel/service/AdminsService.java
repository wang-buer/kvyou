package com.shanzhu.travel.service;

import com.shanzhu.travel.common.IServiceBase;
import com.shanzhu.travel.entity.Admins;

public interface AdminsService extends IServiceBase<Admins> {

    Admins login(String username, String password);

    boolean updatePassword(int id, String newPassword);
}

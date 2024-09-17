package com.shanzhu.travel.service;

import com.shanzhu.travel.common.IServiceBase;
import com.shanzhu.travel.entity.Yonghu;

public interface YonghuService extends IServiceBase<Yonghu> {

    Yonghu login(String username, String password);

    boolean updatePassword(int id, String newPassword);
}

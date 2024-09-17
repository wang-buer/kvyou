package com.shanzhu.travel.mapper;

import com.shanzhu.travel.entity.Admins;
import com.shanzhu.travel.common.MapperBase;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminsMapper extends MapperBase<Admins> {
    Admins login(Admins admins);
}

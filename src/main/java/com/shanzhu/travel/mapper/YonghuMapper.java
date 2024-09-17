package com.shanzhu.travel.mapper;

import com.shanzhu.travel.entity.Yonghu;
import com.shanzhu.travel.common.MapperBase;
import org.springframework.stereotype.Repository;


@Repository
public interface YonghuMapper extends MapperBase<Yonghu> {
    Yonghu login(Yonghu yonghu);
}

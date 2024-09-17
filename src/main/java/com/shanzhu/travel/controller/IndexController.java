package com.shanzhu.travel.controller;


import net.jntoo.db.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 首页 控制层
 *
 * @author: ShanZhu
 * @date: 2024-01-26
 */
@Controller
public class IndexController extends BaseController {

    // 首页
    @RequestMapping(value = {"/", "index"})
    public String Index() {
        ArrayList<HashMap> bhtList = Query.make("lunbotu").order("id desc").limit(5).select();
        assign("bhtList", bhtList);

        ArrayList<HashMap> jingdianxinxilist1 = Query.make("jingdianxinxi").limit(4).order("liulanliang desc").select();
        assign("jingdianxinxilist1", jingdianxinxilist1);

        ArrayList<HashMap> difangmeishilist2 = Query.make("difangmeishi").limit(4).order("id desc").select();
        assign("difangmeishilist2", difangmeishilist2);

        ArrayList<HashMap> lvyouxianlulist3 = Query.make("lvyouxianlu").limit(4).order("id desc").select();
        assign("lvyouxianlulist3", lvyouxianlulist3);

        ArrayList<HashMap> xinwenxinxilist4 = Query.make("xinwenxinxi").limit(4).order("id desc").select();
        assign("xinwenxinxilist4", xinwenxinxilist4);
        if (isAjax()) {
            return json();
        }
        return "index";
    }


}

package com.shanzhu.travel;

import lombok.extern.slf4j.Slf4j;
import net.jntoo.util.AppUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * SpringBoot 启动类
 * 项目启动入口（点击右键 选择 "run BackendApplication" 启动项目）
 * <p>
 * 什么是SpringBoot？（https://www.php.cn/faq/498384.html）
 *
 * @author: ShanZhu
 * @date: 2023-01-24
 */
@Slf4j
@SpringBootApplication
@MapperScan(basePackages = {"com.shanzhu.travel.mapper"})
public class BackendApplication {

    static public ConfigurableApplicationContext content = null;

    public static void main(String[] args) {
        content = SpringApplication.run(BackendApplication.class, args);
        AppUtil.bootstrap(BackendApplication.class.getPackage().getName() + ".util");

        log.info("=====================项目后端启动成功============================");
    }


}

package com.gb.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合MyBatis-Plus
 * 1 导入数据库驱动，Mybatis-Plus依赖
 * 2 配置数据源，Mybatis-Plus相关
 */
/*扫描dao层接口*/
@MapperScan("com.gb.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}

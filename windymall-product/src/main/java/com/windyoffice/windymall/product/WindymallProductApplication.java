package com.windyoffice.windymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * 整合mybatis-plus
 * 1.导入依赖
 * 2.配置
 *   a.配置数据源
 *      1.导入数据驱动
 *      2.在application.yml中配置数据源相关信息
 *   b.配置mybatis-plus
 *      1.使用MapperScan 告诉mybatis-plus mapper类的位置
 *      2.告诉mybatis-plus,sql映射文件位置
 */
@MapperScan("com.windyoffice.windymall.product.dao")
@SpringBootApplication
public class WindymallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(WindymallProductApplication.class, args);
    }

}

package org.example.admin;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.example.common.enums.UserStatusEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * @Author zhangLe
 * @Description
 */
@Slf4j
@RestController
@SpringBootApplication
public class AdminApplication implements Serializable {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class);

        String desc = UserStatusEnum.getDesc(2);
        System.out.println("当前code返回信息为:"+desc);
        log.info("sssssssss");
    }

    @GetMapping("/test")
    public String test(){
        log.info("gradle 整合springBoot成功");
        return "nice";
    }
}

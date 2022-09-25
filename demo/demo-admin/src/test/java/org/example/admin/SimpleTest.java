package org.example.admin;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.Serializable;

/**
 * @Author zhangLe
 * @Description
 */
@Slf4j
public class SimpleTest implements Serializable {
    @Test
    void test(){
        System.out.println("测试通过");
        // log.info("ssssssssssssssssssss");
    }
}

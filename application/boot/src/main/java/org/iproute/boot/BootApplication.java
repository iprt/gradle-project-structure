package org.iproute.boot;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * BootApplication
 *
 * @author zhuzhenjie
 * @since 2023/1/12
 */
@SpringBootApplication
@RestController
@Slf4j
public class BootApplication {

    public static void main(String[] args) {
        log.info("Bean: {}", Bean.builder().name("Boot").build());
        SpringApplication.run(BootApplication.class, args);
    }

    @GetMapping("/list")
    public List<String> list() {
        return Lists.newArrayList("hello", "world");
    }

    @ToString
    @Builder
    public static class Bean {
        private String name;
    }
}

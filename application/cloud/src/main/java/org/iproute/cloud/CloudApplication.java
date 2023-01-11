package org.iproute.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * CloudApplication
 *
 * @author zhuzhenjie
 * @since 2023/1/12
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class CloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }
}

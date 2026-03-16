package com.busanit501.sample_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SampleProjectApplication {


//    // 2. exclude 설정을 추가해서 DB 연결을 시도하지 않게 만듭니다.
//    @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//    public class SampleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleProjectApplication.class, args);
    }

}

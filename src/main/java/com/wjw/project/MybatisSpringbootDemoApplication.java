package com.wjw.project;

import com.wjw.project.mapper.StudentMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = "com.wjw.project.mapper")
@SpringBootApplication
public class MybatisSpringbootDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MybatisSpringbootDemoApplication.class, args);
        StudentMapper mapper = context.getBean(StudentMapper.class);
        System.out.println(mapper.selectByName("张三"));
    }

}

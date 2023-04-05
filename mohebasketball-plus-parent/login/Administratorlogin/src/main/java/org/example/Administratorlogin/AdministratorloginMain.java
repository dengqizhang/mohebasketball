package org.example.Administratorlogin;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan("org/example/Administratorlogin/mapper")
public class AdministratorloginMain {
    public static void main(String[] args) {
        SpringApplication.run(AdministratorloginMain.class, args);
    }
}

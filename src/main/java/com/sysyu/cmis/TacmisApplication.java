package com.sysyu.cmis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@MapperScan("com.sysyu.cmis.dao")
@SpringBootApplication
public class TacmisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacmisApplication.class, args);
	}

}


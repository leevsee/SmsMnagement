package com.bxd.smsmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: 程序启动入口
 * Package: com.bxd.smsmanagement
 *
 * @author Leeves
 * @date 2018-03-27
 */
@MapperScan("com.bxd.smsmanagement.dao")
@SpringBootApplication
public class SmsManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsManagementApplication.class, args);
	}
}

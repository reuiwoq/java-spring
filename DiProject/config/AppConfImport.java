package com.abcdefg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.abcdefg.service.MemberDao;
import com.abcdefg.service.MemberPrinter;

@Configuration
@Import({AppConf2.class})
public class AppConfImport {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}

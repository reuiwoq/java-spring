package com.abcdefg.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abcdefg.service.ChangePasswordService;
import com.abcdefg.service.MemberDao;
import com.abcdefg.service.MemberInfoPrinter;
import com.abcdefg.service.MemberListPrinter;
import com.abcdefg.service.MemberPrinter;
import com.abcdefg.service.MemberRegisterService;
import com.abcdefg.service.MemberSummaryPrinter;
import com.abcdefg.service.VersionPrinter;

@Configuration
@ComponentScan(basePackages = {"com.abcdefg" })
public class AppCtx {
	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	@Qualifier("summaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
	
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}

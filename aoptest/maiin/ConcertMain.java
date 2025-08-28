package com.abcdefg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abcdefg.concert.IUConcert;
import com.abcdefg.concert.Performance;
import com.abcdefg.concert.PianoConcert;
import com.abcdefg.config.ConcertConfig;

public class ConcertMain {
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConcertConfig.class);
		
		Performance performance = ctx.getBean("pianoConcert", PianoConcert.class);
		performance.perform();
		System.out.println("==========================================");
		
		performance = ctx.getBean(IUConcert.class);
		performance.perform();
	}
}

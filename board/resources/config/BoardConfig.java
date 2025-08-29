package com.abcdefg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abcdefg.controller.BoardController;
import com.abcdefg.model.BoardDao;
import com.abcdefg.model.NoticeBoard;
import com.abcdefg.service.BoardService;

@Configuration
public class BoardConfig {
	@Bean
	public NoticeBoard noticeBoard() {
		return new NoticeBoard();
	}
	
	@Bean
	public BoardDao boardDao() {
		return new BoardDao();
	}
	
	@Bean
	public BoardService boardService() {
		return new BoardService(boardDao());
	}
	
	@Bean
	public BoardController boardController() {
		return new BoardController(boardService(), noticeBoard());
	}
}

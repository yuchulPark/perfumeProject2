package com.board.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.board.service.Board_PostService;
import com.board.vo.Board_PostVo;

@Controller
public class Board_PostController {
	@Resource(name="board_postService")
	private Board_PostService board_postService;
	
	// 로그인 회원가입 구현 완료되면 풀고, 밑 코드에도 회원단 추가하기
	//@Resource(name="member_infoService")
	//private Member_InfoService member_infoService;
	
	// 게시글 추가
	@GetMapping("/insertBoard.do")
	public void insertBoardForm() {
	}
	@PostMapping("/insertBoardOK.do")
	public ModelAndView insertBoardSubmit(Board_PostVo bp) {
		ModelAndView m = new ModelAndView();
		int re = board_postService.insertBoard(bp);
		return m;
	}
	
	// 게시글 목록 (게시판 종류에 따라 나뉨)
	@RequestMapping("/listBoard.do")
	public ModelAndView listBoard() {
		// 게시글 조회수 증가
		// board_postService.updateHit(board_no);
		
		ModelAndView m = new ModelAndView();
		m.addObject("bp", board_postService.listBoard());
		return m;
	}
	
	// 게시글 상세 (게시판 종류에 따라 나뉨)
	@RequestMapping("/detailBoard.do")
	public ModelAndView detailBoard(int board_no) {
		// 게시글 조회수 증가
		board_postService.updateHit(board_no);
		
		ModelAndView m = new ModelAndView();
		m.addObject("bp", board_postService.detailBoard(board_no));
		return m;
	}
	
	// 게시글 수정
	@GetMapping("/updateBoard.do")
	public ModelAndView updateBoardForm(int board_no) {
		ModelAndView m = new ModelAndView();
		m.addObject("bp", board_postService.detailBoard(board_no));
		return m;
	}
	@PostMapping("/updateBoardOK.do")
	public ModelAndView updateBoardSubmit(Board_PostVo bp) {
		ModelAndView m = new ModelAndView();
		int re = board_postService.updateBoard(bp);
		return m;
	}
	
	// 게시글 삭제
	@RequestMapping("/deleteBoard.do")
	public ModelAndView deleteBoard(int board_no) {
		ModelAndView m = new ModelAndView();
		int re = board_postService.deleteBoard(board_no);
		return m;
	}
	
}

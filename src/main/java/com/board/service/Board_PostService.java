package com.board.service;

import java.util.List;

import com.board.vo.Board_PostVo;

public interface Board_PostService {
	// 게시글 추가
	int insertBoard(Board_PostVo bp);
	
	// 게시글 목록 (게시판 종류에 따라 나뉨)
	List<Board_PostVo> listBoard();
	
	// 게시글 상세 (게시판 종류에 따라 나뉨)
	Board_PostVo detailBoard(int board_no);
	
	// 게시글 조회수 증가
	void updateHit(int board_no);
	
	// 게시글 수정
	int updateBoard(Board_PostVo bp);
	
	// 게시글 삭제
	int deleteBoard(int board_no);
}

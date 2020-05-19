package com.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.Board_PostDao;
import com.board.vo.Board_PostVo;

@Service("board_postService")
public class Board_PostServiceImpl implements Board_PostService {
	@Autowired
	@Resource(name="board_postDao")
	protected Board_PostDao board_postDao;
	
	// 게시글 추가
	@Override
	public int insertBoard(Board_PostVo bp) {
		return board_postDao.insertBoard(bp);
	}

	// 게시글 목록 (게시판 종류에 따라 나뉨)
	@Override
	public List<Board_PostVo> listBoard() {
		return board_postDao.listBoard();
	}

	// 게시글 상세 (게시판 종류에 따라 나뉨)
	@Override
	public Board_PostVo detailBoard(int board_no) {
		return board_postDao.detailBoard(board_no);
	}

	// 게시글 조회수 증가
	@Override
	public int updateHit(int board_no) {
		return board_postDao.updateHit(board_no);
	}

	// 게시글 수정
	@Override
	public int updateBoard(Board_PostVo bp) {
		return board_postDao.updateBoard(bp);
	}

	// 게시글 삭제
	@Override
	public int deleteBoard(int board_no) {
		return board_postDao.deleteBoard(board_no);
	}

}

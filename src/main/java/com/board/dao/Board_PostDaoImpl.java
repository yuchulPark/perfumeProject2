package com.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.vo.Board_PostVo;

@Repository("board_postDao")
public class Board_PostDaoImpl implements Board_PostDao {
	@Autowired
	protected SqlSessionTemplate sqlSessionTemplate;
	
	// 게시글 추가
	@Override
	public int insertBoard(Board_PostVo bp) {
		return sqlSessionTemplate.insert("board_post.insertBoard", bp);
	}

	// 게시글 목록 (게시판 종류에 따라 나뉨)
	@Override
	public List<Board_PostVo> listBoard(int board_kinds) {
		return sqlSessionTemplate.selectList("board_post.selectAllBoard", board_kinds);
	}

	// 게시글 상세 (게시판 종류에 따라 나뉨)
	@Override
	public Board_PostVo detailBoard(int board_no) {
		return sqlSessionTemplate.selectOne("board_post.detailBoard", board_no);
	}

	// 게시글 조회수 증가
	@Override
	public void updateHit(int board_no) {
		sqlSessionTemplate.update("board_post.updateHitBoard", board_no);
	}

	// 게시글 수정
	@Override
	public int updateBoard(Board_PostVo bp) {
		return sqlSessionTemplate.update("board_post.updateBoard", bp);
	}

	// 게시글 삭제
	@Override
	public int deleteBoard(int board_no) {
		return sqlSessionTemplate.delete("board_post.deleteBoard", board_no);
	}

}

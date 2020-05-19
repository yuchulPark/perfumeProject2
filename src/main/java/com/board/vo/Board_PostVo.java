package com.board.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Board_PostVo {
	private int board_no; // 글번호
	private int member_no; // 회원 번호
	private int board_kinds; // 게시판 종류 (0:자유, 1:질문)
	private String board_writer; // 작성자 (회원 정보 테이블의 닉네임)
	private String board_title; // 글제목
	private Date board_date; // 게시일
	private int board_hit; // 조회수
	private String board_content; // 글내용
	private Date board_update_date; // 수정된 시간
}

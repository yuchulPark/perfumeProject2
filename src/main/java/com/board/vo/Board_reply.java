package com.board.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Board_reply {
	private int reply_no; // 댓글 번호
	private int member_no; // 회원 번호
	private int board_no; // 글번호
	private String reply_content; // 댓글 내용
	private Date reply_date; // 댓글 단 날짜
	private int reply_secret; // 비밀댓글 여부 (0:공개글, 1:비밀글)
	private int reply_ref; // 리댓글시 참조되는 댓글번호 (reply_no랑 값이 같음)
	private int reply_level; // 리댓글 순번
	private int reply_step; // 댓글 순서
}

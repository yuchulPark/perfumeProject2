package com.board.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Board_FileVo {
	private int board_file_no; // 첨부파일 번호
	private int member_no; // 회원 번호
	private int board_no; // 글번호
	private String board_file_name; // 첨부파일명
}

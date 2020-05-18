package com.member.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member_InfoVo {
	private int member_no; // 회원 번호
	private String member_id; // 아이디
	private String member_pwd; // 비밀번호
	private String member_email; // 이메일
	private String member_name; // 이름
	private int member_info_open; // 개인정보 공개여부 (0:공개, 1:비공개)
	private Date member_regidate; // 가입일자
	private Date member_birth; // 생일
	private int member_gender; // 성별
	private String member_nickname; // 닉네임
	private String member_introduce; // 자기소개
	private String member_img; // 프로필 사진
}

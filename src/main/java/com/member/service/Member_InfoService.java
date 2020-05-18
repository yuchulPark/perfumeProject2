package com.member.service;

import com.member.vo.Member_InfoVo;

public interface Member_InfoService {
	// 회원가입
	int memberJoin(Member_InfoVo mi);
	
	// id 중복 체크
	int checkId(String member_id);
		
	// email 중복 체크
	int checkEmail(String member_email);
		
	// 닉네임 중복 체크
	int checkNickname(String member_nickname);
		
	// 로그인 (@를 누르면 로그인하라고 창이 뜨게끔도 되는지 확인해보기)
	Member_InfoVo Login(Member_InfoVo mi);
	
	// 비밀번호 찾기
	int findPwd(Member_InfoVo mi);
	
	// 회원 수정
	int updateInfo(Member_InfoVo mi);
	
	// 회원 탈퇴
	int deleteInfo(Member_InfoVo mi);
}

package com.member.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.member.dao.Member_InfoDao;
import com.member.vo.Member_InfoVo;
@Service("member_infoService")
public class Member_InfoServiceImpl implements Member_InfoService {
	@Autowired
	@Resource(name="member_infoDao")
	protected Member_InfoDao member_infoDao; 
	
	// 회원가입
	@Override
	public int memberJoin(Member_InfoVo mi) {
		return member_infoDao.memberJoin(mi);
	}

	// id 중복 체크
	@Override
	public int checkId(String member_id) {
		return member_infoDao.checkId(member_id);
	}

	// email 중복 체크
	@Override
	public int checkEmail(String member_email) {
		return member_infoDao.checkEmail(member_email);
	}

	// 닉네임 중복 체크
	@Override
	public int checkNickname(String member_nickname) {
		return member_infoDao.checkNickname(member_nickname);
	}

	// 로그인 (@를 누르면 로그인하라고 창이 뜨게끔도 되는지 확인해보기)
	@Override
	public Member_InfoVo Login(Member_InfoVo mi) {
		return member_infoDao.Login(mi);
	}

	// 비밀번호 찾기
	@Override
	public int findPwd(Member_InfoVo mi) {
		return member_infoDao.findPwd(mi);
	}

	// 회원 수정
	@Override
	public int updateInfo(Member_InfoVo mi) {
		return member_infoDao.updateInfo(mi);
	}

	// 회원 탈퇴
	@Override
	public int deleteInfo(Member_InfoVo mi) {
		return member_infoDao.deleteInfo(mi);
	}

}

package com.member.dao;

import org.apache.ibatis.annotations.Insert;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.member.vo.Member_InfoVo;

@Repository("member_infoDao")
public class Member_InfoDaoImpl implements Member_InfoDao {
	@Autowired
	protected SqlSessionTemplate sqlSessionTemplate;
	// 회원가입
	@Override
	public int memberJoin(Member_InfoVo mi) {
		return sqlSessionTemplate.insert("member_info.insert", mi);
	}
	
	// id 중복 체크
	@Override
	public int checkId(String member_id) {
		return sqlSessionTemplate.selectOne("member_info.checkId", member_id);
	}

	// email 중복 체크
	@Override
	public int checkEmail(String member_email) {
		return sqlSessionTemplate.selectOne("member_info.checkEmail", member_email);
	}

	// 닉네임 중복 체크
	@Override
	public int checkNickname(String member_nickname) {
		return sqlSessionTemplate.selectOne("member_info.checkNickname", member_nickname);
	}

	// 로그인 (@를 누르면 로그인하라고 창이 뜨게끔도 되는지 확인해보기)
	@Override
	public Member_InfoVo Login(Member_InfoVo mi) {
		return sqlSessionTemplate.selectOne("member_info.login", mi);
	}

	// 비밀번호 찾기
	@Override
	public int findPwd(Member_InfoVo mi) {
		return sqlSessionTemplate.update("member_info.findPwd", mi);
	}

	// 회원 수정
	@Override
	public int updateInfo(Member_InfoVo mi) {
		return sqlSessionTemplate.update("member_info.update", mi);
	}

	// 회원 탈퇴
	@Override
	public int deleteInfo(Member_InfoVo mi) {
		return sqlSessionTemplate.delete("member_info.delete", mi);
	}

}

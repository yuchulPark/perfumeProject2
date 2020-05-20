package com.member.controller;

import java.net.http.HttpResponse;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.member.service.Member_InfoService;
import com.member.vo.Member_InfoVo;

@Controller
@RequestMapping("/member/")
public class Member_InfoController {
	@Resource(name="member_infoService")
	private Member_InfoService member_infoService;
	
	// 회원가입
	@GetMapping("/joinForm.do")
	public void memberJoinForm() {
	}
	@PostMapping("/joinFormOK.do")
	public ModelAndView memberJoinSubmit(Member_InfoVo mi) {
		System.out.println("회원가입 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		int re = member_infoService.memberJoin(mi);
		m.addObject("re", re);
		return m;
	}
	
	// id 중복 체크
	@RequestMapping("/checkId.do")
	public ModelAndView checkId(String member_id) {
		System.out.println("id 중복 체크 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		int re = member_infoService.checkId(member_id);
		m.addObject("re", re);
		return m;
	}
	
	// email 중복 체크
	@RequestMapping("/checkEmail.do")
	public ModelAndView checkEmail(String member_email) {
		System.out.println("email 중복 체크 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		int re = member_infoService.checkEmail(member_email);
		m.addObject("re", re);
		return m;
	}
	
	// 닉네임 중복 체크
	@RequestMapping("/checkNickname.do")
	public ModelAndView checkNickname(String member_nickname) {
		System.out.println("nickname 중복 체크 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		int re = member_infoService.checkNickname(member_nickname);
		m.addObject("re", re);
		return m;
	}
	
	// 로그인 (미완성)
	@GetMapping("/login.do")
	public void login() {
	}
	@PostMapping("/loginOK.do")
	public ModelAndView loginOK(Member_InfoVo mi, HttpResponse response) {
		System.out.println("로그인 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		Member_InfoVo vo = member_infoService.Login(mi);
		return m;
	}
	
	// 비밀번호 찾기
	@RequestMapping("/findPwd.do")
	public ModelAndView findPwd(Member_InfoVo mi) {
		System.out.println("비밀번호 찾기 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		int re = member_infoService.findPwd(mi);
		m.addObject("re", re);
		return m;
	}
	
	// 회원 수정
	@RequestMapping("/updateInfo.do")
	public ModelAndView updateInfo(Member_InfoVo mi) {
		System.out.println("회원 수정 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		int re = member_infoService.updateInfo(mi);
		m.addObject("re", re);
		return m;
	}
	
	// 회원 탈퇴
	@RequestMapping("/deleteInfo.do")
	public ModelAndView deleteInfo(Member_InfoVo mi) {
		System.out.println("회원 탈퇴 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		int re = member_infoService.deleteInfo(mi);
		m.addObject("re", re);
		return m;
	}
	
}

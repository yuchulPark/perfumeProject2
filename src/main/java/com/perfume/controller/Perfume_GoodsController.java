package com.perfume.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.perfume.service.Perfume_GoodsService;
import com.perfume.vo.Perfume_GoodsVo;

@Controller
public class Perfume_GoodsController {
	@Resource(name="perfume_goodsService")
	private Perfume_GoodsService perfume_goodsService;

	// 향수 상품 추가
	@GetMapping("/insertPerfume_Goods.do")
	public void insertPerfume_Goods() {
	}
	@PostMapping("/insertPerfume_GoodsOK.do")
	public ModelAndView insertPerfume_Goods(Perfume_GoodsVo pg) {
		ModelAndView m = new ModelAndView();
		int re = perfume_goodsService.insertPerfume_goods(pg);
		return m;
	}
	
	// 향수 전체 리스트 (perfume_no로 정렬되어 있음. 전체 리스트 보기. 리스트는 브랜드명, 향수명, 사진만 보여줄 예정)
	@RequestMapping("/listPerfume_Goods.do")
	public ModelAndView listPerfume_Goods() {
		// 클릭시 조회수 증가
		// perfume_goodsService.updateHit(perfume_no);
		
		ModelAndView m = new ModelAndView();
		m.addObject("pg", perfume_goodsService.listPerfume_Goods());
		return m;
	}
	
	// 향수 브랜드별 리스트 (전체리스트에서 버튼 클릭시 해당 브랜드만 보여줌)
	@RequestMapping("/listPerfume_Goods_Brands.do")
	public ModelAndView listPerfume_GoodsBrands(String perfume_brand) {
		// 클릭시 조회수 증가
		// perfume_goodsService.updateHit(perfume_no);
		
		ModelAndView m = new ModelAndView();
		m.addObject("pgb", perfume_goodsService.listPerfume_Goods_Brands(perfume_brand));
		return m;
	}
	
	// 향수 상세보기
	@RequestMapping("/detailPerfume_Goods.do")
	public ModelAndView detailPerfume_Goods(int perfume_no) {
		ModelAndView m = new ModelAndView();
		m.addObject("pg", perfume_goodsService.detailPerfume_Goods(perfume_no));
		return m;
	}
	
	// 향수 상품 수정 (번호, 조회수, 수량은 안적음)
	@GetMapping("/updatePerfume_Goods.do")
	public ModelAndView updatePerfume_Goods(int perfume_no) {
		ModelAndView m = new ModelAndView();
		m.addObject("pg", perfume_goodsService.detailPerfume_Goods(perfume_no));
		return m;
	}
	@PostMapping("/updatePerfume_GoodsOK.do")
	public ModelAndView updatePerfume_GoodsOK(Perfume_GoodsVo pg) {
		ModelAndView m = new ModelAndView();
		int re = perfume_goodsService.updatePerfume_Goods(pg);
		return m;
	}
	
	// 향수 상품 삭제
	@RequestMapping("/deletePerfume_Goods.do")
	public ModelAndView deletePerfume_Goods(int perfume_no) {
		ModelAndView m = new ModelAndView();
		int re = perfume_goodsService.deletePerfume_Goods(perfume_no);
		return m;
	}
	
}

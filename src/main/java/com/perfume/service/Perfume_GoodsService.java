package com.perfume.service;

import java.util.List;

import com.perfume.vo.Perfume_GoodsVo;

public interface Perfume_GoodsService {
	// 향수 상품 추가
	int insertPerfume_goods(Perfume_GoodsVo pg);
	
	// 향수 전체 리스트 (perfume_no로 정렬되어 있음. 전체 리스트 보기. 리스트는 브랜드명, 향수명, 사진만 보여줄 예정)
	List<Perfume_GoodsVo> listPerfume_Goods();
	
	// 향수 브랜드별 리스트 (전체리스트에서 버튼 클릭시 해당 브랜드만 보여줌)
	List<Perfume_GoodsVo> listPerfume_Goods_Brands(String perfume_brand);
	
	// 향수 상세보기
	Perfume_GoodsVo detailPerfume_Goods(int perfume_no);
	
	// 클릭시 조회수 증가
	void updateHit(int perfume_no);
	
	// 향수 상품 수정 (번호, 조회수, 수량은 안적음)
	int updatePerfume_Goods(Perfume_GoodsVo pg);
	
	// 향수 상품 삭제
	int deletePerfume_Goods(int perfume_no);
	
}

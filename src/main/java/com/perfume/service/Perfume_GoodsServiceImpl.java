package com.perfume.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfume.dao.Perfume_GoodsDao;
import com.perfume.vo.Perfume_GoodsVo;
@Service("perfume_goodsService")
public class Perfume_GoodsServiceImpl implements Perfume_GoodsService {
	@Autowired
	@Resource(name="perfume_goodsDao")
	protected Perfume_GoodsDao perfume_goodsDao;	
	
	// 향수 상품 추가
	@Override
	public int insertPerfume_goods(Perfume_GoodsVo pg) {
		return perfume_goodsDao.insertPerfume_goods(pg);
	}
	
	// 향수 전체 리스트 (perfume_no로 정렬되어 있음. 전체 리스트 보기. 리스트는 브랜드명, 향수명, 사진만 보여줄 예정)
	@Override
	public List<Perfume_GoodsVo> listPerfume_Goods() {
		System.out.println("1");
		return perfume_goodsDao.listPerfume_Goods();
	}

	// 향수 브랜드별 리스트 (전체리스트에서 버튼 클릭시 해당 브랜드만 보여줌)
	@Override
	public List<Perfume_GoodsVo> listPerfume_Goods_Brands(String perfume_brand) {
		return perfume_goodsDao.listPerfume_Goods_Brands(perfume_brand);
	}

	// 향수 상세보기
	@Override
	public Perfume_GoodsVo detailPerfume_Goods(int perfume_no) {
		return perfume_goodsDao.detailPerfume_Goods(perfume_no);
	}

	// 클릭시 조회수 증가
	@Override
	public void updateHit(int perfume_no) {
		perfume_goodsDao.updateHit(perfume_no);
	}

	// 향수 상품 수정 (번호, 조회수, 수량은 안적음)
	@Override
	public int updatePerfume_Goods(Perfume_GoodsVo pg) {
		return perfume_goodsDao.updatePerfume_Goods(pg);
	}

	// 향수 상품 삭제
	@Override
	public int deletePerfume_Goods(int perfume_no) {
		return perfume_goodsDao.deletePerfume_Goods(perfume_no);
	}

}
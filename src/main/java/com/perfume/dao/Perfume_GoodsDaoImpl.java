package com.perfume.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.perfume.vo.Perfume_GoodsVo;
@Repository("perfume_goodsDao")
public class Perfume_GoodsDaoImpl implements Perfume_GoodsDao {
	@Autowired
	protected SqlSessionTemplate sqlSessionTemplate;
	
	// 향수 상품 추가
	@Override
	public int insertPerfume_goods(Perfume_GoodsVo pg) {
		return sqlSessionTemplate.insert("perfume_goods.insertPerfume", pg);
	}

	// 향수 전체 리스트 (perfume_no로 정렬되어 있음. 전체 리스트 보기. 리스트는 브랜드명, 향수명, 사진만 보여줄 예정)
	@Override
	public List<Perfume_GoodsVo> listPerfume_Goods() {
		return sqlSessionTemplate.selectList("perfume_goods.selectAllPerfume");
	}

	// 향수 브랜드별 리스트 (전체리스트에서 버튼 클릭시 해당 브랜드만 보여줌)
	@Override
	public List<Perfume_GoodsVo> listPerfume_Goods_Brands(String perfume_brand) {
		return sqlSessionTemplate.selectList("perfume_goods.selectBrandPerfume", perfume_brand);
	}

	// 향수 상세보기
	@Override
	public Perfume_GoodsVo detailPerfume_Goods(int perfume_no) {
		return sqlSessionTemplate.selectOne("perfume_goods.detailPerfume", perfume_no);
	}

	// 클릭시 조회수 증가
	@Override
	public void updateHit(int perfume_no) {
		sqlSessionTemplate.update("perfume_goods.updateHitPerfume", perfume_no);
	}

	// 향수 상품 수정 (번호, 조회수, 수량은 안적음)
	@Override
	public int updatePerfume_Goods(Perfume_GoodsVo pg) {
		return sqlSessionTemplate.update("perfume_goods.updatePerfume", pg);
	}

	// 향수 상품 삭제
	@Override
	public int deletePerfume_Goods(int perfume_no) {
		return sqlSessionTemplate.delete("perfume_goods.deletePerfume", perfume_no);
	}

}

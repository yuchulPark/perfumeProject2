package com.perfume.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Perfume_GoodsVo {
	private int perfume_no; // 향수 번호
	private String perfume_brand; // 브랜드명
	private String perfume_name; // 향수명
	private String perfume_img; // 향수 사진
	private String perfume_simple_note; // 대략적인 노트 (전체)
	private String perfume_detail_note; // 세부 노트 (전체)
	private String perfume_simple_three_note; // 대략적인 노트 (3개)
	private String perfume_detail_three_note; // 세부 노트 (3개)
	private String perfume_kinds; // 향조
	private String perfume_year; // 탄생년도
	private int perfume_hit; // 조회수
	private String perfume_review; // 시향/착향 후기
	private String perfume_topNote; // 탑 노트
	private String perfume_middleNote; // 미들 노트
	private String perfume_baseNote; // 베이스 노트
	private double perfume_score; // 점수
	private int perfume_voteCount; // 투표자수
	private int perfume_favorite; // 시그니쳐
	private String perfume_continue; // 지속력
	private String perfume_smell; // 잔향
	private String perfume_gender; // 성별
	private String perfume_weather; // 계절
	private String perfume_dayTime; // 시간
	private int perfume_qty; // 수량
	private int perfume_price; // 가격
}

package com.perfume.vo;

import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Perfume_CartVo {
	private int perfume_cart_no; // 장바구니 번호
	private int member_no; // 회원 번호
	private int perfume_no; // 향수 번호
}

package com.order.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Perfume_BuyVo {
	private int buy_no; // 구매 번호
	private int member_no; // 회원 번호
	private int perfume_no; // 향수 번호
	private Date buy_date; // 구매일
	private int buy_qty; // 구매 수량
	private int buy_price; // 구매 금액
}

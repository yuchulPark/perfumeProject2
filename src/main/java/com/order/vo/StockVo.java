package com.order.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockVo {
	private int stock_no; // 입고 번호
	private int perfume_no; // 향수 번호
	private int stock_qty; // 입고 수당
	private Date stock_date; // 입고일
}

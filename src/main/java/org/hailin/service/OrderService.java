package org.hailin.service;

import java.util.Map;

public interface OrderService {
	//获取订单详情
	public Map<String,Object> getSellerOrderBySid(String seller_id,String sorder_id);
	//获取不同状态的订单
	public Map<String,Object> getSellerOrderByStat(String order_stat,Integer pageNo);
}

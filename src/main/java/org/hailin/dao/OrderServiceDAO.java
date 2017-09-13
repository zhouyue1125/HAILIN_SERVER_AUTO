package org.hailin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hailin.entity.SellerOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderServiceDAO {
	//获取业务订单详情
	public SellerOrder getSellerOrderBySid(@Param("seller_id") String user_id,@Param("sorder_id") String sorder_id);
	//获取不同状态业务订单
	public List<SellerOrder> getSellerOrderByStat(@Param("order_stat") String order_stat);
}

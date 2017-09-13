package org.hailin.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import org.hailin.dao.OrderServiceDAO;
import org.hailin.entity.SellerOrder;

import org.hailin.service.OrderService;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;




@Service
public class OrderServiceImpl implements OrderService {
	@Resource
	private OrderServiceDAO orderServiceDAO;
	
	private final int pageSize = 6;
	//删除订单(软删除，不做物理删除)

	@Override
	public Map<String, Object> getSellerOrderBySid(String seller_id, String sorder_id) {
		SellerOrder sellerOrder = orderServiceDAO.getSellerOrderBySid(seller_id, sorder_id);
		Map<String,Object> resMap = new HashMap<String,Object>();
		resMap.put("dataInfo", sellerOrder);
		resMap.put("successed","000");
		return resMap;
	}


	@Override
	public Map<String, Object> getSellerOrderByStat(String order_stat, Integer pageNo) {
		// TODO Auto-generated method stub
		pageNo = pageNo == null?1:pageNo;
	    PageHelper.startPage(pageNo,pageSize);
	    Map<String,Object> resMap = new HashMap<String,Object>();
	    Map<String,Object> resultMap = new HashMap<String,Object>();
		List<SellerOrder> sellerOrderList = new ArrayList<SellerOrder>();
		sellerOrderList = orderServiceDAO.getSellerOrderByStat(order_stat);
		PageInfo<SellerOrder> page_sellerOrderList = new PageInfo<SellerOrder>(sellerOrderList);
		resMap.put("dataList", sellerOrderList);
		resMap.put("pages", page_sellerOrderList.getPages());
		resultMap.put("dataInfo", resMap);
		resultMap.put("successed", "000");
		return resultMap;
	}
	
}

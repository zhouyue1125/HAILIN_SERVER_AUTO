package org.hailin.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.hailin.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
	@Resource
	private OrderService orderService;
	@RequestMapping("/getOrderList.do")
	@ResponseBody
	public Map<String,Object>getOrderListBySeller(HttpServletRequest request){
		String order_stat = request.getParameter("order_stat");
		String pageNo = request.getParameter("pageNo");
		Map<String,Object> resultMap = orderService.getSellerOrderByStat(order_stat, Integer.parseInt(pageNo));
		return resultMap;
	}
	
	@RequestMapping("/getOrderDetailBySorderID.do")
	@ResponseBody
	public Map<String,Object> getOrderDetailBySorderID(HttpServletRequest request){
		String seller_id = (String) request.getSession().getAttribute("seller_id");
		String sorder_id = request.getParameter("sorder_id");
		Map<String,Object> resultMap = orderService.getSellerOrderBySid(seller_id, sorder_id);
		return resultMap;
	}
}

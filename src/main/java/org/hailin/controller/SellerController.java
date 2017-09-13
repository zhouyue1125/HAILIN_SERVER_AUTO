package org.hailin.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SellerController {
	@RequestMapping("/loadMenu.do")
	public String loadMenu(HttpServletRequest request){
		return "WEB-INF/html/menu.jsp";
	}
	
	@RequestMapping("/itemApprove.do")
	public String loadStoreMgr(HttpServletRequest request){
		return "WEB-INF/html/item_approve.jsp";
	}
	
	@RequestMapping("/orderService.do")
	public String loadStoreMenu(HttpServletRequest request){
		return "WEB-INF/html/order_service.jsp";
	}
	
	@RequestMapping("/uploadBanner.do")
	public String loadOrderMgr(HttpServletRequest request){
		return "WEB-INF/html/upload_banner.jsp";
	}
}

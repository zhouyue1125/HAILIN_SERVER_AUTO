package org.hailin.entity;

import java.util.List;

//业务订单
public class SellerOrder {
	private String seller_id;
	private String seller_name;
	private String sorder_id;
	private int summary_qty;
	private double summary_price;
	private String province_name;
	private String city_name;
	private String area_name;
	private String address;
	private String receiver;
	private String phoneNum;
	private List<OrderDtl> orderDtls;
	private String user_id;
	private String order_id;
	private String note;
	private String create_time;
	private String close_time;
	private String order_stat;
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getSeller_name() {
		return seller_name;
	}
	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}
	public String getSorder_id() {
		return sorder_id;
	}
	public void setSorder_id(String sorder_id) {
		this.sorder_id = sorder_id;
	}
	public int getSummary_qty() {
		return summary_qty;
	}
	public void setSummary_qty(int summary_qty) {
		this.summary_qty = summary_qty;
	}
	public double getSummary_price() {
		return summary_price;
	}
	public void setSummary_price(double summary_price) {
		this.summary_price = summary_price;
	}
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public List<OrderDtl> getOrderDtls() {
		return orderDtls;
	}
	public void setOrderDtls(List<OrderDtl> orderDtls) {
		this.orderDtls = orderDtls;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getClose_time() {
		return close_time;
	}
	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}
	public String getOrder_stat() {
		return order_stat;
	}
	public void setOrder_stat(String order_stat) {
		this.order_stat = order_stat;
	}
	@Override
	public String toString() {
		return "SellerOrder [seller_id=" + seller_id + ", seller_name=" + seller_name + ", sorder_id=" + sorder_id
				+ ", summary_qty=" + summary_qty + ", summary_price=" + summary_price + ", province_name="
				+ province_name + ", city_name=" + city_name + ", area_name=" + area_name + ", address=" + address
				+ ", receiver=" + receiver + ", phoneNum=" + phoneNum + ", orderDtls=" + orderDtls + ", user_id="
				+ user_id + ", order_id=" + order_id + ", note=" + note + ", create_time=" + create_time
				+ ", close_time=" + close_time + ", order_stat=" + order_stat + "]";
	}
	
	
	
}

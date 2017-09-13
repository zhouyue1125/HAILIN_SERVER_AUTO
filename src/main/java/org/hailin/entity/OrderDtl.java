package org.hailin.entity;

//订单明细
public class OrderDtl {
	private String sorder_id;//订单编号
	private String item_id;//商品编号
	private String item_name;//商品名称
	private String unit;//规格
	private int qty;//数量
	private double price;//价格
	private String item_title_image;//产品封面照
	private String seller_id;
	private String user_id;
	public String getSorder_id() {
		return sorder_id;
	}
	public void setSorder_id(String sorder_id) {
		this.sorder_id = sorder_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItem_title_image() {
		return item_title_image;
	}
	public void setItem_title_image(String item_title_image) {
		this.item_title_image = item_title_image;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "OrderDtl [sorder_id=" + sorder_id + ", item_id=" + item_id + ", item_name=" + item_name + ", unit="
				+ unit + ", qty=" + qty + ", price=" + price + ", item_title_image=" + item_title_image + ", seller_id="
				+ seller_id + ", user_id=" + user_id + "]";
	}
	
	
	
	
}

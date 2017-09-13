package org.hailin.service;

import java.util.Map;

public interface SettleAccounts {
	//订单入账
	public Map<String,Object> settleAcc(String [] sorder_ids);
}

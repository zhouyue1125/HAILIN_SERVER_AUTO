package org.hailin.util;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class IDUtil {
	static String dateStr;
	
	public static String getId(String head){
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");
		return head + uuid;
	}
	
	public static String getOrderID(){
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date date = new Date();  
        dateStr = f.format(date);  
        return null;  
	}

}

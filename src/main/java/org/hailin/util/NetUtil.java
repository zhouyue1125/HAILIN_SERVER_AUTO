package org.hailin.util;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetUtil {
	
	//获取本地IP
	public static String getIpV4(){
		Enumeration allNetInterfaces = null;    
        try {    
            allNetInterfaces = NetworkInterface.getNetworkInterfaces();    
        } catch (java.net.SocketException e) {    
            e.printStackTrace();    
        }    
        InetAddress ip = null;    
        while (allNetInterfaces.hasMoreElements())    
        {    
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces    
                    .nextElement();       
            Enumeration addresses = netInterface.getInetAddresses();    
            while (addresses.hasMoreElements())    
            {    
                ip = (InetAddress) addresses.nextElement();    
                if (ip != null && ip instanceof Inet4Address)    
                {    
                    if(ip.getHostAddress().equals("127.0.0.1")){  
                        continue;  
                    }    
                    return ip.getHostAddress();  
                }    
            }    
        }    
        return ip.getHostAddress();
	}

}

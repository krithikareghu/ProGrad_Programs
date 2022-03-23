package assignment;

public class ValidateIPaddress {
	
public boolean ValidateIpv4Address(String ip)
{
			try {
			String[] arr=ip.split("[.]", 0);
			
			if(arr.length!=4)
				return false;
			
			int n=arr.length;
			int last=Integer.parseInt(arr[n-1]);
			
			if(last==255||last==0)
				return false;
			
			for(int i=0;i<arr.length;i++)
			{
				int j =Integer.parseInt(arr[i]);
				
				if(j<0||j>255)
					return false;			
			}			
			return true;
			}catch (Exception e) {
				return false;
			}
}	

}








/*
 * Create a class with one method called ValidateIpv4Address. 
 * The method takes a string and return true if it is valid host assignable 
 * IP address and false if not. IPv4 addresses are 32 bits long and grouped 
 * into 4 one byte blocks separated by dotted-decimal notation. E.g. 192.168.1.1.
 *  Most IP addresses ending in 0 represent the entire network segment and cannot be 
 *  used as host addresses. And most IP addresses ending in 255 represent a broadcast address 
 *  and cannot be used as a host address. There are exceptions, when using subnets, for 
 *  the sake of this problem any address ending in 0 or 255 is not a valid host address
 *  
 *   
 *  (edited)  3:45 IP Address     Result (edited)  3:47 1.1.1.1   true 3:47 192.168.1.1 
 *  true 3:47 10.0.0.1 true 3:47 127.0.0.1 true 3:48 0.0.0.0 false 3:48 255.255.255.255 
 *  false 3:48 1.1.1.0 false 3:48 10.0.1 false
 */


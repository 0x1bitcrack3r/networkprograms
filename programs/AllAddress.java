import java.io.*;
import java.net.*;
public class AllAddress{
	public static void main(String[] args) throws UnknownHostException
	{
	
			InetAddress[] address=InetAddress.getAllByName("www.google.com");
			for(int i=0;i<address.length;i++){
				System.out.println(address[i]);
			}
		
	}
}

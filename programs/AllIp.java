import java.util.*;
import java.io.*;
import java.net.*;
public class AllIp{
	public static void main(String[] args) throws UnknownHostException {
		InetAddress[] adr=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<adr.length;i++)
		{
			System.out.println(adr[i]);
		}
	}
} 
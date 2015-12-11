import java.net.*;
import java.util.*;
import java.io.*;
public class HostIp{
	public static void main(String args[]) throws Exception{

		InetAddress i=InetAddress.getLocalHost();
		String s=i.getHostAddress();
		String st=i.getHostName();
		System.out.println(s);
		System.out.println(st);
	}
}

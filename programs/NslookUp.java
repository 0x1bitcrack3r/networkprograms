import java.net.*;
import java.util.*;
import java.io.*;
import java.lang.*;
public class NslookUp{
	public static void main(String args[]) throws Exception{
		nslookup(args[0]);
	}
	public static void nslookup(String adr) throws Exception{
        InetAddress ia=InetAddress.getLocalHost();
        String br[]=ia.toString().split("/");
        InetAddress in=InetAddress.getByName(adr);
        String adrs[]=in.toString().split("/");
        System.out.println("Server:"+br[1]);
        System.out.println("Address:"+br[1]);
        System.out.println("\n"+adr+" "+"CanonicalName:"+in.getCanonicalHostName());
        System.out.println("Name:"+adrs[0]);
        System.out.println("Address:"+adrs[1]);
	}
}
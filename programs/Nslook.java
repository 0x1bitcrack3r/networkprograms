import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.*;
class Nslook{
public static void main(String args[]) throws Exception{
nslookup(args[0]);
}
public static void nslookup(String address)throws Exception{
InetAddress addres=InetAddress.getLocalHost();
String bros[]=addres.toString().split("/");
InetAddress inet=InetAddress.getByName(address);
String adrs[]=addres.toString().split("/");
System.out.println("SERVER:"+bros[1]);
System.out.println("Address:"+bros[1]);
System.out.println("\n" +address+"  canonicalname:"+inet.getCanonicalHostName());
System.out.println("Name:"  +adrs[0]);
System.out.println("Address:"+adrs[1]);
}
}

import java.util.*;
import java.net.*;
import java.net.InetAddress;
public class Netp{
public static void main(String[] args)throws UnknownHostException
{
InetAddress i=InetAddress.getLocalHost();
String ip=i.getHostAddress();
System.out.println(ip);
String hn=i.getHostName();
System.out.println(hn);
}
}


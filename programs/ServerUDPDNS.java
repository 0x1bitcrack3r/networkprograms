import java.io.*;
import java.net.*;
import java.util.*;
class ServerUDPDNS{
public static void main(String args[])throws Exception{
HashMap<String,String> mappings = new HashMap<String,String>();
		mappings.put("www.google.co.in","92.163.144.123");
		mappings.put("www.microsoft.com","94.123.124.113");
		mappings.put("www.academics.vit.ac.in","192.163.134.123");
DatagramSocket sskt=new DatagramSocket(9876);
byte[] rd=new byte[1024];
byte[] sd=new byte[1024];
while(true){
DatagramPacket rpt=new DatagramPacket(rd,rd.length);
sskt.receive(rpt);
String snt=new String(rpt.getData());
InetAddress ipadd=rpt.getAddress();
int port=rpt.getPort();
 String ans = "";
             if(mappings.containsKey(snt)){
				ans += mappings.get(snt);
			}
			 else{
				ans += "Sorry, dns details not found";
			}
sd=ans.getBytes();
DatagramPacket spt=new DatagramPacket(sd,sd.length,ipadd,port);
sskt.send(spt);
}
}
}

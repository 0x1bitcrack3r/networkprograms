import java.io.*;
import java.net.*;
import java.util.*;
class DServerUDP{
public static void main(String args[])throws Exception{
DatagramSocket sskt=new DatagramSocket(9876);
byte[] rd=new byte[1024];
byte[] sd=new byte[1024];
while(true){
DatagramPacket rpt=new DatagramPacket(rd,rd.length);
sskt.receive(rpt);
String snt=new String(rpt.getData());
InetAddress ipadd=rpt.getAddress();
int port=rpt.getPort();
Date now=new Date();
String cst=now.toString();
sd=cst.getBytes();
DatagramPacket spt=new DatagramPacket(sd,sd.length,ipadd,port);
sskt.send(spt);
}
}
}

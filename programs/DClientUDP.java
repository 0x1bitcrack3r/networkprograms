import java.io.*;
import java.net.*;
class DClientUDP{
public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
DatagramSocket cs=new DatagramSocket();
InetAddress ipadd=InetAddress.getByName("localhost");
byte[] senddata=new byte[1024];
byte[] receiveData=new byte[1024];
String stc=br.readLine();
senddata=stc.getBytes();
DatagramPacket spt=new DatagramPacket(senddata,senddata.length,ipadd,9876);
cs.send(spt);
DatagramPacket rpt=new DatagramPacket(receiveData,receiveData.length);
cs.receive(rpt);
String mdf=new String(rpt.getData());
System.out.println("From server:"+mdf);
cs.close();
}
}

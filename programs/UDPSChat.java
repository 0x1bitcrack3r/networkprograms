import java.io.*;
import java.net.*;
class UDPSChat{
public static void main(String args[])throws Exception{
DatagramSocket sskt=new DatagramSocket(9876);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
byte[] rd=new byte[1024];
byte[] sd=new byte[1024];


while(true){
	
DatagramPacket rpt=new DatagramPacket(rd,rd.length);
sskt.receive(rpt);

String snt=new String(rpt.getData());
System.out.println("FromClient"+snt);

InetAddress ipadd=rpt.getAddress();
int port=rpt.getPort();

String stc=br.readLine();
sd=stc.getBytes();

DatagramPacket spt=new DatagramPacket(sd,sd.length,ipadd,port);
sskt.send(spt);

}
}
}

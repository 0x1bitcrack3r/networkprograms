import java.io.*;
import java.net.*;
import java.util.*;
public class Socket1{
public static void main(String args[]) throws Exception{
Socket s=new Socket("localhost",5679);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
DataOutputStream ots=new DataOutputStream(s.getOutputStream());
BufferedReader sbr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String str=br.readLine();
ots.writeBytes(str+'\n');
String str1=sbr.readLine();
System.out.println("This is Server:"+str1);
s.close();
}
}

import java.io.*;
import java.net.*;
import java.util.*;
public class Server1{
public static void main(String args[]) throws Exception{
ServerSocket sk=new ServerSocket(5679);
while(true)
{
Socket con=sk.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
DataOutputStream ots=new DataOutputStream(con.getOutputStream());
String cs=br.readLine();
String cs1=cs.toUpperCase()+'\n';
ots.writeBytes(cs1);
}
}
}

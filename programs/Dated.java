import java.io.*;
import java.net.*;
import java.util.*;
public class Dated{
public static void main(String args[]) throws Exception{
ServerSocket sk=new ServerSocket(5679);

while(true)
{
try {
	Socket con=sk.accept();
Writer out=new OutputStreamWriter(con.getOutputStream());
Date now=new Date();
out.write(now.toString()+"\r\n");
out.flush();
}
catch(Exception e){
System.err.println(e.getMessage());
}

}
}
}

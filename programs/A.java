import java.util.*;
import java.net.*;
import java.io.*;
import java.lang.*;
public class A
{
	public static void main(String[] args) throws Exception
	{
	 Process p=Runtime.getRuntime().exec(args[0]);
	 BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
	 String s=br.readLine();
	    while(s!=null)
	     {
		System.out.println(s);
                  s=br.readLine();
	     }
	}
}

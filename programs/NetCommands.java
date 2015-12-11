import java.util.*;
import java.net.*;
import java.io.*;
public class NetCommands{
	public static void main(String args[]) throws Exception{
		Process p=Runtime.getRuntime().exec(args[0]+" "+args[1]);
		BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		String s=br.readLine();
		while(s!=null){
			System.out.println(s);
			s=br.readLine();
		}
	}
}
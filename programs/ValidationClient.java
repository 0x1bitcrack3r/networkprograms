import java.net.*;
import java.util.*;
import java.io.*;
public class ValidationClient {
	private static final String FILE_NAME = "/home/mock1/Desktop/hello-world-client";
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost",8975);
			String uname,pwd;
			Scanner sc = new Scanner(System.in);
			System.out.print("Username>:");
			uname = sc.next();
			System.out.print("Password>:");
			Console cons = System.console();
			pwd = new String(cons.readPassword());
			String combined = uname + "&&&" + pwd;
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			dos.writeBytes(combined + "\n");
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String output = br.readLine();
			System.out.println(output);
		}catch(Exception e){}
	}
}

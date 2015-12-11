
import java.net.*;
import java.util.*;
import java.io.*;
public class ValidationServer {
	private static final String UNAME = "mock1";
	private static final String  PWD = "welcome";
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(8975);
			while(true){
				Socket fromClient = server.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(
					fromClient.getInputStream()));
				String[] pairs = br.readLine().split("&&&");
				DataOutputStream dos = new DataOutputStream(fromClient.getOutputStream());
				if(pairs[0].equals(UNAME) && pairs[1].equals(PWD))
					dos.writeBytes("Validation Successful" + "\n");
				else
					dos.writeBytes("Validation Failed" + "\n");
			} 
		}catch(Exception e){Sys}
	}
}
		

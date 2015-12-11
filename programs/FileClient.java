import java.net.*;
import java.util.*;
import java.io.*;
public class FileClient {
	private static final String FILE_NAME = "/home/mock1/Desktop/hello-world-client";
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost",8975);
			StringBuilder sb = new StringBuilder();
			File f = new File(FILE_NAME);
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s = br.readLine();
			while(s != null) {
				sb.append(s + "\n");
				s = br.readLine();
			}
			System.out.println(sb);
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			dos.writeBytes(sb + "\n");
		}catch(Exception e){}
	}
}
		

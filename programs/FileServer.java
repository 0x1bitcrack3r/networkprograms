
import java.net.*;
import java.util.*;
import java.io.*;
public class FileServer {
	private static final String FILE_NAME = "/home/mock1/Desktop/hello-world-client-copy-server";
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(8975);
			while(true) {
				Socket fromClient = server.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(
					fromClient.getInputStream()));
				File f = new File(FILE_NAME);
				BufferedWriter  bw = new BufferedWriter(new FileWriter(f));
				String s = br.readLine();
				while(s != null) {
					bw.write(s + "\n");
					s = br.readLine();
				}
				bw.flush();
			} 
		}catch(Exception e){}
	}
}
		

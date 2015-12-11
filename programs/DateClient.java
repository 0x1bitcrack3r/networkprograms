import java.io.*;
import java.net.*;

public class DateClient {
	
	public static void main(String[] args) throws Exception {
		
			Socket mySocket = new Socket("localhost",5679);
			mySocket.setSoTimeout(15000);
			StringBuilder output = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			output.append(br.readLine());
			System.out.println(output);
		
	}
}


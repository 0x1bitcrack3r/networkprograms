import java.io.*;
import java.net.*;
import java.util.*;
public class MessageClient {
	
	public static void main(String[] args) throws Exception {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			String inputMessage = sc.nextLine();
			Socket mySocket = new Socket("localhost",5679);
			mySocket.setSoTimeout(15000);
			Writer out = new OutputStreamWriter(mySocket.getOutputStream());
			out.write(inputMessage);
			out.flush();
			StringBuilder output = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			output.append(br.readLine());
			System.out.println(output);
		
	}
}

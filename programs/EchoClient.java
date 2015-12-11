import java.io.*;
import java.net.*;

public class EchoClient {
	private static final String HOST_NAME = "localhost";
	private static final int PORT_NUMBER = 5679;
	public static void main(String[] args) {
		try {
			Socket mySocket = new Socket(HOST_NAME, PORT_NUMBER);
			mySocket.setSoTimeout(15000);
			StringBuilder output = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					mySocket.getInputStream()));
			while(br != null) {
				output.append(br.readLine());
			}
			System.out.println(output);
		}catch(ConnectException e) {
			System.out.println(e);
		}catch (IOException f){
			System.out.println(f);
		}
	}
}

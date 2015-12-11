import java.io.*;
import java.net.*;
import java.util.Date;
public class MessageServer {
	public static void main(String[] args) throws Exception{
		ServerSocket myServer = new ServerSocket(5679);
		while(true) {
			
				Socket connection = myServer.accept();
				Writer out = new OutputStreamWriter(connection.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder inputClient = new StringBuilder();
				inputClient.append(br.readLine());
				System.out.println(inputClient);
				out.write("Hello " + inputClient + " From Server !" );
				out.flush();
				connection.close();
			
		}
	}
}



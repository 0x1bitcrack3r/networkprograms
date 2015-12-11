import java.io.*;
import java.net.*;

public class EchoServer {
	public static void main(String[] args) throws Exception{
		ServerSocket myServer = new ServerSocket(5679);
		while(true) {
			try {
				Socket connection = myServer.accept();
				Writer out = new OutputStreamWriter(connection.getOutputStream());
				out.write("Hello World From Server");
				out.flush();
				connection.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}

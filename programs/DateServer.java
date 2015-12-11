import java.io.*;
import java.net.*;
import java.util.Date;
public class DateServer {
	public static void main(String[] args) throws Exception{
		ServerSocket myServer = new ServerSocket(5679);
		while(true) {
			
				Socket connection = myServer.accept();
				Writer out = new OutputStreamWriter(connection.getOutputStream());
				Date now = new Date();
				out.write(now.toString() + "\n");
				out.flush();
				connection.close();
			
		}
	}
}




import java.util.*;
import java.io.*;
import java.net.*;
public class DNSServer {
    public static void main(String[] args)throws Exception {
		HashMap<String,String> mappings = new HashMap<String,String>();
		mappings.put("www.google.co.in","92.163.144.123");
		mappings.put("www.microsoft.com","94.123.124.113");
		mappings.put("www.academics.vit.ac.in","192.163.134.123");
    	ServerSocket myserver = new ServerSocket(6789);
    	System.out.println("Server Listening at port" + 6789);
    	while(true){

    		Socket client = myserver.accept();
    		BufferedReader br = 
              new BufferedReader(new
              InputStreamReader(client.getInputStream())); 

           
			DataOutputStream  outToClient = 
             new DataOutputStream(client.getOutputStream());

             String ip = br.readLine();
             String ans = "";
             if(mappings.containsKey(ip))
				ans += mappings.get(ip);
			 else
				ans += "Sorry, dns details not found";
             outToClient.writeBytes(ans + '\n');

    	}
    }
}

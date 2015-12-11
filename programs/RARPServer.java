

import java.util.*;
import java.io.*;
import java.net.*;
public class RARPServer {
    public static void main(String[] args)throws Exception {
		HashMap<String,String> mappings = new HashMap<String,String>();
		mappings.put("b0:83:fe:77:a1:ef","192.16.1.1");
		mappings.put("b0:83:fe:77:a1:f0", "192.16.1.2");
		mappings.put("b0:83:fe:77:a1:f1", "192.16.1.3");
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
				ans += "Sorry, ip details not found";
             outToClient.writeBytes(ans + '\n');

    	}
    }
}

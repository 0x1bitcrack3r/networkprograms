/* 
* @Author: Krishna Kalubandi
* @Date:   2015-09-03 19:42:45
* @Last Modified by:   Krishna Kalubandi
* @Last Modified time: 2015-09-03 20:06:17
*/

import java.util.*;
import java.io.*;
import java.net.*;
public class ARPServer {
    public static void main(String[] args)throws Exception {
		HashMap<String,String> mappings = new HashMap<String,String>();
		mappings.put("192.16.1.1","b0:83:fe:77:a1:ef");
		mappings.put("192.16.1.2","b0:83:fe:77:a1:f0");
		mappings.put("192.16.1.3","b0:83:fe:77:a1:f1");
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
				ans += "Sorry, harware details not found";
             outToClient.writeBytes(ans + '\n');

    	}
    }
}

/* 
* @Author: Krishna Kalubandi
* @Date:   2015-09-03 19:42:45
* @Last Modified by:   Krishna Kalubandi
* @Last Modified time: 2015-09-03 20:06:17
*/

import java.util.*;
import java.io.*;
import java.net.*;
public class IPClassServer {
    public static void main(String[] args)throws Exception {

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
             System.out.println(ip);
             String first[] = ip.split("\\.");
             int id = Integer.parseInt(first[0]);
             String ans = "Class : ";
             if(id > 0 && id <= 127) 
				ans += "A";
			 else if(id > 127 && id <= 191)
				ans += "B";
			 else if(id > 191 && id <= 239)
				ans += "C";
			 else if(id > 240 && id <= 255)
				ans += "D";
			 else
				ans += "Invalid ip address";
             outToClient.writeBytes(ans + '\n');

    	}
    }
}

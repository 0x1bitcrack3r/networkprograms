/* 
* @Author: Krishna Kalubandi
* @Date:   2015-09-03 20:27:57
* @Last Modified by:   Krishna Kalubandi
* @Last Modified time: 2015-09-03 21:41:29
*/

import java.util.*;
import java.io.*;
import java.net.*;
class AsciiServer {
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

             String input = br.readLine();
             System.out.println(input);
             String[] asciis = input.split(" ");
             StringBuilder ans = new StringBuilder();
             for (int i = 0; i < asciis.length ; i++) {
        		try{
             	char c = (char)Integer.parseInt(asciis[i]);
             	ans.append(c+"");
             }catch(Exception e) {}
             	
             }
             outToClient.writeBytes(ans + "\n");
		}
	}
}
//234
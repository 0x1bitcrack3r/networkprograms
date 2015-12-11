
import java.util.*;
import java.io.*;
import java.net.*;
public class FactorialServer {
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

             int n = Integer.parseInt(br.readLine());
             int ans = 1;
             for(int i = 1; i <= n; i++)
             {
             	ans *= i;
             }
             String op = ans + "" + '\n';
             outToClient.writeBytes(op);

    	}
    }
}

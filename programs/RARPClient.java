


import java.util.*;
import java.io.*;
import java.net.*;
public class RARPClient {
    public static void main(String[] args) {

    	try{

    		Socket mysocket = new Socket("localhost",6789);
    		BufferedReader  br = new BufferedReader(new InputStreamReader(mysocket.getInputStream()));
    		DataOutputStream dos = new DataOutputStream(mysocket.getOutputStream());
    		dos.writeBytes(args[0] + '\n');
    		String output = br.readLine();
    		System.out.println("The ip address of the harware address  " + args[0] + " is " + output);
    		mysocket.close();

    	} catch(Exception e) {

    	}
    }
}

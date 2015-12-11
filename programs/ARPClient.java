/* 
* @Author: Krishna Kalubandi
* @Date:   2015-09-03 19:35:44
* @Last Modified by:   Krishna Kalubandi
* @Last Modified time: 2015-09-03 20:06:30
*/

import java.util.*;
import java.io.*;
import java.net.*;
public class ARPClient {
    public static void main(String[] args) {

    	try{

    		Socket mysocket = new Socket("localhost",6789);
    		BufferedReader  br = new BufferedReader(new InputStreamReader(mysocket.getInputStream()));
    		DataOutputStream dos = new DataOutputStream(mysocket.getOutputStream());
    		dos.writeBytes(args[0] + '\n');
    		String output = br.readLine();
    		System.out.println("The harware address of the ip  " + args[0] + " is " + output);
    		mysocket.close();

    	} catch(Exception e) {

    	}
    }
}

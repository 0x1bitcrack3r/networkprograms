/* 
* @Author: Krishna Kalubandi
* @Date:   2015-09-03 20:13:15
* @Last Modified by:   Krishna Kalubandi
* @Last Modified time: 2015-09-03 20:52:18
*/

import java.util.*;
import java.io.*;
import java.net.*;
class AsciiClient {
    public static void main(String[] args) throws Exception {

    	Socket mysocket = new Socket("localhost",6789);

    	DataOutputStream dos  = new DataOutputStream(mysocket.getOutputStream());
    	BufferedReader br = new BufferedReader(new InputStreamReader(mysocket.getInputStream()));

    	String input = args[0];

    	int[] arr= new int[input.length()];
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < input.length(); i++) {
    		int temp = input.charAt(i);
    			sb.append(temp);
    		if(i + 1 != input.length())
    			sb.append(" ");
    	}
    	dos.writeBytes(sb + "\n");

    	System.out.println(br.readLine());
    	mysocket.close();
    }
}
import java.util.*;
import java.io.*;
import java.net.*;
public class SaveContent{
	public static void main(String args[]) throws Exception{
		File f=new File("view_photo.asp");
		FileWriter fw=new FileWriter(f);
		if(args.length>0)
		{
			URL u=new URL(args[0]);
			URLConnection uc=u.openConnection();
			BufferedReader br=new BufferedReader(new InputStreamReader(uc.getInputStream()));
			String str=br.readLine();
			while(str!=null){
				fw.write(str);
				str=br.readLine();
			}
			fw.close();
		}
	}
}

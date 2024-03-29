import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.Scanner;

public class Izgara {
	
	public static String link(int i) {
		try {
			 if(i==1) {
				 URL url = new URL("http://bilgisayar.kocaeli.edu.tr/prolab2/url1.txt");
				    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
				    String s;String stoplam= "";
				    int y=0;
				    
				    while ((s = in.readLine()) != null) {				 
				    	stoplam +=s+",";
				    	y++;
				        }
				    
				   
				    in.close();
				 
			    return stoplam;
			     
			     }
			 else {
				 URL url = new URL("http://bilgisayar.kocaeli.edu.tr/prolab2/url2.txt");
				    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
				    String s;String stoplam= "";
				    int y=0;
				    
				    while ((s = in.readLine()) != null) {				 
				    	stoplam +=s+",";
				    	y++;
				        }
				    
				    
				    in.close();
				 
			    return stoplam;
			     
			     
			     
			}
			 
			}
			catch(IOException ex) {
			   
			   ex.printStackTrace(); 
			}
		return null;
	}
	
	
	
}

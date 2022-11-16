import java.io.*;
import java.util.*;
import java.net.URL;
public class SecondQuest {
    
    public static void main(String[] args)
        throws FileNotFoundException
    {
         try {
            URL url = new URL("https://bmc.edu.np");
 
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.println("Content of website");
            while ((br.readLine()) != null) {
                System.out.println(br.readLine());
            }
             br.close();
        }
         catch (Exception ex) {
 
            System.out.println(ex.getMessage());
        }
    }
}

import java.io.*;
import java.net.*;

public class ThirdQuest {
    public static void main (String[] args) throws IOException {
     InputStream in = null;
     try {
            URL url = new URL("https://bmc.edu.np");
            BufferedReader readr;
             readr = new BufferedReader(new InputStreamReader(url.openStream()));

              BufferedWriter writer = 
                  new BufferedWriter(new FileWriter("bmc_page.html"));

              String line;
                while ((line = readr.readLine()) != null) {
                    writer.write(line);
                }
               readr.close();
               writer.close();
               System.out.println("Successfully downloaded in bmc_page.html file");
        }catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        }
}
}
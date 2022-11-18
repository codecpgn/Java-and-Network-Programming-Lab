//no.4 client using TCP 
//package Np;

import java.io.*;
import java.net.Socket;

public class socketclient_no4 {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 9000);

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String str1 = "";
        while (!str1.equals("stop")) {
            str = br.readLine();
            dos.writeUTF(str);
            str1 = din.readUTF();
            System.out.println("Client says: " + str1);
        }
        s.close();

    }
}
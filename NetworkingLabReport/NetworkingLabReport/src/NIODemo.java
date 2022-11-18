
import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
public class NIODemo {
    
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("D:\\my document\\BCA\\6th sem\\Network Programming\\NetworkingLabReport\\demo.txt");
        FileChannel writeChannle = fout.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "program to demonstrate non-blocking I/O.";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannle.write(writeBuffer);
        System.out.println("data written");
          
        FileInputStream fin = new FileInputStream("D:\\my document\\BCA\\6th sem\\Network Programming\\NetworkingLabReport\\demo.txt");
        FileChannel readChannel = fin.getChannel();
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readChannel.read(readBuffer);
       System.out.println(result);
        
        while(result > 0 ){
            readBuffer.flip();
            while(readBuffer.hasRemaining()){
                System.out.print((char) readBuffer.get());
            }
            System.out.println("");
            break;
        }
        fin.close();

    }
}

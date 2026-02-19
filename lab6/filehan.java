package lab6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class filehan {
public static void main(String[] args) {

    try {
        FileInputStream fis = new FileInputStream("sample.txt");
        int i;
        while((i = fis.read()) != -1) {
        System.out.print((char)i);

        FileOutputStream fos = new FileOutputStream("sample.txt");
        String data = "Hello World!";
        fos.write(data.getBytes());
        fos.close();
        System.out.println("Data written successfully.");
        }
        fis.close();
        } catch (IOException e) {
        System.out.println(e);

        }
    
    }

}
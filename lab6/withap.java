package lab6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class withap {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("sample.txt");
            int i;
            System.out.println("File Content Before Writing:");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();


            FileOutputStream fos = new FileOutputStream("sample.txt", true);
            String data = "\nHello World!";
            fos.write(data.getBytes());
            fos.close();

            System.out.println("\nData appended successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

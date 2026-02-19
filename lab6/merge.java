package lab6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class merge {
    public static void main(String[] args) {

        try {
            FileInputStream fis1 = new FileInputStream("file1.txt");
            FileInputStream fis2 = new FileInputStream("file2.txt");
            FileOutputStream fos = new FileOutputStream("merged.txt");

            int i;

            System.out.println("Merging files...");

            while ((i = fis1.read()) != -1) {
                fos.write(i);
            }

            fos.write("\n".getBytes());

            while ((i = fis2.read()) != -1) {
                fos.write(i);
            }

            fis1.close();
            fis2.close();
            fos.close();

            System.out.println("Files merged successfully into merged.txt");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

package persistence.files.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Read {
    public static void main(String[] args) {
        try {

            InputStream file = new FileInputStream("C:\\Users\\reuda\\Downloads\\pruebas.txt");
            BufferedInputStream fileBuffer = new BufferedInputStream(file);

            int data = fileBuffer.read();

            while (data != -1) {
                System.out.print((char) data);
                data = fileBuffer.read();
            }

            fileBuffer.close();
            file.close();

        } catch (Exception e) {

        }
    }
}

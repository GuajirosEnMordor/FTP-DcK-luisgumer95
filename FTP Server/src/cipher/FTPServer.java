package cipher;

import java.io.*;
import java.net.*;

public class FTPServer {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = null;
        Socket s = null;
        InputStream is = null;
        OutputStream os = null;
        int count;
        try {
            ss = new ServerSocket(9000);
            s = ss.accept();
            is = s.getInputStream();
            os = new FileOutputStream("D:\\Programacion\\Proyectos SourceTree\\FTP Dck Gumer95\\FTP Files Server\\KeptyouwaitingIMG");

            byte[] bytes = new byte[100000];
            while ((count = is.read(bytes)) > 0) {

                os.write(bytes, 0, count);

            }

            os.close();
            s.close();
            is.close();
            ss.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}

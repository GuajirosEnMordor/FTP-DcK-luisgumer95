package cipher;

import java.io.*;
import java.net.*;

public class FTPClient {

    public static void main(String[] args) throws IOException{

        Socket s=null;

        try{
            s=new Socket("localhost",9000);
            File f=new File("D:\\Programacion\\Proyectos SourceTree\\FTP Dck Gumer95\\FTP Files Client\\KUW.png");

            byte[] bytes=new byte[100000];
            InputStream is=new FileInputStream(f);
            OutputStream os=s.getOutputStream();

            int count;

            while ((count=is.read(bytes))>0){
                os.write(bytes,0,count);

            }

            os.close();s.close();is.close();

        }catch(Exception e){

            e.printStackTrace();

        }
    }
}

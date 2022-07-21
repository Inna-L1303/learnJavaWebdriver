package PavanJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {

        //Approach1:Using FileReader BufferReader
        FileReader fr= new FileReader("C:\\Users\\lyasc\\Documents\\JavaEx.rtf");
        BufferedReader br=new BufferedReader(fr);

        String str;
        while((str=br.readLine())!=null)
        {
            System.out.println(str);
        }

    }
}

package chapter15.stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//다른 스트림을 받아서 byte읽기를 문자char셋 읽기로 변환시켜주는 보조스트림
public class InputStreamReaderTest {
    public static void main(String[] args) {
        try (InputStreamReader irs = new InputStreamReader(
                new FileInputStream("reader.txt"))) {
            int i = 0;
            while ((i = irs.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        /*
        Socket socket = new Socket();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}

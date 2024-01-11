package Kata5;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main (String[] args) throws IOException {
        try (InputStream IS = new URL("http://localhost:8081/power?value=5&number=4").openStream()){
            System.out.println(new String(IS.readAllBytes()));
        }
    }
}

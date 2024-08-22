
package multithreading;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.BufferedReader;

import java.net.Socket;

public class Question3client {
    public static void main(String[] args) {

        try {
            Socket client = new Socket("localhost", 2345);

            InputStreamReader reader = new InputStreamReader(client.getInputStream());
            BufferedReader breader = new BufferedReader(reader);
            String answer = breader.readLine();

            System.out.println("Client: " + answer);
        } catch (IOException ex) {
            System.out.println("Stopped");
        }

    }
}

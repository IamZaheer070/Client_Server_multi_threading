package multithreading;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.ServerSocket;
import java.net.Socket;

public class Question2server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(3005);
            Socket clientData = server.accept();
            try {
                InputStreamReader reader = new InputStreamReader(clientData.getInputStream());
                BufferedReader breader = new BufferedReader(reader);

                String message = breader.readLine();
                message = message.toUpperCase();
                StringBuilder mess = new StringBuilder();
                mess.append(message);
                mess.reverse();

                PrintWriter writer = new PrintWriter(clientData.getOutputStream());
                writer.println(mess);

                writer.flush();
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }

        } catch (IOException ex) {
            System.out.println("Server terminated!");
        }

    }
}
package multithreading;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.Socket;
import java.util.Scanner;

public class Question2client {
      public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",3005);
            System.out.println("Enter message: ");
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
                
            PrintWriter writer = new PrintWriter(client.getOutputStream());
            writer.println(input);
            writer.flush();
            
             InputStreamReader rea = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader(rea);

            String mess = br.readLine();
            System.out.println("From Server: "+mess);
            
        }
        catch (IOException ex) {
            System.out.println("Server Stopped");
        }
    }
}

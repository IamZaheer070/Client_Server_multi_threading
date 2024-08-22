
package multithreading;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.io.IOException;
import java.util.Scanner;
import java.net.Socket;

public class Question3server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2345);
            Socket socket = server.accept();
            String question;
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.print("Server: ");
            question = sc.nextLine();
            if (question.contains("name")) {
                writer.println("hamza");
            } else if (question.contains("age")) {
                writer.println("23");
            } else if (question.contains("DOB")) {
                writer.println("10/10/1997");
            } else if (question.contains("color")) {
                writer.println("black");
            } else
                writer.println("nothing");
            writer.flush();

        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}

import java.net.*;

class Question4portScanner {
	public static void main(String arg[]) {
		Socket s;
		for (int i = 1; i < 65536; i++) {
			try {
				s = new Socket("localhost", i);
				System.out.println("port open: " + i);
			} catch (Exception e) {
			}
		}
	}
}
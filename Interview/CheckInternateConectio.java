import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class CheckInternateConectio {
	public static void main(String[] args) {
		boolean isConnected = isInternetAvailable();
		if (isConnected) {
			System.out.println("Internet connection is available.");
		} else {
			System.out.println("Internet connection is not available.");
		}
	}

	public static boolean isInternetAvailable() {
		try (Socket socket = new Socket()) {
		// Attempt to connect to Google's DNS server
			socket.connect(new InetSocketAddress("8.8.8.8", 53), 1500);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}
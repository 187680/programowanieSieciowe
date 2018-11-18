package tcp.wyklad;

import java.io.DataInputStream;
import java.net.Socket;

public class TCPClient {
    static Socket clientSocket;

    public static void main() {
        clientSocket = new Socket("127.0.0.1", 3301);
        DataInputStream in = new DataInputStream(clientSocket.getInputStream());

    }
}

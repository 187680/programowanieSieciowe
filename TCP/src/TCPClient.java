import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        SingleThreadedServer server = new SingleThreadedServer(9000);

        System.out.println("Starting Server");



        new Thread(server).start();

        Socket socket = new Socket("localhost", 9000);

        socket.close();

        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stopping Server");
        server.stop();
    }
}

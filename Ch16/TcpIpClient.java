package Ch16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Created by Sang Jun Park on 8/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class TcpIpClient {
    public static void main(String[] args) {
        try{
            String serverIp = "127.0.0.1";
            System.out.println("Trying to connect to server. Server IP : " + serverIp);

            Socket socket = new Socket(serverIp, 7777);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("The message from the server is : " + dis.readUTF());
            System.out.println("End connection.");

            dis.close();
            in.close();
        } catch (ConnectException ce){
            ce.printStackTrace();
        } catch (IOException ie){
            ie.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

package Ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sang Jun Park on 8/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try{
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + " : Server is ready.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true){
            try{
                System.out.println(getTime() + " : Waiting request.");

                Socket socket = serverSocket.accept();
                System.out.println(getTime() + " : got a request from " + socket.getInetAddress() + ".");

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[Notice] Test Message1 from Server.");
                System.out.println(getTime() + " : sent data");

                dos.close();
                socket.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[hhh:mm:ss]");
        return f.format(new Date());
    }
}

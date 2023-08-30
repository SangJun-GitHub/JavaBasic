package Ch16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 8/28/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class TcpIpClient5 {
    public static void main(String[] args) {
        try{
            String serverIP = "127.0.0.1";
            Socket socket = new Socket(serverIP, 7777);

            System.out.println("success connect to server");
            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();
        } catch (ConnectException ce){
            ce.printStackTrace();
        } catch (IOException ie){
            ie.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Sender extends Thread{
    Socket socket;
    DataOutputStream out;
    String name;

    public Sender(Socket socket){
        this.socket = socket;
        try{
            out = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getInetAddress() + " : " + socket.getPort() + "]";
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (out != null){
            try{
                out.writeUTF(name + scanner.nextLine());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
class Receiver extends Thread{
    Socket socket;
    DataInputStream in;
    public Receiver(Socket socket){
        this.socket = socket;

        try{
            in = new DataInputStream(socket.getInputStream());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        while(in != null){
            try{
                System.out.println(in.readUTF());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}


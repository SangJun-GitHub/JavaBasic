package Ch16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Sang Jun Park on 8/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class TcpIpMultiChatServer {
    HashMap clients;

    TcpIpMultiChatServer(){
        clients = new HashMap();
        Collections.synchronizedMap(clients);
    }
    public void start(){
        ServerSocket serverSocket = null;
        Socket socket = null;

        try{
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + " sever is ready.");

            while(true){
                socket = serverSocket.accept();
                System.out.println("Connected from [" + socket.getInetAddress() + ":" + socket.getPort() + "]");
                ServerReceiver thread = new ServerReceiver(socket);
                thread.start();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    void sendToAll(String message){
        Iterator it = clients.keySet().iterator();

        while(it.hasNext()){
            try{
                DataOutputStream out = (DataOutputStream) clients.get(it.next());
                out.writeUTF(message);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }

    public static void main(String args[]){
        new TcpIpMultiChatServer().start();
    }

    class ServerReceiver extends Thread{
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        ServerReceiver(Socket socket){
            this.socket = socket;
            try{
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run(){
            String name = "";

            try{
                name = in.readUTF();
                sendToAll("#" + name + " is entered in this chat room.");

                clients.put(name, out);
                System.out.println("Current connected users is " + clients.size() + ".");

                while(in != null){
                    sendToAll(in.readUTF());
                }
            } catch (IOException e){
                e.printStackTrace();
            } finally {
                sendToAll("#" + name + " leaved in this chat room.");
                clients.remove(name);
                System.out.println("Disconnected from [" + socket.getInetAddress() + ":" + socket.getPort() + "]");
                System.out.println("Current connected users is " + clients.size() + ".");
            }
        }

    }
}

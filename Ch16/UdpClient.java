package Ch16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Sang Jun Park on 8/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class UdpClient {
    public void start() throws IOException, UnknownHostException{
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        byte[] message = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(message, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(message, message.length);

        datagramSocket.send(outPacket);
        datagramSocket.receive(inPacket);

        System.out.println("Current server time : " + new String(inPacket.getData()));
        datagramSocket.close();
    }

    public static void main(String[] args){
        try{
            new UdpClient().start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

package Ch16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sang Jun Park on 8/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class UdpServer {
    public void start() throws IOException{
        DatagramSocket datagramSocket = new DatagramSocket(7777);
        DatagramPacket inPacket, outPacket;

        byte[] inMessage = new byte[100];
        byte[] outMessage;

        while(true){
            inPacket = new DatagramPacket(inMessage, inMessage.length);

            datagramSocket.receive(inPacket);

            InetAddress address = inPacket.getAddress();
            int port = inPacket.getPort();

            SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
            String time = f.format(new Date());
            outMessage = time.getBytes();

            outPacket = new DatagramPacket(outMessage, outMessage.length, address, port);
            datagramSocket.send(outPacket);
        }
    }

    public static void main(String[] args) {
        try{
            new UdpServer().start();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

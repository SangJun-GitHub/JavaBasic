package Ch15;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Sang Jun Park on 8/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class RandomAccessFileEx1 {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf = new RandomAccessFile("src\\main\\resources\\test.dat", "rw");
            System.out.println("Position of pointer : " + raf.getFilePointer());
            raf.writeInt(100);
            System.out.println("Position of pointer : " + raf.getFilePointer());
            raf.writeLong(100L);
            System.out.println("Position of pointer : " + raf.getFilePointer());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

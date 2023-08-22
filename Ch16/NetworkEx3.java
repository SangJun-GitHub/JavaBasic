package Ch16;

import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Sang Jun Park on 8/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class NetworkEx3 {
    public static void main(String[] args) {
        URL url = null;
        String address = "https://docs.oracle.com/javase/8/docs/api/index.html?java/net/URL.html";

        try{
            url = new URL(address);
            URLConnection connection = url.openConnection();

            System.out.println("connection.toString()               : " + connection);
            System.out.println("getAllowUserInteraction()           : " + connection.getAllowUserInteraction());
            System.out.println("getConnectTimeout()                 : " + connection.getConnectTimeout());
            System.out.println("getContent()                        : " + connection.getContent());
            System.out.println("getContentEncoding()                : " + connection.getContentEncoding());
            System.out.println("getContentLength()                  : " + connection.getContentLength());
            System.out.println("getContentType()                    : " + connection.getContentType());
            System.out.println("getDate()                           : " + connection.getDate());
            System.out.println("getDefaultAllowUserInteraction()    : " + connection.getDefaultAllowUserInteraction());
            System.out.println("getDefaultUserCaches()              : " + connection.getDefaultUseCaches());
            System.out.println("getDoInput()                        : " + connection.getDoInput());
            System.out.println("getDoOutput()                       : " + connection.getDoOutput());
            System.out.println("getExpiration()                     : " + connection.getExpiration());
            System.out.println("getHeaderFields()                   : " + connection.getHeaderFields());
            System.out.println("getIfModifiedSince()                : " + connection.getIfModifiedSince());
            System.out.println("getLastModified()                   : " + connection.getLastModified());
            System.out.println("getReadTimeout()                    : " + connection.getReadTimeout());
            System.out.println("getURL()                            : " + connection.getURL());
            System.out.println("getUseCaches()                      : " + connection.getUseCaches());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

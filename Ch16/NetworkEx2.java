package Ch16;

import java.net.URL;

/**
 * Created by Sang Jun Park on 8/20/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class NetworkEx2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://docs.oracle.com/javase/8/docs/api/index.html?java/net/URL.html");

        System.out.println("url.getAuthority() : " + url.getAuthority());
        System.out.println("url.getContent() : " + url.getContent());
        System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
        System.out.println("url.getPort() : " + url.getPort());
        System.out.println("url.getFile() : " + url.getFile());
        System.out.println("url.getHost() : " + url.getHost());
        System.out.println("url.getPath() : " + url.getPath());
        System.out.println("url.getProtocol() : " + url.getProtocol());
        System.out.println("url.getQuery() : " + url.getQuery());
        System.out.println("url.getRef() : " + url.getRef());
        System.out.println("url.getUserInfo() : " + url.getUserInfo());
        System.out.println("url.toExternalForm() : " + url.toExternalForm());
        System.out.println("url.toURI() : " + url.toURI());
    }
}

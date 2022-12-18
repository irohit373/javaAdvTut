import java.net.*;
import java.util.Arrays;

public class networking {
    
    public static void main(String[] args) throws UnknownHostException {
        String url = "https://www.deshmukhji.com";    
        InetAddress ip4 = Inet4Address.getByName(url);
        
        System.out.println("address : " + Arrays.toString(ip4.getAddress()));

        System.out.println("Hostname : "+ ip4.getHostAddress());
    
        // System.out.println("isAnyLocalAddress : " + ip4.isAnyLocalAddress());
        // System.out.println("isAnyLocalAddress : " + ip4.isLinkLocalAddress());
        // System.out.println("isAnyLocalAddress : " + ip4.isLoopbackAddress());
        // System.out.println("isAnyLocalAddress : " + ip4.isSiteLocalAddress());
        // System.out.println("hashcode : " + ip4.hashCode());
    }
    
}

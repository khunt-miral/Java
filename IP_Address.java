import java.net.*;
public class IP_Address 
{
    public static void main(String args[]) throws Exception
    {
            try {
                InetAddress IP = InetAddress.getLocalHost();
                System.out.println("IP of my system is := "+IP.getHostAddress());
            } catch (Exception e) {
                
            }
       
    }    
}

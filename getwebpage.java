import java.net.*;
import java.io.*;
import java.util.*;
public class getwebpage 
{
    public static void main(String args[]) throws Exception
    {

        //Scanner sc = new Scanner(System.in);
      //  System.out.print("enter url \n");
     //   String url = sc.next();

        String url="www.neverssl.com";
            try {
                Socket webSocket = new Socket(url,80);
                OutputStream outputS =webSocket.getOutputStream();
                InputStream inputS = webSocket.getInputStream(); 

                try {
                    outputS.write("GET / HTTP\1.2 \r\n\r\n".getBytes(),0,18);
                   // System.out.println(outputS);
                    for (int i = 0; i < 3; i++) {
                        System.out.print("" + (char) inputS.read());
                     }

                } catch (Exception e2) 
                {
                   System.out.println(e2);
                }
                try {
                
                    inputS = new BufferedInputStream( inputS );
                    System.out.println(inputS.read());
                    int D;
                    String msgin = "";
                    while ((D = inputS.read()) != -1) {
                        msgin += (char) D;}
                        System.out.println(msgin);

                    
                } catch (Exception e3) 
                {
                   System.out.println(e3);
                }
               
               
            } catch (Exception e) {
              
                System.out.println(e);
            }
       
    }    
}

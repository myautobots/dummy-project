import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ShowAnyIp {
public static void main(String []args){
try{
Scanner kb=new Scanner(System.in);
System.out.println("Enter website name:");
String str=kb.next();
InetAddress obj=InetAddress.getByName(str);
System.out.println("IP address of " + str +" is "+obj.getHostAddress());
}
catch(UnknownHostException ex){
   System.out.println("Exception is"+ex);
}
}    
}

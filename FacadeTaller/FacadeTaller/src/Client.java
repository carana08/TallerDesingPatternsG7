import java.util.Scanner;
public class Client {
    	public static void main(String arg[]) {
    	Scanner sc = new Scanner(System.in);
    	int value;
        OnlineAttentionFacadeImpl onlineAtenttion = new OnlineAttentionFacadeImpl();
        System.out.println("Enter an option:\n1. Web\n2. Mobile\n3. Phone\n4.Presencial");
        value=sc.nextInt();
        switch(value) {
        case 1:
        	System.out.println(onlineAtenttion.attendRequestWeb());
        case 2:
        	System.out.println(onlineAtenttion.attendRequestMobile());
        case 3:
        	System.out.println(onlineAtenttion.attendRequestPhone());
        case 4:
        	System.out.println(onlineAtenttion.attendRequest());
        }
        sc.nextLine();
    	}   
}
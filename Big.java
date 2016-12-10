import java.util.*;
public class Big {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
     int c=s.nextInt();
     if(a>b&&a>c)
     {
    	 System.out.println("a is big");
     }
     else if(b>a&&b>c)
     {
    	 System.out.println("b is big");
     }
     else if(c>a&&c>b)
     {
    	 System.out.println("c ic big");
     }
     else
     {
    	 System.out.println("none of these");
     }
	}

}

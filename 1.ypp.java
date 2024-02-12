import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int xi,yi,zi;
	    int x=0,y=0,z=0;
	    for(int i=0;i<n;i++)
	    {
	        xi=sc.nextInt();
	        yi=sc.nextInt();
	        zi=sc.nextInt();
	        x+=xi;
	        y+=yi;
	        z+=zi;
	    }
	    if(x==0 && y==0 && z==0)
	    {
	        System.out.println("YES");
	    }
	    else
	    {
	         System.out.println("NO");
	    }
	}
}

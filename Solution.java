import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int u = sc.nextInt();
		for(int i =1;i<u;i++)
		{
		    if(i%x==0||i%y==0||i%(x+y)==0)
		        System.out.print(i+" ");
		}
		System.out.println();
		for(int i=u-1;i>1;i--)
		{
		    if(i%x==0||i%y==0||i%(x+y)==0)
		        System.out.print(i+" ");
		}

	}
}

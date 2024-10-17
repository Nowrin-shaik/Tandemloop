import java.util.*;
public class Program_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input:");
		int a=sc.nextInt();
		int result=1;
		a=(a%2!=0)?a:a-1;
		for(int i=0;i<a;i++) {
			System.out.print(result);
			result+=2;
			if(i<a-1) {
				System.out.print(",");
			}
		}
		sc.close();
	}
}


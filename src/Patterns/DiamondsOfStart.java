package Patterns;
import java.util.Scanner;

public class DiamondsOfStart {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, i=1, space, j;
		
		n = s.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Number should be Odd Number");
			return;
		}
		
		while(i<=n/2 + 1) {
			space = n/2 - i + 1;
			while(space>0) {
				System.out.print(' ');
				space--;
			}
			j = 1;
			while(j<=i*2 - 1) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
		
		i = 1;
		while(i<=n/2) {
			space = i;
			while(space>0) {
				System.out.print(' ');
				space--;
			}
			j = n - i*2;
			while(j>0) {
				System.out.print('*');
				j--;
			}
			System.out.println();
			i++;
		}
	}

}

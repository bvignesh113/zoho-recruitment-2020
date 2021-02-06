import java.util.Scanner;

public class Pattern_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int  N = 0;
		try {
		  N = in.nextInt();
		
		int[][] arr = new int[N][N];
		
		if(N > 0) {
		for(int  i = 0 ; i < arr.length ; i++)
		{
			for(int j = i ; j < arr.length ; j++) {
				
				arr[i][j] = N;
				arr[j][i] = N;
				
			}
			N--;
		}
		N = arr.length;
		for(int  i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < N ; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		
	}
		}
		else
		{
			System.out.println(" Enter value greater than 0");
		}
		}
		catch(Exception e)
		{
			System.out.println("Enter values between 0 and 10");
		}
}
}

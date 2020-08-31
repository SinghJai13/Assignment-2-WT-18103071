import java.util.Scanner;


public class Que4{
	public static void main(String[] args) {
		double n=Integer.MAX_VALUE;

		while(n>=0)
		{
			double k=(n*(n+1))/2;

			if(k==n*n)
			{
				System.out.println("the Number is "+n );
				break;
			}
			n--;
		}


	}
}
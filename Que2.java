import java.util.Scanner;

public class Que2{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n;

		 System.out.println("Enter the size of Array: ");
		  n = sc.nextInt();

		  int a[];
		  a= new int[n];

		  int count[]=new int[21];

		  for(int i=0;i<21;i++)
		  {
		  	count[i]=0;
		  }

		  int k=0;
		  System.out.println("Enter the elements of the array between 0 and 20 : ");
		  for(int i=0;i<n;i++)
		  {
		  	k=sc.nextInt();
		  	while(k<0||k>20)
		  	{
		  		System.out.println("Entered value is out of range.Please enter a value between 0 and 20 ");
		  		k=sc.nextInt();
		  	}
		  	a[i]=k;

		  	count[a[i]]++;
		  }
		  int it=0;
		  for(int i=0;i<21;i++)
		  {
		  	if(count[i]==0)
		  	{
		  		continue;
		  	}
		  	else
		  	{
		  		for(int j=it;j<it+count[i];j++ )
		  		{
		  			a[j]=i;
		  		}
		  		it+=count[i];

		  	}
		  }


		  for(int i=0;i<n;i++)
		  {
		  	System.out.print(a[i]+" ");
		  }
	}
}
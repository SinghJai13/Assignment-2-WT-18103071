import java.util.Scanner;
public class Que5a{

	public static int[] union(int[] a, int[] b){
		int visted[]=new int[11];

		for(int i=0;i<11;i++)
			visted[i]=0;

		int un_ans[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(visted[a[i]]==0)
			{
				System.out.print(a[i]+" ");
				visted[a[i]]=1;
				un_ans[k]=a[i];
				k++;
			}
		}

		for(int i=0;i<b.length;i++)
		{
			if(visted[b[i]]==0)
			{
				System.out.print(b[i]+" ");
				visted[b[i]]=1;
				un_ans[k]=b[i];
				k++;
			}
		}
		System.out.println(" ");
		return visted;

	}
	public static int[] intersection(int[] a, int[] b){
		int visted[]=new int[11];
		int k=0;
		for(int i=0;i<11;i++)
			visted[i]=0;

		for(int i=0;i<a.length;i++)
		{
			if(visted[a[i]]==0)
			{
				
				visted[a[i]]=1;
				
			
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(visted[b[i]]==2)
			{
				continue;
			}
			if(visted[b[i]]==1)
			{
				visted[b[i]]=2;

				k++;
			}
		}
		int int_ans[]=new int[k];
		for(int i=0,j=0;i<11 &&j<k;i++)
		{
			if(visted[i]==2)
			{
				int_ans[j]=i;
				j++;
			}
		}

		return int_ans;

	}

	public static int[] comp(int []a ){
		int visted[]=new int[11];

		for(int i=0;i<11;i++)
			visted[i]=0;

		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(visted[a[i]]==0)
			{
				k++;
				visted[a[i]]=1;
				
			
			}
		}
		int com_ans[]=new int[11-k];

		for(int i=0,j=0;i<11&&j<11-k;i++)
		{
			if(visted[i]==0)
			{
				com_ans[j]=i;
				j++;
			}
		}
		return com_ans;

	}
	public static void main(String[] args) {

		 long start = System.currentTimeMillis();
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the size of set A  ");

		int n1=sc.nextInt();

		System.out.println("Enter the elements of Set A from Universe = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}: ");

		int a[]=new int[n1];

		for(int i=0;i<n1;i++)
		{
			int x = sc.nextInt();
            while(x < 0 || x > 10) {
                System.out.println("Not from Universal Set {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}. Enter a number between 0 and 10 ");
                x = sc.nextInt();
            }
			a[i]=x;

		}
		
		System.out.println("Enter the size of set B  ");

		int n2=sc.nextInt();

		System.out.println("Enter the elements of Set B from Universe = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}: ");

		int b[]=new int[n2];

		for(int i=0;i<n2;i++)
		{
			int x = sc.nextInt();
            while(x < 0 || x > 10) {
                System.out.println("Not from Universal Set {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}. Enter a number between 0 and 10 ");
                x = sc.nextInt();
            }
			b[i]=x;

		}

		System.out.println(" ");

		System.out.println("Union of A and B is " );
		int un_ans[]=union(a,b);


		System.out.println("Intersection of A and B is  ");

		

		int int_ans[]=intersection(a,b);
		for(int i=0;i<int_ans.length;i++)
		{
			System.out.print(int_ans[i]+" ");
		}
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Complement of A ");
		int com_a[]=comp(a);
		for(int i=0;i<com_a.length;i++)
		{
			System.out.print(com_a[i]+" ");
		}
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Complement of B ");
		int com_b[]=comp(b);
		for(int i=0;i<com_b.length;i++)
		{
			System.out.print(com_b[i]+" ");
		}
		System.out.println(" ");

		 long end = System.currentTimeMillis();
        System.out.println("\nTime taken: " + (end - start) + " milliseconds");

	}
}
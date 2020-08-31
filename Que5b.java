import java.util.*;
public class Que5b{
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		Set<Integer> a=new HashSet<Integer>();
        Set<Integer> b=new HashSet<Integer>();
        Set<Integer> universal=new HashSet<Integer>();
        
        universal.addAll(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of set A  ");

		int n1=sc.nextInt();

		System.out.println("Enter the elements of Set A from Universe = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}: ");

		for(int i=0;i<n1;i++)
		{
			int x = sc.nextInt();
            while(x < 0 || x > 10) {
                System.out.println("Not from Universal Set {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}. Enter a number between 0 and 10 ");
                x = sc.nextInt();
            }
			a.add(x);

		}

		System.out.println("Enter the size of set B  ");

		int n2=sc.nextInt();

		System.out.println("Enter the elements of Set B from Universe = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}: ");

		for(int i=0;i<n2;i++)
		{
			int x = sc.nextInt();
            while(x < 0 || x > 10) {
                System.out.println("Not from Universal Set {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}. Enter a number between 0 and 10 ");
                x = sc.nextInt();
            }
			b.add(x);

		}

		Set<Integer> uni_ans=new HashSet<Integer>(a);
        uni_ans.addAll(b);
        System.out.println("Union of Set A and Set B is  "+uni_ans);
        
        Set<Integer> int_ans= new HashSet<Integer>(a);
        int_ans.retainAll(b);
        System.out.println("Intersection of Set A and Set B is "+int_ans);
        
        Set<Integer> comp_a= new HashSet<Integer>(universal);
        comp_a.removeAll(a);
        System.out.println("Complement of Set A is: "+comp_a);
        
        Set<Integer> comp_b= new HashSet<Integer>(universal);
        comp_b.removeAll(b);
        System.out.println("Complement of Set B is "+comp_b);


		 long end = System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+" milliseconds");
	}
}
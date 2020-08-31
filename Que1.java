import java.util.Scanner;

public class Que1{

	public static  void longer(String str1,String str2){
		int a=0;
		int b=0;

		for(int i=0;i<str1.length();i++)
		{
			a+=(int)(str1.charAt(i));


		}
		for(int i=0;i<str2.length();i++)
		{
			b+=(int)(str2.charAt(i));


		}

		if(a==b)
		{
			System.out.println("Strings are lexicographically equal ");
			return;
		}

		if(a>b)
		{
			System.out.println("String 1 is lexicographically greater than String 2");
			return;
		}
		System.out.println("String 2 is lexicographically greater than String 1 ");
		return ;

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the string 1   :- ");

		String str=sc.nextLine();

		System.out.println("enter the string 2 :- ");
		
		String sub=sc.nextLine();
		longer(str,sub);

}
}
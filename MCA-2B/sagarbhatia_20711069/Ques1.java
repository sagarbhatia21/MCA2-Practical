import java.util.Scanner;
class Ques1
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
		int m=n;
		int a=1;
		while(n!=0)
		{
			a=a*n;
			n--;
		}
		System.out.println("factorial of " +m+" is "+a);
	}
}
import java.util.*;
class Calc
{
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	public void substraction(int a, int b)
	{
		System.out.println(a-b);
	}
	public void multiplication(int a, int b)
	{
		System.out.println(a*b);
	}
	public void division(int a, int b)
	{
		System.out.println(a/b);
	}
	public static void main(String ar[])
	{
		Calc c=new Calc();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the values for operations");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Enter your choice to proced 1-->add/n 2-->sub/n 3-->mul-->/n 4-->div/n");
		int n=sc.nextInt();
		switch(n){
				case 1:c.addition(x,y);
					break;
				case 2:c.substraction(x,y);
					break;
				case 3:c.multiplication(x,y);
					break;
				case 4:c.division(x,y);
					break;
			}
	}
}
	
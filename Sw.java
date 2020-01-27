import java.util.*;
class Sw
{
	public static void main(String ar[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		switch(n){
			case 1: System.out.println("Monday");
					break;	
			case 2: System.out.println("Tuesday");
					break;
			case 3: System.out.println("Wensday");
					break;
			case 4: System.out.println("Thursday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Satday");
					break;
			case 7: System.out.println("Sunday");
					break;
			default: System.out.println("please choose a number between 1-7"); 
			}
	}
}
		
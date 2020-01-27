import java.util.*;
class Min
{	
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		int temp1=arr[0];
		for(int i=0;i<n;i++)
		{
			if(temp>arr[i])
			temp=arr[i];
		}
		System.out.println("min"+temp);
	
		for(int i=0;i<n;i++)
		{
			if(temp1<arr[i])
			temp1=arr[i];
		}
		System.out.println("max"+temp1);
}
}

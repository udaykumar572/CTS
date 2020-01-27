import java.util.*;
class MinMax
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
	int temp=0;
	int temp1=0;
	public void Min()
	{
		for(int i=0;i<arr[n];i++)
		{
			if(temp>arr[i])
			temp=arr[i];
		}System.out.println(temp);
	}
	
	public void Max()
	{
		for(int i=0;i<arr[n];i++)
		{
			if(temp<arr[i])
			temp1=arr[i];
		}
		System.out.println(temp1);
	}
	public static void main(String ar[])
	{
	MinMax a=new MinMax();
	a.Min();
	a.Max();
}	}
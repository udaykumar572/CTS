import java.util.*;
class Order{
	public static void main(String ar[])
	{
		int asc[]=new int[10];
		int des[]=new int[10];
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
int temp=0;
int temp1=0;
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
 		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	System.out.println("ASSSSSCENDING ORDER");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]<arr[j])
				{
		
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("DESCENDING ORDER");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}
class Factorial
{
	public void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of a given num is:"+fact);
	}
	public static void main(String ar[])
	{
		Factorial f=new Factorial();
		f.fact(5);
	}
}
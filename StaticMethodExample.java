class StaticMethodExample
{
	static int num;
	
	int c;
	static void setStatic(int a)
	{
		num=a;
	System.out.println(num);
	}
	public static void main(String ar[])
	{
		setStatic(10);
	}
}
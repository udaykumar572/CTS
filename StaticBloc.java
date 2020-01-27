class StaticBloc
{
	static int a;
	static 	
	{
		a=10;	
		System.out.println("Static block is called:");
	}
	static void setA(int a)
	{
	//             a=56;
	System.out.println("Static method is called"+a);
	}
	public static void main(String ar[])
	{
		setA(10);
	}
}
class A
{
	static int count=0;
	A()
	{
		count++;
	}

	public static void main(String ar[])
	{
		A a1=new A();
		A a2=new A();
		System.out.println(count);
	}
}
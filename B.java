class B
{
	static int count;
	B()
	{
		count++;
	}
	public static void main(String ar[])
	{	
		B b=new B();
		B b1=new B();
		System.out.println(b.count);
	}
}
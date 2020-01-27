class Cons
{
	Cons()
	{
		System.out.println("A()");
	}
	Cons(int a)
	{
		this();
		System.out.println(a);
	}
	Cons(int a,int b)
	{
		this(a);
		System.out.println(b);
	}
	public static void main(String ar[])
	{
		Cons c=new Cons(2,56);
		

	}
}		
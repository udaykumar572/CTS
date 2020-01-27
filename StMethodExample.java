class StMethodExample
{
	static int num;
	
	int c;
	public void setStatic(int a)
	{
		num=a;
	System.out.println(num);
	}
	public static void main(String ar[])
	{
		StMethodExample a=new StMethodExample();
		a.setStatic(10);
	}
}
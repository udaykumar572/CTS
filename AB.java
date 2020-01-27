class AB
{
	  static int count=0;
	int adc;
	AB()
	{
		count++;
	}

	public static void main(String ar[])
	{	
		int a=10; 
		AB a1=new AB();
		AB a2=new AB();
		System.out.println(count);
		System.out.println(a1.adc);
		System.out.println(a);
	}
}
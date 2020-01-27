class Rec
{
	public int fact(int n)
	{
		if(n==1)
		{
			return n;
		}
		else
		{
			return(n*fact(n-1));
				
			}
	}

	public static void main(String ar[])
	{
		Rec f=new Rec();
		//f.fact(5);
	System.out.println(f.fact(5));
	}
}
import java.util.*;
class Box
{	int l,h,w;
	public void volume(int l,int w,int h)
	{	
		System.out.println(l*w*h);
	}
	public void setdata(int l, int w,int h)
	{
		this.l=l;
		this.w=w;
		this.h=h;
	}
	public void getdata()
	{
		System.out.println("Length: "+l+"\nHeight :"+h+"\nwidth :"+w);
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter length height and width ");
		int l=sc.nextInt();
		int h=sc.nextInt();
		int w=sc.nextInt();
		Box b=new Box();
		b.setdata(l,w,h);
		b.getdata();
		b.volume(l,w,h);
	}
}
class MainBox
{
	public static void main(String ar[])
	{
		Boxv v=new Boxv();
		v.calVolume();
		v.getBox();
		Boxv v1=new Boxv();
		v1.setBox(10,20,16);
		v1.calVolume();
		v1.getBox();
	}
}
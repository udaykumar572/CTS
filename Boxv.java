class Boxv
{
	int boxLength,boxHeight,boxWidth;
	public Boxv()
	{
		boxLength=5;
		boxHeight=10;
		boxWidth=8;
	}
	public Boxv(int boxlength,int boxHeight,int boxWidth)
	{
		
		this.boxLength=boxLength;
		this.boxHeight=boxHeight;
		this.boxWidth=boxWidth;
	}
	public void setBox(int len,int height,int width)
	{
		
		boxLength=len;
		boxHeight=height;
		boxWidth=width;	
	}
	public void getBox()
	{
		System.out.println("Height: "+boxHeight+"\nLength: "+boxLength+"\nWidth: "+boxWidth);
		System.out.println("volume of the box is:"+calVolume());
	}
	public int calVolume()
	{	
		return(boxLength*boxHeight*boxWidth);
	}
}
	
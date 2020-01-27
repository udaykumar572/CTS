class Student{
 int id;
String Name;
String Branch;
int Fees;
public void setdetails(int id, String Name, String Branch,int Fees)
{
	this.id=id;
	this.Name=Name;
	this.Branch=Branch;
	this.Fees=Fees;
}
public void getdetails()
{
	System.out.println("ID : "+id);
	System.out.println("Name : "+Name);
	System.out.println("Branch : "+Branch);
	System.out.println("Fees : "+Fees); 
}
public static void main(String ar[])
{
	Student s=new Student();
	s.setdetails(1,"BALAJI","CSE",54565);
	s.getdetails();
}
}	
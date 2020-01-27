class Employee
{
	int empId;
	String empName;
	int empSalary;
	public Employee()
	{
	empId=200;
	empName="Balajii";
	empSalary=290909;
	}
	public Employee(int id,String name,int salary)
	{
		this.empId=id;
		this.empName=name;
		this.empSalary=salary;
	}

	public void empset(int id,String name,int salary)
	{
		empId=id;
		empName=name;
		empSalary=salary;
	}
	public void empget()
	{
		System.out.println("Employe Id : "+empId+"\nEmployee name : "+empName+"\nEmployee Salary : "+empcalculate());
	}
	public int empcalculate()
	{
		return(empSalary+500);
	}
}

public class Employye {

	int empId,empSalary;
	String empName;
	public Employye()
{
	}

	public Employye(int empId, String empName, int empSalary) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employye e1=new Employye(01,"Balaji",22000);
		System.out.println("Employee name "+e1.getEmpName()+"Employee id:"+e1.getEmpId()+"Employee Salary:"+e1.getEmpSalary()
		);
		Employye e2=new Employye();
		e2.setEmpId(02);
		e2.setEmpName("ANil");
		e2.setEmpSalary(20000);	
		System.out.println("Employee name "+e2.getEmpName()+"Employee id:"+e2.getEmpId()+"Employee Salary:"+e2.getEmpSalary()
);
		
	}

}

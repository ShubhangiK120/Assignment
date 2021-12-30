package employee;

public class EmployeeInfo 
{
   int emp_id;
   String emp_name;
   int emp_age;
   float emp_salary;
  
   public EmployeeInfo(int id,String name,int age,float salary)
   {
	this.emp_id=id;
	this.emp_name=name;
	this.emp_age=age;
	this.emp_salary=salary;
   }
   public void employeeDetails()
   {
	 System.out.println("emp id="+ emp_id);  
	 System.out.println("emp name="+emp_name);
	 System.out.println("emp age="+emp_age);
	 System.out.println("emp_salary="+emp_salary);
   }
	public static void main(String[] args) 
	{
	 EmployeeInfo emp1 = new EmployeeInfo(101,"Umanj",23,20000);
	 emp1.employeeDetails();
	  
	}

}

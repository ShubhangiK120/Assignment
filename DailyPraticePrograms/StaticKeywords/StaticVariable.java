package StaticKeywords;


class Employee
{
	int empid;
	String name;
	static String empcompany="Smart Programming";
	
	public Employee(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
	}
	void display()
	{
		System.out.println("............Employee Details......... ");
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee name:"+name);
		System.out.println("Employee Company Name:"+empcompany);
		System.out.println();
	}
}
public class StaticVariable 
{

	public static void main(String[] args) 
	{
      Employee emp=new Employee(101, "Shubhangi");
      Employee emp1=new Employee(102, "Aishwarya");
      Employee emp2=new Employee(103, "Karshima");
      emp.display();
      emp1.display();
      emp2.display();
	} 

}

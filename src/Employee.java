import java.sql.Date;
import java.util.Calendar;
import java.util.Date.*;

public abstract class Employee {  
	
	static int employeeNumber = 1;
	private String name;           
	private double salary;
	private int idNumber;
	public String department; 
	public Gender gender;
	private int staffNumber;


	protected final double employeeBonusBase=200;
	
	public Employee() {
		
	}
	
	public Employee (String name, double salary, int idNumber, String department, Gender gender) {
		this.name = name;
		this.salary = salary;
		this.idNumber = idNumber;
		this.gender = gender;
		this.department = department;
		this.staffNumber = employeeNumber;
		employeeNumber++;
	}

	abstract public double bonus(); 
	
	public String getName(){ 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary){ 
	this.salary=salary;
	
	}
	
	public double getSalary() {  
		return salary;

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	public int getIdNumber() {
		return idNumber;
	}

	public int getStaffNumber() {
		return staffNumber;
	}

	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}	
	
	@Override
	public String toString() {
		return (staffNumber + " \t" + name + " \t" + (int) salary);
}
	
	public int getAge() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - (idNumber / 1000000);
		return age;
	}
	

}
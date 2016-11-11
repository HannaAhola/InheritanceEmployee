
public abstract class Employee {   

	private String name;           
	private double salary;
	private int idNumber;
	public String department; 
	public Gender gender;
	protected final double employeeBonusBase=3000;  //protected since public cannot be inherited 
	
	public Employee(String name, double salary, int idNumber, String department, Gender gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.idNumber = idNumber;
		this.gender=gender;
		this.department=department; 
	
	}

	abstract public double bonus(); 

	
	public String getName(){    //no setters 
		return name;
	}
	
	public void setSalary(double salary){  
	this.salary=salary;
	}
	
	public double getSalary() {   
	return salary;
	}

	public int getIdnumber() {     //no setters 
		return idNumber;

	
	}
	
	public static enum Gender {
		FEMALE,
		MALE
	}
}


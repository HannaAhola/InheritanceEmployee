

public class Admin extends Employee {

	int employeeBonusBase = 300;
	double bonus;


	public Admin (String name, double salary, String department, int idNumber, Gender gender) {  
	super(name, salary, idNumber, department, gender);

	}

	
	public double bonus() {
	bonus = employeeBonusBase*getAge();
	return bonus; 
	}
	
	

}
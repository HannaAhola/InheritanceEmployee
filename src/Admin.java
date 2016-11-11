

public class Admin extends Employee {

	
	double bonus;
	
	public Admin (String name, double salary, int idNumber, String department, Gender gender) {  //constructor i subklassen //konstruktorn har alltid klassnamn. konstuktorn har aldrig returtyp, men det har alltid metoden
	super(name, salary, idNumber, department, gender);       //call to constructor in superclass 
    
	}
	
	public double bonus() {             //method med returtyp double
	bonus = employeeBonusBase;    
	return bonus; 

	}

}
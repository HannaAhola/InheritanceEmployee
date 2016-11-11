

public class Development extends Employee{

	int numberOfapplications;
	
	public Development (String name, double salary, int idNumber, String department, Gender gender) {  //constructor i subklassen //konstruktorn har alltid klassnamn. konstuktorn har aldrig returtyp, men det har alltid metoden
	super(name, salary, idNumber, department, gender);                              //call to constructor in superclass 

	}
	
	public double bonus() {             //method med returtyp double 
	double bonus = employeeBonusBase * numberOfapplications; 
	return bonus; 
	
	}
	
	public void anOtherApplication() {   //method med returtyp void
	numberOfapplications +=1;
	}

}


public class Technician extends Employee {

int numbersOfServerCrasches=0;

	public Technician(String name, double Salary) {  //constructor i subklassen //konstruktorn har alltid klassnamn. konstuktorn har aldrig returtyp, men det har alltid metoden 
	super(name, Salary);   //call to constructor in superclass 

	}
	
	public double bonus(){      //method med returtyp double 
		double bonus = employeeBonusBase-numbersOfServerCrasches;
		return bonus;           
	}

    public void anotherServerCrash(){ //method med returtyp void
	numbersOfServerCrasches=+1;
}
	
}

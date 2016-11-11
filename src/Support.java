

public class Support extends Employee {

int numbersOfServerCrasches=0;

	public Support(String name, double salary, int idNumber, String department, Gender gender) {  //constructor i subklassen //konstruktorn har alltid klassnamn. konstuktorn har aldrig returtyp, men det har alltid metoden 
		super(name, salary, idNumber, department, gender);      //call to constructor in superclass 

	}
	
	public double bonus(){       
		double bonus = employeeBonusBase-numbersOfServerCrasches;
		return bonus;           
	}

    public void anotherServerCrash(){ 
	numbersOfServerCrasches=+1;
}
	
}

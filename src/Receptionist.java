
public class Receptionist extends Employee {

	int age;
	double bonus;
	
	public Receptionist (String name, double Salary, int age) {  //constructor i subklassen //konstruktorn har alltid klassnamn. konstuktorn har aldrig returtyp, men det har alltid metoden
	super(name, Salary);    //call to constructor in superclass 
    this.age=age; 
	}
	
	public double bonus() {             //method med returtyp double
	bonus = employeeBonusBase + age*30;
	return bonus; 

	}

}
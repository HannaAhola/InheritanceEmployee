
public abstract class Employee {   //vi tvingar alla subklasser att implementera en abstralt metod, idf bonusmetod

	private String name;          //private/protected variables 
	private double salary;
	protected final double employeeBonusBase;  //konstant. private kan inte �rvas, protected/public kan �rvas 
	
	abstract public double bonus(); //abstract metod f�r bonus = vi har ingen default metod f�r bonus, metoden ser olika ut f�r varje subklass. Klass m�ste vara abstract om det finns en abtract metod 
	
	public Employee (String a, double c) {    //superclass constructor employee
	employeeBonusBase = 3000;   //konstant, beh�ver inte skickas till konstruktorn n�r objekten skapas   
	name = a;
	salary = c;

	}
	
	public String getName(){      //getters/setters
		return name;
	}
	
	public void setSalary(double salary){ //getters/setters
	this.salary=salary;
	}
	
	public double getSalary() {  //getters/setters
	return salary;
	}

	
}

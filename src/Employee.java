
public abstract class Employee {   //vi tvingar alla subklasser att implementera en abstralt metod, idf bonusmetod

	private String name;          //private/protected variables 
	private double salary;
	protected final double employeeBonusBase;  //konstant. private kan inte ärvas, protected/public kan ärvas 
	
	abstract public double bonus(); //abstract metod för bonus = vi har ingen default metod för bonus, metoden ser olika ut för varje subklass. Klass måste vara abstract om det finns en abtract metod 
	
	public Employee (String a, double c) {    //superclass constructor employee
	employeeBonusBase = 3000;   //konstant, behöver inte skickas till konstruktorn när objekten skapas   
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

import java.util.ArrayList;

public class EmployeeMain { // vi skapar objekten/vår arraylist i main. I
							// klasser specificecas/skapar mallar. Main är vår
							// spelyta där vi skapar utifrån utifrån
							// informationen i våra klasser
							// när vi kör programmet körs alltid main

	public static void main(String[] args) { //praxis skapa objekten i Main!
		ArrayList<Employee> empl = new ArrayList<>();    
		Technician t1 = new Technician ("Karl", 10000);  //vi skapar objekten
		Receptionist r1 = new Receptionist ("Linda", 10000, 30); //vi skapar objekten
		Programmer p1 = new Programmer ("Mats", 12000); //vi skapar objekten
		empl.add(t1);   //add: metod med vilken vi addar objekten i arraylist (empl.get(1); returnerar receptionistens position i arrayen)
		empl.add(r1);
		empl.add(p1);
		
		double totalBonus = EmployeeMain.sumBonus(empl); 
		System.out.println(totalBonus);
		
	}
		//andra kommandon exempel:  empl.get(1).bonus(); //här hämtar vi position 1 (=receptionist) från arraylist 
		//System.out.println(empl.get(1).bonus()); //här körs hennes bonusmetod
		

		
		public static double sumBonus(ArrayList<Employee> emp){    //metod för att summera bonus, tar parametern arraylist 
		double totalBonus = 0;   //den totala bonusen för alla anställda börjar från noll, inte från bonusbas 3000
		for (Employee currentEmployee : emp){   //i array emp gå igenom varje employee. enhanced for loop: du behöver inte veta längd på array. smidigt. denna loop används för att gå igenom hela arraylist, istället för att manuellt plussa ihop allas bonusar ett och ett
		totalBonus+=currentEmployee.bonus();  // : total bonus=total bonus+ currentEmployee.bonus  //Ett sätt att skriva   X+=5 :  X=X+5
		}
		return totalBonus;
		
		}
	    }



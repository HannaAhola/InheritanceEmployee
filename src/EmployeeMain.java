import java.util.ArrayList;

public class EmployeeMain { // vi skapar objekten/v�r arraylist i main. I
							// klasser specificecas/skapar mallar. Main �r v�r
							// spelyta d�r vi skapar utifr�n utifr�n
							// informationen i v�ra klasser
							// n�r vi k�r programmet k�rs alltid main

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
		//andra kommandon exempel:  empl.get(1).bonus(); //h�r h�mtar vi position 1 (=receptionist) fr�n arraylist 
		//System.out.println(empl.get(1).bonus()); //h�r k�rs hennes bonusmetod
		

		
		public static double sumBonus(ArrayList<Employee> emp){    //metod f�r att summera bonus, tar parametern arraylist 
		double totalBonus = 0;   //den totala bonusen f�r alla anst�llda b�rjar fr�n noll, inte fr�n bonusbas 3000
		for (Employee currentEmployee : emp){   //i array emp g� igenom varje employee. enhanced for loop: du beh�ver inte veta l�ngd p� array. smidigt. denna loop anv�nds f�r att g� igenom hela arraylist, ist�llet f�r att manuellt plussa ihop allas bonusar ett och ett
		totalBonus+=currentEmployee.bonus();  // : total bonus=total bonus+ currentEmployee.bonus  //Ett s�tt att skriva   X+=5 :  X=X+5
		}
		return totalBonus;
		
		}
	    }



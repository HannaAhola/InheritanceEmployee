import java.util.ArrayList;    

public class EmployeeMain {  

	public static void main(String[] args) {  
		ArrayList<Employee> empl = new ArrayList<>();    
		Support t1 = new Support ("Karl", 10000);   
		Admin r1 = new Admin ("Linda", 10000, 30);  
		Development p1 = new Development ("Mats", 12000); / 
		empl.add(t1);   
		empl.add(r1);
		empl.add(p1);
		
		double totalBonus = EmployeeMain.sumBonus(empl); 
		System.out.println(totalBonus);
		

		
		public static double sumBonus(ArrayList<Employee> emp){    //metod för att summera bonus, tar parametern arraylist 
		double totalBonus = 0;   //den totala bonusen för alla anställda börjar från noll, inte från bonusbas 3000
		for (Employee currentEmployee : emp){   //i array emp gå igenom varje employee. enhanced for loop: du behöver inte veta längd på array. smidigt. denna loop används för att gå igenom hela arraylist, istället för att manuellt plussa ihop allas bonusar ett och ett
		totalBonus+=currentEmployee.bonus();  // : total bonus=total bonus+ currentEmployee.bonus  //Ett sätt att skriva   X+=5 :  X=X+5
		}
		return totalBonus;
		
		}
	    }



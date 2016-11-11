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
		

		
		public static double sumBonus(ArrayList<Employee> emp){    //metod f�r att summera bonus, tar parametern arraylist 
		double totalBonus = 0;   //den totala bonusen f�r alla anst�llda b�rjar fr�n noll, inte fr�n bonusbas 3000
		for (Employee currentEmployee : emp){   //i array emp g� igenom varje employee. enhanced for loop: du beh�ver inte veta l�ngd p� array. smidigt. denna loop anv�nds f�r att g� igenom hela arraylist, ist�llet f�r att manuellt plussa ihop allas bonusar ett och ett
		totalBonus+=currentEmployee.bonus();  // : total bonus=total bonus+ currentEmployee.bonus  //Ett s�tt att skriva   X+=5 :  X=X+5
		}
		return totalBonus;
		
		}
	    }



/*
 * INHERITANCE, EMPLOYEE
 * Main class
 * Lexicon Liljeholmen, Java4Women, 2016-11-11
 * Group 2, Nina, Hanna, Bruna 
 */


import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeMain { // vi skapar objekten/v�r arraylist i main. I
	// klasser specificecas/skapar mallar. Main �r v�r
	// spelyta d�r vi skapar utifr�n utifr�n
	// informationen i v�ra klasser
	// n�r vi k�r programmet k�rs alltid main
	static Scanner sc = new Scanner (System.in);
	static int choice = -1;


	public static void main(String[] args) {
		//Company myCompany = new Company();
		ArrayList <Employee> myEmployees = new ArrayList <>();
		Admin a1 = new Admin ("Lars Jansson", 25000, "Administrator", 1964010111, Employee.Gender.MALE);
		Support s1 = new Support ("Sara Issacs", 22000, "Support", 1995020222, Employee.Gender.FEMALE);
		Development d1 = new Development ("Johann Strauss", 34000, "Development", 1985030333, Employee.Gender.MALE);
		Admin a2 = new Admin ("Anna Idunno", 25000, "Administrator", 1986040444, Employee.Gender.FEMALE);
		Support s2 = new Support ("John Doe", 22000, "Support", 1977050555, Employee.Gender.MALE);
		Development d2 = new Development ("Clara Croft", 35000, "Development", 1985030333, Employee.Gender.FEMALE);
		Admin a3 = new Admin ("Joakim Lilsson", 26000, "Administrator", 1964010111, Employee.Gender.MALE);
		Support s3 = new Support ("James Spader", 22000, "Support", 1995020222, Employee.Gender.MALE);
		Development d3 = new Development ("Alice Johansson", 30000, "Development", 1985030333, Employee.Gender.FEMALE);
		Admin a4 = new Admin ("Michael Berglund", 28000, "Administrator", 1964010111, Employee.Gender.MALE);
		Support s4 = new Support ("Isabelle Clarke", 22000, "Support", 1995020222, Employee.Gender.FEMALE);
		Development d4 = new Development ("Elsa Lind", 33000, "Development", 1985030333, Employee.Gender.FEMALE);
		Admin a5 = new Admin ("Karl Wallin", 21000, "Admin", 1966060666, Employee.Gender.MALE);
		Support s5 = new Support ("Lucas Jonsson", 23000, "Support", 1977070777, Employee.Gender.MALE);
		Development d5 = new Development("Ludvig Norin", 35000, "Development", 1976060767, Employee.Gender.MALE);
		Admin a6 = new Admin ("Stella Holm", 26000, "Admin", 1999090999, Employee.Gender.FEMALE);
		Support s6 = new Support ("Charlie Ek", 23000, "Support", 1985050858, Employee.Gender.MALE);
		Development d6 = new Development("Erik Lundgren", 32000, "Development", 1955050555, Employee.Gender.MALE);
		Support s7 = new Support ("Ella Berg", 21000, "Support", 1987070887, Employee.Gender.FEMALE);
		Development d7 = new Development("Oscar Blom", 38000, "Development", 1962060226, Employee.Gender.MALE);
		

		myEmployees.add(a1); myEmployees.add(s1); myEmployees.add(d1); myEmployees.add(a2); 
		myEmployees.add(s2); myEmployees.add(d2); myEmployees.add(a3); myEmployees.add(s3); 
		myEmployees.add(d3); myEmployees.add(a4); myEmployees.add(s4); myEmployees.add(d4); 
		myEmployees.add(a5); myEmployees.add(s5); myEmployees.add(d5); myEmployees.add(a6); 
		myEmployees.add(s6); myEmployees.add(d6); myEmployees.add(s7); myEmployees.add(d7); 
		//int choice = -1;
		//myCompany.seedEmployees(myEmployees);


		while (choice != 0) {		
			EmployeeMain.mainMenu();
			choice = sc.nextInt();

			if (choice == 1) {
				EmployeeMain.employeeManagementMenu();
				choice = sc.nextInt();			
			}
			else if (choice == 2) {
				EmployeeMain.employeeStatisticMenu();
				choice = sc.nextInt();
			}
			else {
				System.out.print("Illegal choice!\n\n");
				EmployeeMain.mainMenu();
				choice = sc.nextInt();
			}
		} // slut p� while

		if (choice == 0) {
			sc.close();
		}
	}	




	private static void mainMenu() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Welcome to our company");
		//System.out.println("\nChoose");
		System.out.println("--------------------------------------------------------");
		System.out.println("1. Employee management");
		System.out.println("2. Employee statistics");
		System.out.println("0. Exit");
		System.out.println("Choose: ");
	}

	private static void employeeManagementMenu() {
		System.out.println("\nV�lj fr�n meny");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Registera anst�lld");
		System.out.println("2. Radera anst�lld");
		System.out.println("3. Uppdatera anst�lld");
		System.out.println("4. Visa information om anst�lld");
		System.out.println("5. Lista samtliga anst�llda");
		System.out.println("6. Lista samtliga tekniker");
		System.out.println("7. Lista samtliga receptionister");
		System.out.println("8. Lista samtliga programmerare");
		System.out.println("9. �terg� till huvudmeny");
		System.out.println("0. Exit");
		System.out.println("Choose: ");
		
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:  
			//EmployeeMain.addEmployeeMenu();
			break;

		case 2:
			//EmployeeMain.addEmployeeMenu();
			break;

		case 3:  
			//EmployeeMain.addEmployeeMenu();
			break;

		case 4:  
			//EmployeeMain.addEmployeeMenu();
			break;

		default:
			break;
		}

	}
	
	

	private static void employeeStatisticMenu() {
		System.out.println("\nV�lj fr�n meny");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Medell�n p� f�retaget");
		System.out.println("2. H�gsta l�n p� f�retaget");
		System.out.println("3. L�gsta l�n p� f�retaget");
		System.out.println("4. Total bonus p� f�retaget");
		System.out.println("5. Kvinnor i procent p� f�retaget");
		System.out.println("6. M�n i procent i de olika arbetsrollerna");
		System.out.println("7. �terg� till huvudmeny");
		System.out.println("0. Exit");
		System.out.println("Choose: ");
		
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:  
			//EmployeeMain.addEmployeeMenu();
			break;

		case 2:
			//EmployeeMain.addEmployeeMenu();
			break;

		case 3:  
			//EmployeeMain.addEmployeeMenu();
			break;

		case 0:  
			break;

		default:
			break;
		}
	}
	
	

//	private static void addEmployeeMenu() {
//		System.out.println("\nVilka uppgifter vill du uppdatera");
//		System.out.println("------------------------------------------------------");
//		System.out.println("1. Namn");
//		System.out.println("2. �lder");
//		System.out.println("3. L�n");
//		//System.out.println("4. �terg� till meny");
//		System.out.println("0. Exit");
//		System.out.println("Choose: ");
//	}


	//skapar flera objekt av typen anst�llda
	//	private void seedEmployees(ArrayList<Employee> employees) {
	//		employees.add(new Technician());
	//		employees.add(new Technician());
	//		employees.add(new Technician());
	//		employees.add(new Technician());
	//		employees.add(new Receptionist());
	//		employees.add(new Receptionist());
	//		employees.add(new Receptionist());
	//		employees.add(new Receptionist());
	//		employees.add(new Programmer());
	//		employees.add(new Programmer());
	//		employees.add(new Programmer());
	//		employees.add(new Programmer());
	//	}






	/************************     Hannas kod  b�rjar h�r    *******************************************************************/
	public static double sumBonus(ArrayList<Employee> emp){    //metod f�r att summera bonus, tar parametern arraylist 
		double totalBonus = 0;   //den totala bonusen f�r alla anst�llda b�rjar fr�n noll, inte fr�n bonusbas 3000
		for (Employee currentEmployee : emp){   //i array emp g� igenom varje employee. enhanced for loop: du beh�ver inte veta l�ngd p� array. smidigt. denna loop anv�nds f�r att g� igenom hela arraylist, ist�llet f�r att manuellt plussa ihop allas bonusar ett och ett
			totalBonus+=currentEmployee.bonus();  // : total bonus=total bonus+ currentEmployee.bonus  //Ett s�tt att skriva   X+=5 :  X=X+5
		}
		return totalBonus;
	}
	/************************     slut p� Hannas kod       *******************************************************************/
}






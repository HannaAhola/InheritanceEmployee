/*
 * INHERITANCE, EMPLOYEE
 * Main class
 * Lexicon Liljeholmen, Java4Women, 2016-11-11
 * Group 2, Nina, Hanna, Bruna 
 */


import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeMain { // vi skapar objekten/vår arraylist i main. I
	// klasser specificecas/skapar mallar. Main är vår
	// spelyta där vi skapar utifrån utifrån
	// informationen i våra klasser
	// när vi kör programmet körs alltid main
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
		} // slut på while

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
		System.out.println("\nVälj från meny");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Registera anställd");
		System.out.println("2. Radera anställd");
		System.out.println("3. Uppdatera anställd");
		System.out.println("4. Visa information om anställd");
		System.out.println("5. Lista samtliga anställda");
		System.out.println("6. Lista samtliga tekniker");
		System.out.println("7. Lista samtliga receptionister");
		System.out.println("8. Lista samtliga programmerare");
		System.out.println("9. Återgå till huvudmeny");
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
		System.out.println("\nVälj från meny");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Medellön på företaget");
		System.out.println("2. Högsta lön på företaget");
		System.out.println("3. Lägsta lön på företaget");
		System.out.println("4. Total bonus på företaget");
		System.out.println("5. Kvinnor i procent på företaget");
		System.out.println("6. Män i procent i de olika arbetsrollerna");
		System.out.println("7. Återgå till huvudmeny");
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
//		System.out.println("2. Ålder");
//		System.out.println("3. Lön");
//		//System.out.println("4. Återgå till meny");
//		System.out.println("0. Exit");
//		System.out.println("Choose: ");
//	}


	//skapar flera objekt av typen anställda
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






	/************************     Hannas kod  börjar här    *******************************************************************/
	public static double sumBonus(ArrayList<Employee> emp){    //metod för att summera bonus, tar parametern arraylist 
		double totalBonus = 0;   //den totala bonusen för alla anställda börjar från noll, inte från bonusbas 3000
		for (Employee currentEmployee : emp){   //i array emp gå igenom varje employee. enhanced for loop: du behöver inte veta längd på array. smidigt. denna loop används för att gå igenom hela arraylist, istället för att manuellt plussa ihop allas bonusar ett och ett
			totalBonus+=currentEmployee.bonus();  // : total bonus=total bonus+ currentEmployee.bonus  //Ett sätt att skriva   X+=5 :  X=X+5
		}
		return totalBonus;
	}
	/************************     slut på Hannas kod       *******************************************************************/
}






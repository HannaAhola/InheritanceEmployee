/*
 * INHERITANCE, EMPLOYEE
 * Main class
 * Lexicon Liljeholmen, Java4Women, 2016-11-14
 * Group 2, Nina, Hanna, Bruna 
 */


import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeMain { 
	static Scanner sc = new Scanner (System.in);
	static int choice = -1;
	static ArrayList<Employee> myEmployees = new ArrayList<Employee>();
	static ArrayList<Employee> formerEmployees = new ArrayList<Employee>();

	
	public static void main(String[] args) {

		seedEmployees(); //seed the ArrayList with Employees
		formerEmployees(); 
		
		while (choice != 0) {		
			EmployeeMain.mainMenu();

			try {
				choice = sc.nextInt();
			}
			catch (Exception exception) {
				choice = -1;
			}

			if (choice == 1) {
				EmployeeManagement.employeeMenu();
				choice = 0;
			}
			else if (choice == 2) {
				EmployeeStatistics.employeeStatisticsMenu();
				choice = 0;
			}
			else if (choice == 0) {
				sc.close();
			}
			else {
				System.out.print("Illegal choice!\n\n");
				sc.nextLine(); //clear buffer
			}
		}
	}	



	/*******************************      METHODS      ***************************************************/

	private static void mainMenu() {
		System.out.println(" ***************************************** ");
		System.out.println(" **                                     ** ");
		System.out.println(" **     Welcome to NHB Software AB      ** ");
		System.out.println(" **                                     ** ");
		System.out.println(" ***************************************** ");
		System.out.println("1. Employee management");
		System.out.println("2. Employee statistics");
		System.out.println("0. Exit");
		System.out.println("Choose: ");
	}


	private static void seedEmployees() {
		Admin a1 = new Admin ("Lars Jansson", 25000, "Admin", 1964010111, Gender.MALE);
		Support s1 = new Support ("Sara Issacs", 22000, "Support", 1995020222, Gender.FEMALE);
		Development d1 = new Development ("Johann Strauss", 34000, "Development", 1985030333, Gender.MALE);
		Admin a2 = new Admin ("Anna Idunno", 25000, "Admin", 1986040444, Gender.FEMALE);
		Support s2 = new Support ("John Doe", 22000, "Support", 1977050555, Gender.MALE);
		Development d2 = new Development ("Clara Croft", 35000, "Development", 1985030333, Gender.FEMALE);
		Admin a3 = new Admin ("Joakim Lilsson", 26000, "Admin", 1964010111, Gender.MALE);
		Support s3 = new Support ("James Spader", 22000, "Support", 1995020222, Gender.MALE);
		Development d3 = new Development ("Åsa Johansson", 30000, "Development", 1985030333, Gender.FEMALE);
		Admin a4 = new Admin ("Michael Berg", 28000, "Admin", 1964010111, Gender.MALE);
		Support s4 = new Support ("Bella Clarke", 22000, "Support", 1995020222, Gender.FEMALE);
		Development d4 = new Development ("Elsa Lind", 33000, "Development", 1985030333, Gender.FEMALE);
		Admin a5 = new Admin ("Karl Wallin", 21000, "Admin", 1966060666, Gender.MALE);
		Support s5 = new Support ("Lucas Jonsson", 23000, "Support", 1977070777, Gender.MALE);
		Development d5 = new Development("Ludvig Norin", 35000, "Development", 1976060767, Gender.MALE);
		Admin a6 = new Admin ("Stella Holm", 26000, "Admin", 1999090999, Gender.FEMALE);
		Support s6 = new Support ("Stephan Carlos", 23000, "Support", 1985050858, Gender.MALE);
		Development d6 = new Development("Erik Lundgren", 32000, "Development", 1955050555, Gender.MALE);
		Support s7 = new Support ("Ella Berg", 21000, "Support", 1987070887, Gender.FEMALE);
		Development d7 = new Development("Oscar Blom", 38000, "Development", 1962060226, Gender.MALE);


		myEmployees.add(a1); myEmployees.add(s1); myEmployees.add(d1); myEmployees.add(a2); 
		myEmployees.add(s2); myEmployees.add(d2); myEmployees.add(a3); myEmployees.add(s3); 
		myEmployees.add(d3); myEmployees.add(a4); myEmployees.add(s4); myEmployees.add(d4); 
		myEmployees.add(a5); myEmployees.add(s5); myEmployees.add(d5); myEmployees.add(a6); 
		myEmployees.add(s6); myEmployees.add(d6); myEmployees.add(s7); myEmployees.add(d7); 
	}
	
	private static void formerEmployees() {
		Admin a1 = new Admin("Charlie Ek", 23000, "Admin", 1988010111, Gender.MALE);
		Support s1 = new Support("Hazim Sekic", 22000, "Support", 1986080612, Gender.MALE);
		
		EmployeeMain.formerEmployees.add(a1); EmployeeMain.formerEmployees.add(s1);
		
	}

}




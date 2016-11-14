import java.util.Scanner;

public class EmployeeStatistics extends Employee {

	static Scanner sc = new Scanner(System.in);	
	
	public EmployeeStatistics(String name, double salary, int idNumber, String department, Gender gender) {
		super(name, salary, idNumber, department, gender);
	}
	
	public static void employeeStatisticsMenu() {
		
		System.out.println("\nChoose from Menu");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Average salary in company");
		System.out.println("2. Highest salary in company");
		System.out.println("3. Lowest salary in company");
		System.out.println("4. Total bonus in company");
		System.out.println("5. Percentage of women in company");
		System.out.println("6. Number of men employed in various departments");
		System.out.println("7. Return to main menu");
		System.out.println("8. Calculate again");
		System.out.println("0. Exit");
		System.out.println("Choose: ");
		
		int x = sc.nextInt();
		
		switch (x) {
		case 1: averageSalary();
			break;
		case 2: highestSalary();
			break;
		case 3: lowestSalary();
			break;
		case 4: System.out.println("There is no bonus you greedy people.");
			break;
		case 5: womenPercentage();
			break;
		case 6: menPercentage();
			break;
		case 7:	//exits to main menu
			break;
		case 0: System.out.println("Thank you for using the program. Goodbye");
			break;
		default: System.out.println("Sorry, wrong input.");
				}
		}

	
	@Override
	public double bonus() {
		return 0;
	}
	
	
	
	public static void averageSalary() {
		int totalSalary = 0;
		for (Employee e: EmployeeMain.myEmployees) {
			totalSalary += e.getSalary();
		}
		System.out.println("The average salary is: " + totalSalary/EmployeeMain.myEmployees.size());
	}
	
	
	public static void highestSalary() {
		double highestSalary = 0;
		for (Employee e: EmployeeMain.myEmployees) {
			if(e.getSalary() > highestSalary) {
				highestSalary = e.getSalary();
			}
		}
		System.out.println("The highest salary is: " + highestSalary);
	}
	
	public static void lowestSalary() {
		double lowestSalary = EmployeeMain.myEmployees.get(0).getSalary();
		for (Employee e : EmployeeMain.myEmployees) {
			if(lowestSalary > e.getSalary()) {
				lowestSalary = e.getSalary();
			}
		}
		System.out.println("The lowest salary is: " + lowestSalary);
	}
	
	
	public static void womenPercentage() {
		int womenCount = 0;
		for(Employee e: EmployeeMain.myEmployees) {
			if (e.gender == Gender.FEMALE) {
				womenCount++;
			}
		}
		System.out.println("The % of women in the company is: " + 100.00 * womenCount/EmployeeMain.myEmployees.size() + "%");
		System.out.println("The number of women working in the company: " + womenCount);
	}
	
	public static void menPercentage(){
		int adminCount = 0;
		int developmentCount = 0;
		int supportCount = 0;
		for(Employee e: EmployeeMain.myEmployees) {
			if(e.gender == Gender.MALE && e.department.equals("Admin")) {
				adminCount++;
			}
			else if (e.gender == Gender.MALE && e.department.equals("Development")) {
				developmentCount++;
			}
			else if (e.gender == Gender.MALE && e.department.equals("Support")) {
				supportCount++;
			}
		}
		System.out.println("The number of men working in Admin: " + adminCount);
		System.out.println("The number of men working in Development: " + developmentCount);
		System.out.println("The number of men working in Support: " + supportCount);
	}
}

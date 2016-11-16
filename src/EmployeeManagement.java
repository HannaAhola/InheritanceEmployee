

public class EmployeeManagement {

	public static void RegisterEmployee() {

		System.out.println("Enter name");
		String name = EmployeeMain.sc.nextLine(); // empty cash									 
		System.out.println("Enter salary");
		double sal = EmployeeMain.sc.nextDouble(); // returns the value to sal 
		System.out.println("Enter id number (YYYYMMDDNN)");
		int id = EmployeeMain.sc.nextInt();

		System.out.println("Enter department, 1:Development, 2:Admin, 3:Support");
		int dep = EmployeeMain.sc.nextInt();

		System.out.println("Enter gender: 1:Female, 2:Male");
		int gender = EmployeeMain.sc.nextInt();

		Gender gen = Gender.FEMALE;

		switch (gender) {
		case 1:
			gen = Gender.FEMALE;

		case 2:
			gen = Gender.MALE;

		}


		switch (dep) {
		case 1:   
			EmployeeMain.myEmployees.add (new Development(name, sal, "Developer", id, gen));
			break;
		case 2:	  
			EmployeeMain.myEmployees.add (new Admin(name, sal, "Admin", id, gen));
			break;
		case 3:	  
			EmployeeMain.myEmployees.add (new Support(name, sal, "Support", id, gen));
			break;
		default: 

		}



		System.out.println("The employee named " + name +" is now registered");

		for (Employee e : EmployeeMain.myEmployees) {
			//System.out.println(e.getStaffNumber() + " " + e.getName());
			System.out.println(e.toString());
		}


	}

	public static void UpdateEmployee() { // choice: name, salary, department

		int staffNumber = -1;
		for (Employee e : EmployeeMain.myEmployees) {
			System.out.println(e.toString());
		}
		while (staffNumber != 0) {

			System.out.println("\nSelect which employee to update: ");

			staffNumber = EmployeeMain.sc.nextInt();

			if (staffNumber != -1) {
				for (Employee e : EmployeeMain.myEmployees) {

					if (e.getStaffNumber() == staffNumber) {

						System.out.println("\nWhat do you want to update? 1:Name, 2:Salary. 3:Department: ");
						int x = EmployeeMain.sc.nextInt();
						EmployeeMain.sc.nextLine();

						switch (x) {
						case 1: {
							System.out.println("\nPlease enter a name");
							String name = EmployeeMain.sc.nextLine();
							e.setName(name);
							System.out.println
									("\nThe employee nr " + e.getStaffNumber() + " " +  e.getName() + " is updated");
						}
						break;
						case 2: {
							System.out.println("Please enter salary");
							int salary = EmployeeMain.sc.nextInt();
							EmployeeMain.sc.nextLine();
							e.setSalary(salary);
							System.out.println
									("\nThe employee nr " + e.getStaffNumber() + " " +  e.getName() + " is updated");
						}
						break;
						case 3: {
							System.out.println("Please enter a department, 1:Development, 2:Admin, 3:Support");
							String department = EmployeeMain.sc.nextLine();
							e.setDepartment(department);
							System.out.println("\nThe employee nr " + e.getStaffNumber() + " " +  e.getName() + " is updated");
						}
						break;
						default:

							System.out.println("Incorrect input");
							staffNumber = 0;

						}

					}

				}

			}
			else {
				System.out.println("Illegal choice");
				EmployeeMain.sc.nextLine();
			}
		}
	}

	public static void RemoveEmployee() {

		int staffNumber = -1;

		while (staffNumber != 0) {
			Employee removed = null;
			for (Employee e : EmployeeMain.myEmployees) {
				System.out.println(e.toString());
			}
			System.out.println("\nSelect which employee to remove (id nr): ");

			try {
				staffNumber = EmployeeMain.sc.nextInt();
			}
			catch (Exception exception) {
				staffNumber = -1;
			}

			if (staffNumber != -1) {
				int counter = 0;

				for (Employee e : EmployeeMain.myEmployees) {
					//om rätt idNumber
					if (e.getStaffNumber() == staffNumber) {
						removed = e;

						//	formerEmployees(counter);
						System.out.println("\nThe employee nr " + e.getStaffNumber() + " " +  e.getName() + " has been removed");
						staffNumber = 0;
						break;
					}
					//räkna upp antal loopar, kollar om inget personnummer stämmer
					else {
						counter++;
					}
					//om idNumber doesn't exist
					if (counter == EmployeeMain.myEmployees.size()) {
						System.out.println("staffNumber doesn't exist");
					}
				}
				formerEmployees(removed);
			}
			else {
				System.out.println("Illegal choice");
				EmployeeMain.sc.nextLine(); //clear buffer
			}
		}
	}	


	public static void employeeMenu() {

		int choice = -1; // choice kan inte vara 0, 0=exit, då kommer vi aldrig
		// in i loopen --> sätt denna till något annat

		while (choice != 0) {
			System.out.println("\n ***************************************");
			System.out.println(" **                                   ** ");
			System.out.println(" **     Employee Management Menu      ** ");
			System.out.println(" **                                   ** ");
			System.out.println(" *************************************** ");
			System.out.println("1. Register employee");
			System.out.println("2. Update employee");
			System.out.println("3. Remove employee");
			System.out.println("4. Back to main menu");
			System.out.println("0. Exit");
			System.out.println("Choose: ");

			try {
				choice = EmployeeMain.sc.nextInt();
			} catch (Exception exception) {
				choice = -1;
			}

			if (choice == 1) {
				EmployeeMain.sc.nextLine();
				RegisterEmployee();
			}
			else if (choice == 2) {
				UpdateEmployee();
			}
			else if (choice == 3) {
				RemoveEmployee();
			}
			else if (choice == 4) {
				EmployeeMain.main(null);
			}
			else if (choice == 0) {
				System.out.println("\nGoodbye! Thank you for using our software");
				break;
			}
			else {
				System.out.print("Illegal choice!\n\n");
				EmployeeMain.sc.nextLine(); // clear buffer
			}

		}

	}

	public static void formerEmployees(Employee removed) {

		EmployeeMain.formerEmployees.add(removed);
		EmployeeMain.myEmployees.remove(removed);
		

	}

}

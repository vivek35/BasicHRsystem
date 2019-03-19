package com.oops.excercise;

import java.util.*;

public class HRservice {

	private static final int ADD_USER = 1;

	public static void main(String args[]) {
		int userChoice;
		do {
			Scanner input = new Scanner(System.in);

			List<Object> cc = new ArrayList<Object>();
			Contractor con;
			Fulltime full;
			Company c = new Company();
			System.out.println("Welcome to HR Service");
			System.out.println("Press 1 to add employee");
			System.out.println("Press 2 to remove employee");
			System.out.println("Press 3 to search employee");
			System.out.println("Press 4 to terminate");
			System.out.println("Enter your choice");
			userChoice = input.nextInt();
			input.nextLine();

			if (userChoice == ADD_USER) {
				int cont = 1;
				int add = 1;
				while (cont == 1) {
					String firstname, lastname, companyName, country, state, city, line1, line2;
					int emp_id, n, number, zip, countrycode, areacode;
					int i = 0;
					int emptype;
					String dateStarts, dateEnds = null;
					float hourlyRate = 0, baseSalary = 0, bonus = 0;

					List<String> emp_data = new ArrayList<String>();

					System.out.println("Please enter employee Id: ");
					emp_id = input.nextInt();
					System.out.println(emp_id);
					input.nextLine();
					System.out.println("Please enter firstName: ");
					firstname = input.nextLine();

					System.out.println(firstname);

					System.out.println("Please enter lastName:");
					lastname = input.nextLine();

					System.out.println(lastname);

					System.out.println("Please enter number of roles employee has in company");
					n = input.nextInt();
					input.nextLine();
					ArrayList<String> roles = new ArrayList(n);

					while (i != n) {
						System.out.println("Please enter role " + (i + 1) + ": ");
						roles.add(input.nextLine());
						i++;
					}

					ListIterator<String> iterator = roles.listIterator();

					// Printing the iterated value

					while (iterator.hasNext()) {
						System.out.println("Roles: " + iterator.next());
					}

					while (i != n) {
						System.out.println("Please enter role " + (i + 1) + ": ");
						roles.add(input.nextLine());
						i++;
					}
					System.out.println("Please enter CompanyName:");
					companyName = input.nextLine();

					System.out.println(companyName);

					System.out.println("Please enter areacode:");
					areacode = input.nextInt();

					System.out.println(areacode);

					System.out.println("Please enter number:");
					number = input.nextInt();

					System.out.println(number);

					System.out.println("Please enter countrycode:");
					countrycode = input.nextInt();

					System.out.println(countrycode);
					System.out.println("Please enter zip:");
					zip = input.nextInt();
					input.nextLine();

					System.out.println(zip);

					System.out.println("Please enter country");
					country = input.nextLine();

					System.out.println(country);

					System.out.println("Please enter state");
					state = input.nextLine();

					System.out.println(state);

					System.out.println("Please enter city");
					city = input.nextLine();

					System.out.println(city);

					System.out.println("Please enter address line1");
					line1 = input.nextLine();

					System.out.println(line1);

					System.out.println("Please enter address line2");
					line2 = input.nextLine();

					System.out.println(line2);

					System.out.println("Please enter 0 if employee is Full time and 1 if emplopyee is on contract");
					emptype = input.nextInt();
					input.nextLine();
					if (emptype == 1) {
						System.out.println("Enter contract employee details");
						System.out.println("Enter date starts: ");
						dateStarts = input.nextLine();
						System.out.println(dateStarts);

						System.out.println("Enter date ends");
						dateEnds = input.nextLine();

						System.out.println(dateEnds);

						System.out.println("Enter hourlyRate");
						hourlyRate = input.nextFloat();

						System.out.println(hourlyRate);
					} else {
						System.out.println("Enter FullTime employee details");
						System.out.println("Enter date starts: ");
						dateStarts = input.nextLine();

						System.out.println(dateStarts);

						System.out.println("Enter Base Salary: ");
						baseSalary = input.nextInt();
						System.out.println(baseSalary);

						System.out.println("Enter Bonus: ");
						bonus = input.nextInt();
						System.out.println(bonus);
					}
					Role r = new Role(roles);
					r.setEmployee(emp_id, firstname, lastname);
					r.setPhone(areacode, number, countrycode);
					r.setAddress(zip, city, state, city, line1, line2);

					if (emptype == 1) {
						con = new Contractor(dateStarts, dateEnds, hourlyRate);
					} else {
						full = new Fulltime(dateStarts, baseSalary, bonus);
					}
					emp_data.add(String.valueOf(emp_id));
					emp_data.add(firstname);
					emp_data.add(lastname);
					emp_data.add(String.valueOf(areacode));
					emp_data.add(String.valueOf(number));
					emp_data.add(String.valueOf(countrycode));
					emp_data.add(String.valueOf(zip));
					emp_data.add(city);
					emp_data.add(state);
					emp_data.add(line1);
					emp_data.add(line2);
					emp_data.add(String.valueOf(emptype));
					emp_data.add(companyName);
					if (emptype == 1) {
						emp_data.add(dateStarts);
						emp_data.add(dateEnds);
						emp_data.add(String.valueOf(hourlyRate));
					} else {
						emp_data.add(dateStarts);
						emp_data.add(String.valueOf(baseSalary));
						emp_data.add(String.valueOf(bonus));
					}
					
					c.setCompany(emp_id, emp_data);
					for (int j = 0; j < emp_data.size(); j++) {
						System.out.println(emp_data.get(j));
					}
					
					for (int j = 0; j < emp_data.size(); j++) {
						System.out.println(emp_data.get(j));
					}
					System.out.println("Do you want to add more employees");
					System.out.println("Press 1 if yes or press 2 if no");
					System.out.println("ENter your choice");
					add = input.nextInt();
					input.nextLine();
					if (add == 1) {
						cont = 1;
					} else {
						cont = 0;
					}
				}

			}
			if (userChoice == 2) {
				System.out.println("Enter ID of the employee");
				int e_id = input.nextInt();
				int success = c.deleteByID(e_id);
			}
			if (userChoice == 3) {
				System.out.println("Press 1 if you want to search by id");
				System.out.println("Press 2 if you want to search by First name");
				System.out.println("Press 2 if you want to search by Last name");
				System.out.println("Enter your choice");
				int choice = Integer.parseInt(input.nextLine());
				if (choice == 1) {
					System.out.println("Enter ID of the employee");
					int EID = input.nextInt();
					List<String> id_data = c.searchByID(EID);
					System.out.println("Data: " + id_data);
					if (id_data == null || id_data.contains(null)) {
						System.out.println("No employee found…please modify search parameters");
					} else {

						System.out.println("EMployee ID: " + id_data.get(0));
						System.out.println("FirstName: " + id_data.get(1));
						System.out.println("LastName: " + id_data.get(2));
						System.out.println("Contact:" + id_data.get(3) + id_data.get(4) + id_data.get(5));
						System.out.println(" ZIP: " + id_data.get(6));
						System.out.println(" City:" + id_data.get(7));
						System.out.println(" STATE: " + id_data.get(8));
						System.out.println("Address: " + id_data.get(9) + id_data.get(10));

						int tp = Integer.parseInt(id_data.get(11));
						if (tp == 1) {
							System.out.println("Employee Type: Contract");
							System.out.println("Employee Start Date : " + id_data.get(12));
							System.out.println("Employee Start Ends : " + id_data.get(13));
							System.out.println("Employee Hourly Rate : " + id_data.get(14));
						} else {
							System.out.println("Employee Type: Fulltime");
							System.out.println("Employee Start Date : " + id_data.get(12));
							System.out.println("Employee BaseSalary : " + id_data.get(13));
							System.out.println("Employee Bonus : " + id_data.get(14));
						}
					}
				} else if (choice == 2) {
					System.out.println("Enter first name of the employee");
					String ename = input.nextLine();
					ArrayList<String> fetched_data = c.searchByFirstName(ename);
					if (fetched_data.isEmpty()) {
						System.out.println("No employee found…please modify search parameters");
					} else {

						System.out.println("EMployee ID: " + fetched_data.get(0));
						System.out.println("FirstName: " + fetched_data.get(1));
						System.out.println("LastName: " + fetched_data.get(2));
						System.out
								.println("Contact:" + fetched_data.get(3) + fetched_data.get(4) + fetched_data.get(5));
						System.out.println(" ZIP: " + fetched_data.get(6));
						System.out.println(" City:" + fetched_data.get(7));
						System.out.println(" STATE: " + fetched_data.get(8));
						System.out.println("Address: " + fetched_data.get(9) + fetched_data.get(10));

						int tp = Integer.parseInt(fetched_data.get(11));
						if (tp == 1) {
							System.out.println("Employee Type: Contract");
							System.out.println("Employee Start Date : " + fetched_data.get(12));
							System.out.println("Employee Start Ends : " + fetched_data.get(13));
							System.out.println("Employee Hourly Rate : " + fetched_data.get(14));
						} else {
							System.out.println("Employee Type: Fulltime");
							System.out.println("Employee Start Date : " + fetched_data.get(12));
							System.out.println("Employee BaseSalary : " + fetched_data.get(13));
							System.out.println("Employee Bonus : " + fetched_data.get(14));
						}
					}

				} else if (choice == 3) {
					System.out.println("Enter last name of the employee");
					String lname = input.nextLine();
					System.out.println("Lastname: " + lname);
					ArrayList<String> fetched_ldata = c.searchByLastName(lname);
					if (fetched_ldata.isEmpty()) {
						System.out.println("No employee found…please modify search parameters");
					} else {

						System.out.println("EMployee ID: " + fetched_ldata.get(0));
						System.out.println("FirstName: " + fetched_ldata.get(1));
						System.out.println("LastName: " + fetched_ldata.get(2));
						System.out.println(
								"Contact:" + fetched_ldata.get(3) + fetched_ldata.get(4) + fetched_ldata.get(5));
						System.out.println(" ZIP: " + fetched_ldata.get(6));
						System.out.println(" City:" + fetched_ldata.get(7));
						System.out.println(" STATE: " + fetched_ldata.get(8));
						System.out.println("Address: " + fetched_ldata.get(9) + fetched_ldata.get(10));

						int tp = Integer.parseInt(fetched_ldata.get(11));
						if (tp == 1) {
							System.out.println("Employee Type: Contract");
							System.out.println("Employee Start Date : " + fetched_ldata.get(12));
							System.out.println("Employee Start Ends : " + fetched_ldata.get(13));
							System.out.println("Employee Hourly Rate : " + fetched_ldata.get(14));
						} else {
							System.out.println("Employee Type: Fulltime");
							System.out.println("Employee Start Date : " + fetched_ldata.get(12));
							System.out.println("Employee BaseSalary : " + fetched_ldata.get(13));
							System.out.println("Employee Bonus : " + fetched_ldata.get(14));
						}
					}
				}
			}
		} while (userChoice != 4);
		if (userChoice == 4) {
			System.out.println("THank you for using HR Service System.");
		}
	}
}

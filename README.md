##Program for HR System

-A company wants to design an HR system for their employees. Create the following entities
-Employee (int id, String firstName, String lastName)
-Role(int id, String name)
-Company(int id, String name,List<Employee>)
-Phone(int id, String areaCode, String number, String countryCode)
-Address(int id, String zip, String country, String state, String city, String line1, String line2)
-Contractor(DateTime start, DateTime end, Float hourlyRate)
-FullTime(DateTime start, Float baseSalaryPerYear, Float bonusPerYear)
- HRService - addEmployee, removeEmployee, searchEmployee

Note:
-An employee can have a max of one phone (Has-A relationship)
- An employee can have a max of one address
- A company have many employees
- An employee can have many roles
- An employee can be of two types - Contractor and Fulltime. (IS-A relationship)

2) Write a class called HRService which does the following: -

A) Add Employee to HR( system) - void addEmployee(Employee e) :

The system takes an input from the system (use Scanner class to read from console) and the user types in all relevant information needed to create an employee object(including Role, Address, Phone, etc) and create a new Employee - Company relationship and add it to the HR via the HRService.

B) Remove Employee from HR - int removeEmployee(int id)

C) Search Employee


a. List<Employee> search(String firstName, String lastName)
b. Employee search(int id)
If not employee found then the system should display a message: “No employee found…please modify search parameters”

Note:
- All results should be displayed on console.
- Take all necessary inputs from the user from the console.
- Use Single Responsibility Principle

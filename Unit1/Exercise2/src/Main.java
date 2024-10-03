import java.lang.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Main {
    public static void main(String[] args) {

        Employee employeeOfTheMonth = new Employee("Francisco José", 1975, 12.25f);
        System.out.println(employeeOfTheMonth.showDataOfPerson());
        Manager theBoss = new Manager("Antonio Martínez", 1968, 150f, "Supervisor");
        theBoss.setCrew(employeeOfTheMonth);
        Company myCompany = new Company("MY COMPANY");
        Customer custom1 = new Customer("María Jimenez", 1980, "965102030");
        Customer custom2 = new Customer("Manolo Pérez", 1960, "654789321");
        myCompany.addCustomer(custom1);
        myCompany.addCustomer(custom2);
        myCompany.printCustomers();
    }
}



// Class Person
class Person{
    // Fields - Class Person
    protected String name;
    protected int bornYear;
    protected int age;
    protected Calendar today = new GregorianCalendar();

    // Constructor - Class Person
    Person(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    // Getters and setters - Class Person
    public String getName(){
        return name;
    }

    public void setName(String value){
        name = value;
    }

    public int getAge(){
        age = today.get(Calendar.YEAR) - this.bornYear;
        return age;
    }

    public void setBornYear(int value){
        bornYear = value;
    }

    // Method Show data - Class Person
    public String showDataOfPerson(){
        return "Name: " + this.name + " - Age: " + getAge();
    }

}

class Employee extends Person{ // Employee class inherits from the Person class
    // Field - Class Employee
    private float salary;

    // Constructor - Class Employee
    public Employee(String name, int bornYear, float salary) {
       super(name, bornYear); // Fields inherited from the parent class
        this.salary = salary;
    }

    // Getters and setters - Class Employee
    public float getSalary(){
        return salary;
    }

    public void setSalary(float value){
        salary = value;
    }

    // Overriding method from the parent class
    @Override
    public String showDataOfPerson(){
        return "Name: " + this.name + " - Age: " + getAge() + " - salary: " + this.salary + " €";
    }
}

class Manager extends Employee { // Manager class inherits from the Employee class

    // Field - Class Manager
    private String category;
    private final ArrayList<Employee> Crew = new ArrayList<Employee>(); // IntelliJ IDE says Explicit type argument Employee can be replaced with <>

    // Constructor - Class Manager
    public Manager(String name, int bornYear, float salary, String category) {
        super(name, bornYear, salary);  // Fields inherited from the parent class (Employee)
        this.category = category;
    }

    // Getters and setters - Class Manager
    public String getCategory(){
        return category;
    }

    public void setCategory(String value){
        category = value;
    }

    public ArrayList<Employee> getCrew(){
        return Crew;
    }

    // Methods - Class Manager
    public void setCrew(Employee value){
        Crew.add(value);
        System.out.println("Now, " + value.name + " are in " + category + " " + this.name + "'s staff.");
    }
}

class Customer extends Person {
        // Fields - Class Customer
        private String phoneNumber;
        public Customer(String name, int bornYear, String phoneNumber) {
            super(name, bornYear);
            this.phoneNumber = phoneNumber;
        }

        // Getters and setters - Class Customer
        public String getPhoneNumber(){
            return phoneNumber;
        }
        private void setPhoneNumber(String value){
            phoneNumber = value;
        }

        // Method - Class Customer
        @Override
        public String showDataOfPerson(){ // Overriding method from the parent class
            return "Name: " + this.name + " - Age: " + getAge() + " - phone number: " + phoneNumber;
        }
}

    class Company{
        // Field - Class Company
        private String nameCompany;
        private final ArrayList<Customer> customers = new ArrayList<>();

        // Constructor - Class Company
        public Company(String nameCompany){
            this.nameCompany = nameCompany;
        }

        // Getters and setters - Class Company
        public String getNameCompany(){
            return nameCompany;
        }

        public void setNameCompany(String value){
            nameCompany = value;
        }

        public ArrayList<Customer> getCustomers(){
            return customers;
        }

        // Methods - Class Company
        public void addCustomer(Customer value){
            customers.add(value);
        }

        public void printCustomers(){
            System.out.println("Our customers:");
            customers.forEach(customer -> System.out.println(customer.name));
        }
    }
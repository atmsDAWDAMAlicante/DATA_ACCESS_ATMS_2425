import java.lang.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Employee employeeOfTheMonth = new Employee("Francisco José", 1975, 12.25f);
        System.out.println(employeeOfTheMonth.showDataOfPerson());



    }

}

// Class Person
class Person{
    protected String name;
    protected int bornYear;
    protected int age;
    protected Calendar today = new GregorianCalendar();

    // Constructor
    Person(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }


    // Getters and setters
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

    // Method Show data
    public String showDataOfPerson(){
        return "Name: " + this.name + " - Age: " + getAge();
    }

}

class Employee extends Person{
    private float salary;

    public Employee(String name, int bornYear, float salary) {
       super(name, bornYear);
        this.salary = salary;
    }
    @Override
    public String showDataOfPerson(){
        return "Name: " + this.name + " - Age: " + getAge() + " - salary: " + this.salary;
    }
}




class Executive extends Employee {
    private String category;
    public Executive(String name, int bornYear, float salary, String category) {
        super(name, bornYear, salary);  // Llamada al constructor de Employee
        this.category = category;
    }
}

class Customer{

}

    class Company{
        public ArrayList<Customer> customers = new ArrayList<>();


    }
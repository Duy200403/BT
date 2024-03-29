package BT;

public class Employee {
    public int id;
    public  String firstName;
    public String lastName ;
    public int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public  String getName (){
        return firstName + " " + lastName;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        double increaseAmount = salary * ((double) percent / 100.0);
        int newSalary = (int) (salary + increaseAmount);
        setSalary(newSalary);
        return newSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

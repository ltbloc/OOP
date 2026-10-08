package Bai1_4;

public class Employee {
    private int id;
    private  String firstname;
    private  String lastname;
    private  int salary;
    private String name;
    private int annualSalary;
    public int raiseSalary;

    public Employee(int id, String firstname, String lastname, int salary , String name) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.name = name;
        this.annualSalary = annualSalary;
    }
    public int getId() { return id;}
    public void setId(int id) {this.id = id;}
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public int getSalary() {return salary;}
    public void setSalary(int salary) {this.salary = salary;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAnnualSalary() {return salary * 12;}
    public void setAnnualSalary(int annualSalary) {this.annualSalary = annualSalary;}

    public String toString() {
        return "Bai1_4.Employee[id =" + id + ",name=" + getName() +",salary =" + salary +"]";}
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return  salary;
    }


    }

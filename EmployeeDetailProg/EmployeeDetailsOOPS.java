/*Write a program that would print the information 
(name, year of joining, salary, address) of three employees
by creating a class named 'Employee'. 
The output should be as follows:
*/


class EmployeeDetailsOOPS{
  private String name;
  private String address;
  private int year;
  private int salary;
  public EmployeeDetailsOOPS(String n, int y, int sal, String add){
    this.name = n;
    this.year = y;
    this.salary = sal;
    this.address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }
}

/* This part of code is in the Employee.java file
class Employee{
  public static void main(String[] args){
    EmployeeDetailsOOPS e1 = new EmployeeDetailsOOPS("Robert", 1994, 500000, "64C- WallsStreet");
    EmployeeDetailsOOPS e2 = new EmployeeDetailsOOPS("Sam", 2000, 740000, "68d- WallsStreet");
    EmployeeDetailsOOPS e3 = new EmployeeDetailsOOPS("John", 1999, 600000, "26B- WallsStreet");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());  // printing details of employee 1
    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());  // printing details of employee 2
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());  // printing details of employee 3
  }
}  
*/
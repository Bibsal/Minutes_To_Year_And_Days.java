class Employee{
  public static void main(String[] args){
    EmployeeDetailsOOPS e1 = new EmployeeDetailsOOPS("Bishal", 1999, 500000, "Bangalore,India");
    EmployeeDetailsOOPS e2 = new EmployeeDetailsOOPS("Bibek", 2000, 740000, "Chennai,India");
    EmployeeDetailsOOPS e3 = new EmployeeDetailsOOPS("SirAadhar", 1994, 900000, "New-Delhi,India");
    System.out.println("Name\tYear of joining\t\t\tSalary\t  Address");
    System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());  // printing details of employee 1
    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());  // printing details of employee 2
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());  // printing details of employee 3
  }
}
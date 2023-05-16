import java.util.HashSet;
import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private int salary;
    private String dep;
    public Employee(int id,String name,int salary,String dep){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dep=dep;
    }
    public void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Department: " + dep);
        System.out.println();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
public class Assignment5Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Employee> empSet = new HashSet<>();
        System.out.println("Enter the no of employees whose details are to be added: ");
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("Enter the Employee Id: ");
            int empId=sc.nextInt();
            System.out.println("Enter the Employee Name: ");
            String empName=sc.next();
            sc.nextLine();
            System.out.println("Enter the Employee Salary: ");
            int empSalary= sc.nextInt();
            System.out.println("Enter the Employee Department: ");
            String empDep=sc.next();
            sc.nextLine();
            Employee empObj=new Employee(empId,empName,empSalary,empDep);
            empSet.add(empObj);
        }

//        boolean added = empSet.add((Employee) new Object());
//        System.out.println("Object added: " + added);

        System.out.println("Employee Details are displayed here");
        for (Employee emp : empSet) {
            emp.displayDetails();
        }

    }
}

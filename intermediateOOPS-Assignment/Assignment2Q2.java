import java.util.ArrayList;
import java.util.Scanner;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}
public class Assignment2Q2 {

    public int getSalary(int salary){
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int sum=0;
        for (int element:employeeSalaries) {
            sum+=element;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = 10000;
        Assignment2Q2 obj = new Assignment2Q2();
        Manager managerObj = new Manager();
        Labour labourObj = new Labour();
        ArrayList<Integer> total=new ArrayList<>();
        while (true) {
            System.out.println("Enter the employee type(Manager/Labour)");
            System.out.println("1.Manager");
            System.out.println("2.Labour");
            System.out.println("3.Calculate total salaries of all the employees");
            System.out.println("4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int result1 = managerObj.getSalary(obj.getSalary(salary));
                    total.add(result1);
                    break;
                case 2:
                    int result2 = labourObj.getSalary(obj.getSalary(salary));
                    total.add(result2);
                    break;
                case 3:
                   int calculatedTotal=obj.totalEmployeesSalary(total);
                    System.out.println("total empolyees salary is: "+calculatedTotal);
                    break;
                case 4:
                    return;
            }
        }
    }
}
//import java.util.ArrayList;
//
//class Employee {
//    int salary;
//
//    public Employee() {
//        salary = 10000;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//}

//class Manager extends Employee {
//    int incentive;
//
//    public Manager() {
//        super();
//        incentive = 5000;
//    }
//
//    @Override
//    public int getSalary() {
//        return super.getSalary() + incentive;
//    }
//}
//
//class Labour extends Employee {
//    int overtime;
//
//    public Labour() {
//        super();
//        overtime = 500;
//    }
//
//    @Override
//    public int getSalary() {
//        return super.getSalary() + overtime;
//    }
//}
//
//public class Organization {
//    public static int totalEmployeesSalary(ArrayList<Employee> employees) {
//        int totalSalary = 0;
//
//        for (Employee e : employees) {
//            totalSalary += e.getSalary();
//        }
//
//        return totalSalary;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Employee> employees = new ArrayList<Employee>();
//        employees.add(new Manager());
//        employees.add(new Labour());
//        employees.add(new Manager());
//        employees.add(new Labour());
//
//        int totalSalary = totalEmployeesSalary(employees);
//        System.out.println("Total salary of all employees: " + totalSalary);
//    }
//}

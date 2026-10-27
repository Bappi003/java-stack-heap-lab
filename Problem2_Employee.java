import java.util.Scanner;
 
class Employee {
    // Instance field -> stored inside the Employee object on the HEAP
    int salary;
 
    Employee(int salary) {
        this.salary = salary;
    }
 
    void display(int bonusInput) {
        // Local variable -> lives in display()'s stack frame
        int bonus = bonusInput;
 
        System.out.println();
        System.out.println("Inside display() Method:");
        System.out.println("Salary (Instance Variable): " + salary);
        System.out.println("Bonus (Local Variable): " + bonus);
 
        // Local inner class declared inside the method
        class Report {
            // show() runs in its own method frame on the STACK
            void show() {
                System.out.println("Report: Employee salary is " + salary);
            }
        }
 
        // Report object -> HEAP
        Report report = new Report();
        System.out.println();
        System.out.println("Report Object Created");
        System.out.println("Report Identity Hash Code: " + System.identityHashCode(report));
        report.show();
    }
}
 
public class Problem2_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter bonus: ");
        int bonus = sc.nextInt();
 
        // Employee object -> HEAP; 'emp' reference -> STACK (main's frame)
        Employee emp = new Employee(salary);
        System.out.println();
        System.out.println("Employee Object Created");
        System.out.println("Employee Identity Hash Code: " + System.identityHashCode(emp));
 
        emp.display(bonus);
 
        System.out.println();
        System.out.println("Memory Concept:");
        System.out.println("Employee object -> Heap");
        System.out.println("Report object -> Heap");
        System.out.println("salary -> Instance field");
        System.out.println("bonus -> Local variable in display()");
        System.out.println("show() -> Executes in its own method frame");
 
        sc.close();
    }
}

/ Problem 1: Demonstrate Stack and Heap Memory in Java
 
class Student {
    // Instance variable -> stored inside the Student object on the HEAP
    int age;
 
    Student(int age) {
        this.age = age;
    }
 
    void display() {
        // Local variable -> stored in this method's frame on the STACK
        int marks = 85;
 
        System.out.println("Student Object Created");
        System.out.println("Object Identity Hash Code: " + System.identityHashCode(this));
        System.out.println("Instance Variable (age): " + age);
        System.out.println("Local Variable (marks): " + marks);
    }
}
 
public class Problem1_Student {
    public static void main(String[] args) {
        // 's' (the reference) lives on the STACK, the Student object lives on the HEAP
        Student s = new Student(20);
        s.display();
    }
}

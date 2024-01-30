import java.util.Scanner;

public class Student {
    // data members
    int id;
    String fullName;
    String gender;
    String className;



    // input & output
    void studentInput(Scanner input){
        System.out.print("Enter Student ID: ");
        id = input.nextInt();
        System.out.print("Enter Student FullName: ");
        input.nextLine();
        fullName = input.nextLine();
        System.out.print("Enter Student Gender: ");
        gender = input.nextLine();
        System.out.print("Enter Student ClassName: ");
        className = input.nextLine();
    }

    void studentOutput(){
        System.out.println("========Student Information=========");
        System.out.println("Student ID: "+id);
        System.out.println("Student FullName: "+fullName);
        System.out.println("Student Gender: "+gender);
        System.out.println("Student ClassName: "+className);
    }
}

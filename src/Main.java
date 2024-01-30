import javax.security.sasl.SaslClient;
import java.util.Optional;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*Student student1 = new Student();
        student1.id = 1001;
        student1.fullName = "Susu";
        student1.gender = "M";
        student1.className = "Star";

        Student student2 = new Student();
        student2.id = 1020;
        student2.fullName = "TenTen";
        student2.gender = "F";
        student2.className = "Moon";

        // change name student1
        student1.fullName = "Kidkid";
        System.out.println("Student Full Name is : " +student1.fullName);
        System.out.println("Student Full Name is : " +student2.fullName);*/


        Scanner input = new Scanner(System.in);
        Student student1 = new Student();
        student1.studentInput(input);
        student1.studentOutput();
    }
}

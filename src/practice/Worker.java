package practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Worker {
    private final static int FEMALETAXRATE = 30;
    private static final int MALETAXRATE = 50;
    int id;
    String name;
    String gender;
    String position;
    float hours;
    float rate;


    private float findSalary() {
        return rate * hours;
    }

    public void workerInput(Scanner input) {
        id = Integer.parseInt(validateNumber("Enter Worker ID:" ,input , "[0-9]+"));
        name = validateNumber("Enter Worker Name: ",input,"[a-zA_Z]+");
        gender = validateGender("Enter Worker Gender: ",input,"[/(?:m|M|male|Male|f|F|female|Female|FEMALE|MALE)$]+");
        position = validateNumber("Enter Worker Position: ",input,"[a-zA_Z]+");
        System.out.print("Enter Worker Hours: ");
        hours = input.nextFloat();
        System.out.print("Enter Worker Rate: ");
        rate = input.nextFloat();
    }

    public void workerInfo() {
        System.out.println("------------- Information --------------");
        System.out.println("Worker ID:" + id);
        System.out.println("Worker Name: " + name);
        System.out.println("Worker Gender: " + gender);
        System.out.println("Worker Position: " + position);
        // only show if the worker salary is legible for the tax

        float deduction = 0;
        if (findSalary() >= 1000) {
            deduction = findTaxDeduction();
        }

        System.out.println("Find salary: " + (findSalary() - deduction) + "$");

    }

    private float findTaxDeduction() {
        float rate = 0;
        if (gender.equalsIgnoreCase("Female")) {
            rate = FEMALETAXRATE;
        } else {
            rate = MALETAXRATE;
        }
        float deduction = findSalary() * (rate / 100);
        System.out.println("Tax : " + rate + "%");
        System.out.println("Tax Salary Reduction " + deduction + "$");
        return deduction;
    }

    public static String validateNumber(String message, Scanner input, String regex) {
        while (true) {
            System.out.println(message);
            String userInput = input.nextLine();

            Pattern pattern = Pattern.compile(regex);
            if (pattern.matcher(userInput).matches()) {
                return userInput;
            } else {
                System.out.println("Error !! Please input [0-9]: ");
            }
        }
    }

    public static String validateLetter(String message, Scanner input, String regex) {
        while (true) {
            System.out.println(message);
            String userInput = input.nextLine();

            Pattern pattern = Pattern.compile(regex);
            if (pattern.matcher(userInput).matches()) {
                return userInput;
            } else {
                System.out.println("Error !! Please input [a-zA-Z]: ");
            }
        }
    }
    public static String validateGender(String message, Scanner input, String regex) {
        while (true) {
            System.out.println(message);
            String userInput = input.nextLine();

            Pattern pattern = Pattern.compile(regex);
            if (pattern.matcher(userInput).matches()) {
                return userInput;
            } else {
                System.out.println("Error !! Please input [m|M|male|Male|f|F|female|Female|FEMALE|MALE]: ");
            }
        }
    }

}






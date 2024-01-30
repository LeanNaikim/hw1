package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Worker worker = new Worker();
        worker.workerInput(input);
        worker.workerInfo();



    }

}

package Lesson_10_Exceptions_Assert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Working");
            FileReader fr = new FileReader("ip.txt");
            System.out.println("Process");
        }catch (FileNotFoundException e){
            System.out.println("Catching");
        }
        System.out.println("End");

        try {
            FileReader fr = new FileReader("ip.txt");
        } catch (FileNotFoundException e) {
            String b = null;
            try {
                System.out.println(b.length());
            }catch (NullPointerException p){
                System.out.println("null er");
            }

        }
        try {
            System.out.println("a");
            FileReader fr = new FileReader("ip.txt");
            System.out.println("b");
            String s = "null";
            System.out.println(s.length());
//            System.out.println(args[1]);
        } catch (NullPointerException e) {
            System.out.println("d");
        }catch (ArithmeticException e){
            System.out.println("c");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End");

        try {

        }finally {
            System.out.println("Hello");
        }

        Human human = new Human();
        try {
            human.setName("Ahhghbb");
            System.out.println(human.getName());
        }catch (NameExceptions e){
        }
        try {
            human.setYear(2000);
        } catch (YearExceptions | FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("aaaaaaa");
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Enter Name");
        while (true){
            String name = sc.next();
            try {
                human.setName(name);
                System.out.println("Thanks " + human.getName());
                break;
            }catch (NameExceptions e){
                System.out.println("Invalid name enter one more time");
            }
        }
        String n = "79.5ssf8";
        System.out.println(isNumber(n));
    }

    private static boolean isNumber(String n) {
        try {
            Double.parseDouble(n);
            return true;
        }catch (NumberFormatException e){
            return false;
        }

    }
}

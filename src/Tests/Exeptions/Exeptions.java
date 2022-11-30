package Tests.Exeptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exeptions {
    public static void main(String[] args) {


        try {
            int a = 0;
            int b = 6;
            System.out.println(b/a);
        }catch (ArithmeticException e){
            System.out.println("A");
        }
        int [] array = {2, 4, 88, 65, 14, 55};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arrays member " + array[i]);

        }




        try {
            System.out.println("Working");
            FileReader fr = new FileReader("ip.txt");
            System.out.println("Process");
        }catch (FileNotFoundException e){
            System.out.println("Cached");
        }

        System.out.println("End");



        try {
            int [] array1 = {2, 4, 88, 65, 14, 55};
            for (int i = 0; i < array1.length; i++) {
                System.out.println("Arrays member " + array[6]);
            }
            System.out.println("P");
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("ERROR 404");


            }
        System.out.println("c");
    }
}

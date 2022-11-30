package Lesson_2_Arrays_Loops_Conditions;

public class OperationsWithArraysAndLoops {
    public static void main(String[] args) {
        System.out.println("1.Print numbers from 1 to 15");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");

        }

        System.out.println("\n-----------------------------------");

        System.out.println("2.Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i++) { //can we write i = i + 2 and i+=2
            if (i % 2 == 0)
                System.out.print(i + " ");

        }

        System.out.println("\n-----------------------------------");

        System.out.println("3.Print * symbols using given variables");

        //*
        //**
        //***
        //****

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println("\n-----------------------------------");

        System.out.println("4.Print * symbols using given variables");
        //****
        //***
        //**
        //*

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------");

        System.out.println("5.Create an array11 with number 1-11");
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        System.out.println("\n-----------------------------------");

        System.out.println("6.Create an array11 with even numbers from -10 to 10");
        int[] array2 = new int[11];
        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
        }
        for (int i : array2) {
            System.out.print(i + " ");

        }
        System.out.println("\n-----------------------------------");

        System.out.println("7.Given an array11 print count of odd numbers");
        int[] array10 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        for (int a : array10) {
            if (a % 2 != 0)
                System.out.print(a + " ");
        }

        System.out.println("\n-----------------------------------");

        System.out.println("8.Given an array11 print element from  -10 to 5");
        for (int a : array10) {
            if (a >= -10 && a <= 5)
                System.out.print(a + " ");
        }


        System.out.println("\n-----------------------------------");

        System.out.println("9.Given an array11 print element which can be divided 3 or 4");
        for (int a : array10) {
            if (a % 3 == 0 || a % 4 == 0)
                System.out.print(a + " ");
        }

        System.out.println("\n-----------------------------------");

        System.out.println("10.Given an array11 print count of even elements");
        int countOfEvens = 0;
        for (int a : array10) {
            if (a % 2 == 0)
                countOfEvens++;
        }
        System.out.println("Count of even elements is " + countOfEvens);
        array10 = new int[]{4, 1, 9, -4, 3};

        System.out.println("\n-----------------------------------");

        System.out.println("11.Given an array11 print sum of elements");
        int sum = array10[0];
        for (int i = 1; i < array10.length; i++) {
            sum = sum + array10[i];
        }
        System.out.println(sum);

        System.out.println("\n-----------------------------------");

        System.out.println("12.Given an array11 print sum of positive elements");
        sum = 0;
        for (int i = 0; i < array10.length; i++) {
            if (array10[i] > 0)
                sum += array10[i];
        }
        System.out.println(sum);

        System.out.println("\n-----------------------------------");

        System.out.println("13.Given an array11 print multiplication of elements");
        int m = 1;
        for (int i = 0; i < array10.length; i++) {
            m = m * array10[i];
        }
        System.out.println(m);

        System.out.println("\n-----------------------------------");

        System.out.println("14. Find maximal element from array11");
        int max = array10[0];
        for (int i = 1; i < array10.length; i++) {
            if (array10[i] > max)
                max = array10[i];
        }

        System.out.println(max);

        System.out.println("\n-----------------------------------");

        System.out.println("15. Find minimal element from array11");
        int min = array10[0];
        for (int i = 1; i < array10.length; i++) {
            if (array10[i] < min)
                min = array10[i];
        }
        System.out.println(min);

        System.out.println("\n-----------------------------------");

        System.out.println("16.Find element which is alone");
        array = new int[]{4, 2, 1, 9, 2, 1, 4};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);

        array = new int[]{4, 1, -9, 2, 1, 0, -748, 445, 12, 1};
        int x = 4, y = 3;
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + " y " + y);


        System.out.println("\n-----------------------------------");

        System.out.println("17.Sort array11 in asc.");
        for (int a : array) {
            System.out.print(a + " ");
        }
        boolean qaniDerIfMtnume = true;
        int countOfFors = 0;
        while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;
            for (int i = 0; i < array.length - 1 - countOfFors; i++) {
                if (array[i] > array[i + 1]) {
                    int zz = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = zz;
                    qaniDerIfMtnume = true;

                }
            }
            countOfFors++;
        }
            System.out.println();

            for (int a : array) {
                System.out.print(a + " ");

            }
        System.out.println();

        int [] array7 = {4, 10, -5, 8, 556, 47};
        for (int a : array7) {
            if (a % 2 != 0)
                System.out.println(a + " ");

        }

        int[] array11 = new int[]{5, 8, 9, 11, 12, 45, 10, 5, 10, 2, 5, 10};
        for (int i = 0; i < array11.length; i++) {
            if (array11[i] <= 10 && array11[i] > 0) {
                if (array11[i] % 10 == 0 || array11[i] % 5 == 0)
                    System.out.println("This is a number which I expected a few day " + array11[i]);
            }
        }


















    }
}






package Lesson_2_Arrays_Loops_Conditions;

public class ArraysLoopsConditions2 {
    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println(a[4]);
        a[0] = 4;
        a[1] = 74;
        a[3] = -7;
        a[4] = 1;
        a[5] = 1;

        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);

        int[] array = {4, 1, -8, 0, 3, 4, 6};
        //int[] array = new int[7]
        //array[0] = 4
        //array[2] = 1
        //....
        //array[6] = 6
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);


        int x = -4;
        if (x > 0) {
            System.out.println("Positive");
            System.out.println("Java");
        } else
            System.out.println("Non Positive");

        int b;
        if (x > 0)
            b = 1;
        else
            b = 0;
        b = x > 0 ? 1 : 0;
        System.out.println(b);


//        x > 0? System.out.println("Postive"): System.out.println("Non Positive");
        System.out.println(x > 0 ? "Positive" : "Non Positive");
        System.out.println("---------------------------------------");

        x = 0;

        if (x > 0) {
            System.out.println("Positive");
        } else {
            if (x < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }
        System.out.println(x > 0 ? "Positive" : x < 0 ? "Non Positive" : "Zero");


        x = 1;

        if (x == 1) {
            System.out.println("One");
        } else {
            if (x == 2) {
                System.out.println("Two");
            } else {
                if (x == 3) {
                    System.out.println("Three");
                } else
                    System.out.println("Bigger");
            }
        }
        System.out.println("---------------------------------");
        x = 2;

        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Bigger");


        }

        String y = "aa";
        switch (y) {
            case "a":
                System.out.println("");
                break;
            case "b":
                System.out.println("");
                break;
        }
        System.out.println("-----------------------");

        int counter = 1;
        while (counter < 11) {
            System.out.print(counter++ + " ");
//            counter++;

        }
        System.out.println();

        x = 4;

        while (x <= 4) {
            System.out.println("Barev");
            x++;

        }
        x = 1;

        do {
            System.out.println("Barev");
            x++;
        } while (x <= 4);

        System.out.println("---------------------------");


        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("--------------------------");

        String[] names = {"Alen", "Tigran", "Haik", "Vardan", "Ani" };
        for (int index = 0; index < names.length; index++) {
            System.out.print(names[index] + " ");

        }
        System.out.println();

        for (String s : names) {
            System.out.print(s + " ");

        }
        System.out.println();

        for (int index = 0; index < names.length; index++) {
            String s = names[index];
            System.out.print(names[index] + " ");

        }
        System.out.println();
        System.out.println("--------------------------------------");


        for (int i = names.length - 1; i >=0 ; i--) {
            System.out.print(names[i]+ " ");

        }
        System.out.println();


        int[] array2 = {4, -8, 4, 1, 3, -1};
        for (int element : array2){
            if(element < 0){
                System.out.println("Ayo");
                break;
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
             System.out.println(i);

        }
        x = 10;
        if (x > 0){
            System.out.println("Positive");
        }else {
            if (x < 0){
                System.out.println("Negative");
            }else {
                if (x == 0){
                    System.out.println("Zero");
                }
            }
        }







    }
}



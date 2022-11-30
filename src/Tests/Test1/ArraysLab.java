package Tests.Test1;

public class ArraysLab {
    public static void main(String[] args) {
        System.out.println("Print numbers from 1 to 15");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\n----------");
        System.out.println("Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i = i + 2) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n----------");

        System.out.println("Print * symbols  using given number");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        System.out.println();
        System.out.println("Print * symbols  using given number reverse mode");
        int x = 5;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Create an array with numbers 1-11");
        int[] array = new int[11];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = k;
            k++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] array1 = new int[11];
        int a = 1;
        for (int i = 0, j = -10; i < array1.length; i++, j += 2) {
            array1[i] = j;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Given an array print odd elements");
        System.out.println("---------------------------");
        int[] array2 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        for (int b : array2) {
            if (b % 2 != 0)
                System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("Given an array print  elements from -10 to 5");
        for (int m : array2) {
            if (m <= 5 && m >= -10)
                System.out.print(m + " ");

        }
        System.out.println();


        System.out.println("Given an array print element which ca be divided 3 or 4");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 3 == 0 || array2[i] % 4 == 0)
                System.out.print(array2[i] + " ");
        }
        System.out.println();

        System.out.println("Given an array print count of even numbers ");
        int countOfElements = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 0)
                countOfElements++;
        }
        System.out.println("Count of even element is  " + countOfElements);

        int[] array3 = new int[]{4, 1, 9, -4, 0, 3};
        System.out.println("Given an array print sum of elements");
        int sum = array3[0];
        for (int i = 1; i < array3.length; i++) {
            sum = sum + array3[i];
        }
        System.out.println(sum);

        System.out.println("------------------");
        int[] arr = new int[]{5, 2, 8, 7, 1};
        int temp = 0;

        System.out.println("Original array ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println(fact(9));
        System.out.println(factR(9));
























    }

    public static int fact(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }

    public static int factR(int m) {
        if (m == 0 || m == 1)
            return 1;
        return m * factR(m - 1);
    }
}

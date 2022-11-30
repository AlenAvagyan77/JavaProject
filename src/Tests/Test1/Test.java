package Tests.Test1;

import java.util.Scanner;

public class Test {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int fullInt(int x, int y) {
        return x + y;

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.fullInt(5, 5);
        System.out.println("Number is a " + t.fullInt(5, 5));


        int[] array = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        int maximumElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximumElement)
                maximumElement = array[i];
        }
        System.out.println(maximumElement);


        String[] array1 = {"Alen", "Haik", "Elen", "Artur"};
        for (String a : array1) {
            if (a == "Alen") {
                System.out.println("I found " + a + ": Thank you for attention");
            }
        }
        System.out.println(fact(9));
        System.out.println(factR(9));


    }

    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public static int factR(int v) {
        int r = 1;
        for (int i = 1; i <= v; i++) {
            r = r * i;
        }
        return r;
    }
}

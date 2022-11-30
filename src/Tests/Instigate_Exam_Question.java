package Tests;

public class Instigate_Exam_Question {
    public static void main(String[] args) {


        System.out.println(fact(5));
        System.out.println(factR(5));
        System.out.println(numberIsPrimeOrNot(12));

    }

    public static int fact(int x) {
        int r = 1;
        for (int i = 2; i <= x; i++) {
            r = r * i;
        }
        return r;
    }

    public static int numberIsPrimeOrNot(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println("It is a Prime Number.");
        else
            System.out.println("It is not a Prime Number.");
        return num;
    }


    public static int factR(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factR(n - 1);

    }

}

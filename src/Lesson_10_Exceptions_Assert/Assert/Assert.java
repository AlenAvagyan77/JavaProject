package Lesson_10_Exceptions_Assert.Assert;

public class Assert {
    public static void main(String[] args) {
        int x = 4;
        assert sum(4) == 5;
        assert sum(-4) == -3;
        assert sum(0) == 1:"0 i depkna";

        System.out.println("End");


    }
    static int sum(int x){
        if (x == 0)
            return 0;
        return x + 1;

    }
}

package Lesson_10_Exceptions_Assert;

public class YearExceptions extends Exception{
    public YearExceptions(int year){
     super("Year should be in 1905 - 2022 range: you entered " + year);
    }
}

package Lesson_10_Exceptions_Assert;

public class NameExceptions extends RuntimeException{
//    public NameExceptions(){
//        super("Invalid name: [A-Z] [a-z]+");

    @Override
    public String toString() {
        return "Invalid name:";
    }
}

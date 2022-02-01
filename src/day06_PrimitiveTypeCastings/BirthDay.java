package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        String name = "Fatma";
        int birthDay = 11;
        String birthMonth = "July";
        int birthYear = 1989;


        System.out.println(name + " was born on " + birthMonth + "/" +birthDay+ "/" +birthYear + ".");

        // My favorite book is "bookName" -> how to print a double code

        String bookName = "Pride and Prejudice";

        System.out.println("My favorite book is " + "\"" + bookName +"\"");



        double d1 = 20.5;
        short s1 = (short) d1;

    }
}

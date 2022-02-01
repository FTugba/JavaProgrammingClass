package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 5;
        ++a; // pre increment: increases the value by 1 right away

        System.out.println("a = " + a); // prints out 6

        --a; // pre decrement: decreases the value by 1 right away

        System.out.println("a = " + a); // gives out 5

        System.out.println("--------------------------------");

        int b = 100;

        System.out.println(b++); //100 -> post increment: first passes the current value, then increases it



    }
}

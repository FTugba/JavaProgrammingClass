package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50;

        int addition = num1+num2;
        int subtraction = num1-num2;
        int multiplication = num1*num2;

        //100+50=150, addition subtraction, multiplication

        System.out.println(num1  + " + " + num2 + " = " + addition);
        System.out.println(num1  + " +- " + num2 + " = " + subtraction);
        System.out.println(num1  + " * " + num2 + " = " + multiplication);

    }
}

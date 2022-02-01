package day10_NestedIf;


public class TernariesIntro {
    public static void main(String[] args) {

    int n = 100;

    if(n%2 == 0) {
        System.out.println("Even"); //String
    } else {
        System.out.println("Odd"); //String
    }
       String result1 =  (n%2 == 0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("-------------------------------------------");

        int age = 23;
       String eligibility =  (age>=21)? "Eligible" : "Non Eligible";
        System.out.println(eligibility);

        System.out.println("-------------------------------------------");

        int number = 100;
       String result3 =  (number>0)? "Positive" : (number<0)? "Negative" : "Zero";
        System.out.println(result3);
    }
}

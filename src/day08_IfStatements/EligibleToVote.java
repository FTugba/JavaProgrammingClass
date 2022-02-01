package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        //Eligible
        boolean isEligible = age >= 21 && citizen == "USA";

        if (isEligible) {
            System.out.println("Eligible");}

            //Not Eligible
            if (!isEligible) {
                System.out.println("Not Eligible");
            }
        }
    }


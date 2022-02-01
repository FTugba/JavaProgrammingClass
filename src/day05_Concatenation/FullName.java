package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Fatma Tugba";
        String lastName = "Alper";
        int age = 32;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + firstName + " " + lastName);

//____ is __ years old.

        System.out.println(firstName + " " + lastName+ " is " +age + " years old.");

        //FullName is jobTitle, works at companyName

        System.out.println(fullName + " is " + jobTitle + ", works at " +companyName);



    }
}

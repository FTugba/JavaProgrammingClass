package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6.5;
        double federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Federal tax is: $" + federalTax);







    }
}

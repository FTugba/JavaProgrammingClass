package day04_Variables;

public class Currencies {

    public static void main(String[] args) {
         int dollar = 1000;

         double lira = dollar * 9.53;
         double euro = dollar * 1.16;
         double jpy = dollar * 1.1;
         double peso = dollar * 10.3;

        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("peso = " + peso);
    }
}

package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 56;
        int b = 51;
        int c = 3;

        boolean medianA = a<c && b<a || b>a && a>c; //b<a<c or b>a>c
        boolean medianB = a<b && b<c || a>b && b>c; //a<b<c or a>b>c
        boolean medianC = a<c && c<b || a>c && c>b; //a<c<b or a>c>b

        if (medianA) {
            System.out.println(a + " is the median number");
        }
        if (medianB) {
            System.out.println(b + " is the median number");
        }
        if (medianC) {
            System.out.println(c + " is the median number");
        }










    }




}

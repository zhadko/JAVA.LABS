package com.company;
import java.util.Scanner;

public class Lab1 {
    public static void main (String[] args) {
        int C2 = 1504%2;
        int C = 1504%3;
        int C5 = 1504%5;
        int C7 = 1504%7;
        float res= 0;
        switch(C2) {
            case 0:
                System.out.println("Операция О1: +");
                break;
            case 1:
                System.out.println("Операція О1: -");
                break;
        }
        switch(C5) {
            case 0:
                System.out.println("Операція О2: *");
                break;
            case 1:
                System.out.println("Операція О2: /");
                break;
            case 2:
                System.out.println("Операція О2: %");
                break;
            case 3:
                System.out.println("Операція О2: +");
                break;
            case 4:
                System.out.println("Операція О2: -");
                break;
        }
        switch(C7) {
            case 0:
                System.out.println("Тип індексів i та j: byte");
                break;
            case 1:
                System.out.println("Тип індексів i та j: short");
                break;
            case 2:
                System.out.println("Тип індексів i та j: int");
                break;
            case 3:
                System.out.println("Тип індексів i та j: long");
                break;
            case 4:
                System.out.println("Тип індексів i та j: char");
                break;
            case 5:
                System.out.println("Тип індексів i та j: float");
                break;
            case 6:
                System.out.println("Тип індексів i та j: double");
                break;
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        final double a = in.nextDouble();
        System.out.print("Input b: ");
        final double b = in.nextDouble();
        System.out.print("Input n: ");
        final int n = in.nextInt();
        System.out.print("Input m: ");
        final int m = in.nextInt();

        if (a > n || b > m) {
            System.out.println("Result = 0");
        }else if(a<=C && n>=C){
            System.out.println("Division by zero");
        }else{
            try{
                for(double i=a;i<=n;i++){
                    for (double j = b;j<=m;j++) {
                        res += (i - j) / (i + C);
                    }
                }
                System.out.println("Result =" + res);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Program is finished");
    }
}

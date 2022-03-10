package com.java.day8LineComparison;

import java.util.Scanner;

public class OopsLineComparison {
    public static Scanner scanner =new Scanner(System.in);
    public static double x1,y1;
    public static double x2,y2;
    public static double x3,y3;
    public static double x4,y4;

    //UC1: Calculating the Length of the Line
    public void lengthOfLine(){
        System.out.println("The Coordinates of the Line are: ");
        System.out.println("x1 = ");
        x1=scanner.nextInt();
        System.out.println("y1 = ");
        y1=scanner.nextInt();
        System.out.println("x2 = ");
        x2=scanner.nextInt();
        System.out.println("y2 = ");
        y2=scanner.nextInt();

        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The Length of the Line is= "+length);
    }

    //UC2: Checking the Equality of Two Lines based on End Points
    public static void equalityOfLines(){
        System.out.println("The Coordinates of 1st line are:");
        System.out.print("x1 = ");
        x1=scanner.nextInt();
        System.out.print("y1 = ");
        y1=scanner.nextInt();
        System.out.print("x2 = ");
        x2=scanner.nextInt();
        System.out.print("y2 = ");
        y2=scanner.nextInt();

        System.out.println("The Coordinates of 2nd line are:");
        System.out.print("x3 = ");
        x3=scanner.nextInt();
        System.out.print("y3 = ");
        y3=scanner.nextInt();
        System.out.print("x4 = ");
        x4=scanner.nextInt();
        System.out.print("y4 = ");
        y4=scanner.nextInt();

        Double length1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The length of the 1st line is = "+length1);

        Double length2 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
        System.out.println("The length of the 2nd line is = "+length2);

        if(length1.equals(length2))
            System.out.println("The lines are equal");
        else
            System.out.println("The lines are not equal");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program on Master Branch");
        OopsLineComparison object = new OopsLineComparison();
        object.lengthOfLine();
        equalityOfLines();
    }
}

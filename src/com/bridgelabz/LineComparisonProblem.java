package com.bridgelabz;

public class LineComparisonProblem {
    //calculating length one.
    static double geometryOne(int x1, int y1, int x2, int y2) {
        double lengthOne = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return lengthOne;
    }

    //calculating length Two.
    static double geometryTwo(int x1, int y1, int x2, int y2) {
        double lengthOne = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return lengthOne;
    }

    //main method start
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        //passing length one values
        Double lengthOne = geometryOne(30, 40, 40, 30);
        System.out.println("Length one : " + lengthOne);
        //passing length two values
        Double lengthTwo = geometryTwo(30, 40, 40, 30);
        System.out.println("Length two : " + lengthTwo);

        //condition for checking lengthOne is equal to lengthTwo using equals method.
        if (lengthOne.equals(lengthTwo)) {
            System.out.println("Length one " + lengthOne + " is Equal to " + "Length Two " + lengthTwo);
        } else {
            System.out.println("Length one " + lengthOne + " Not Equal " + "Length Two " + lengthTwo);
        }
    }//main end
}

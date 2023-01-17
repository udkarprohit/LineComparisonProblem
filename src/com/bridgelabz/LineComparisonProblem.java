package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProblem {
    //calculating length one.
    static void geometryOne(int x1, int y1, int x2, int y2) {
        double lengthOne = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(lengthOne);
    }

    //main method start
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        //passing values.
        geometryOne(30, 40, 40, 30);
    }
}

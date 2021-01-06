package org.launchcode.java.studios.areaofacircleorg.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of the circle: ");
        float radius = input.nextFloat();
        double area = Circle.getArea((double) radius);
        System.out.println("The areas of the circle is: " + area);
        }
}

package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {
        double length;
        double width;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rectangle length:");
        length = input.nextDouble();
        System.out.println("Please enter rectangle width:");
        width = input.nextDouble();
        input.close();
        area = (length * width);
        System.out.println("The areas of the rectangle is: " + area + " cm");
    }


}

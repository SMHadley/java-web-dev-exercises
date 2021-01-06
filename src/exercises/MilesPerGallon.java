package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        float miles;
        float gas;
        float milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of miles driven: ");
        miles = input.nextFloat();
        System.out.println("Please enter gallons of gas used: ");
        gas = input.nextFloat();
        input.close();
        milesPerGallon = (gas/miles);
        System.out.println("You used " + milesPerGallon + " gallons of gas per mile.");
    }
}

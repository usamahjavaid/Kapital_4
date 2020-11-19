/*
(Geometry: area of a hexagon) The area of a hexagon can be computed using the
following formula (s is the length of a side):
Area = (6 * (s*s)) / (4 * Math.tan(Math.Pi/6));

 Write a program that prompts the user to enter the side of a hexagon and displays
its area. Here is a sample run:
 */

import java.util.Scanner;
public class Opgave4_4 {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner (System.in);
        //Prompt the user to enter the side of hexagon
        System.out.println("Enter the side of the hexagon");
        double sides = input.nextDouble();


        //Display result
        double area = (6 * (sides*sides)) / (4 * Math.tan(Math.PI/6));

        area = Math.round(area*100) /100.0;

        System.out.println("The area of the hexagon is " + area);



    }
}

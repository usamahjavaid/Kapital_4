/*
(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
which all sides are of the same length and all angles have the same degree (i.e., the
polygon is both equilateral and equiangular). The formula for computing the area
of a regular polygon is
Area (n*(s*s)) / (4 * math.tan(math.pi/n))
 Here, s is the length of a side. Write a program that prompts the user to enter the
number of sides and their length of a regular polygon and displays its area
 */


import java.util.Scanner;
public class Opgave4_5 {
    public static void main(String[] args) {

        //Create Scanner
        Scanner input = new Scanner (System.in);
        //Prompt the user to enter number of sides
        System.out.println("Enter the number of sides ");
        double NumberSide = input.nextInt();

        //Prompt the user to enter side
        System.out.println("Enter the side");
        double side = input.nextDouble();

        //calculate the calculations

        double area = (NumberSide * (side * side)) / (4 * Math.tan(Math.PI/NumberSide));

        //Display results
        System.out.println("The area of the polygon is " + area);











    }
}

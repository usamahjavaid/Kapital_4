import java.util.Scanner;
public class Opgave4_1 {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the length from the center to vertex
        System.out.println("Enter the length from the center to vertex");
        double radius = input.nextDouble();

        //Display results
        double s = (2*radius) * Math.sin(Math.PI/5);
        double area = (5 * (s*s)) / (4 * Math.tan(Math.PI / 5));

        area = Math.round(area*100) /100.0;

        System.out.println("The area of the pentagon is " + area);


    }


}

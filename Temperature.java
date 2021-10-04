// Joe Claborn
package Java.ClassWorkProblems;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

    System.out.println("What is your temperature? ");
    // asks for user input
    Scanner input = new Scanner(System.in);
    double temp = input.nextDouble();
    // changes Fahrenheight to Celsius
    double tempC = (temp - 32.0) * (5.0 / 9.0);
    System.out.println("Your temperature is " + temp);

    // rounds the final outcome to one decimal place
    double roundedTemp = Math.round(tempC * 10) / 10.0;
    System.out.println("Your temperature is " + roundedTemp);
    input.close();
    }
}
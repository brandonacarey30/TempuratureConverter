// Brandon Carey
// CSC 111
// August 28 2013
// This is a program that prompts a user to enter a desired temperature 
// in Celsius. The program will then convert the temperature to fahrenheit. 

import java.util.Scanner;

public class CelsiustoFahrenheit
{
  public static void main(String[] args)
  {
     double temperature;
     double fahrenheit;

     Scanner Celsius = new Scanner(System.in);
     System.out.println("Enter a temperature in Celsius.");
		
     temperature = Celsius.nextDouble();
     fahrenheit = ((temperature * 1.8) + 32);

     System.out.println("Fahrenheit (in degrees) = " + fahrenheit);
  }	
}
		

		

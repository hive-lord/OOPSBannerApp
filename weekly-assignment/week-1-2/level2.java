import java.util.Scanner;
public class level2 {
    /*Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit
Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint => 
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius
Create a program to find the total income of a person by taking salary and bonus from user
Hint => 
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
 */
    Scanner s = new Scanner(System.in);
    public void Q1() {
        System.out.println("Enter temperature in Celsius:");
        double celsius = s.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }

    public void Q2() {
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = s.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }

    public void Q3() {
        System.out.println("Enter salary:");
        double salary = s.nextDouble();
        System.out.println("Enter bonus:");
        double bonus = s.nextDouble();
        double income = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
    }
    public static void main(String[] args) {
        level2 obj = new level2();
        obj.Q1();
        obj.Q2();
        obj.Q3();
    }

    
}

import java.util.Scanner;
public class level2 {
    /*
Level 2 Practice Programs
Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication, and division assign the result to a variable, and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___
Write a program to find the side of the square whose parameter you read from the user 
Hint => Perimeter of the Square is 4 times the side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
Write a program to find the distance in yards and miles for the distance provided by the user in feet
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => The distance in yards is ___ while the distance in miles is ___
Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___ */
    Scanner s = new Scanner(System.in);
    public void Q1() {
        System.out.println("Enter two numbers:");
        double number1 = s.nextDouble();
        double number2 = s.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }

    public void Q2() {
        System.out.println("Enter base and height in cm:");
        double base = s.nextDouble();
        double height = s.nextDouble();
        double areaInSqCm = 0.5 * base * height;
        double areaInSqIn = areaInSqCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm);
    }

    public void Q3() {
        System.out.println("Enter perimeter of the square:");
        double perimeter = s.nextDouble();
        double sideLength = perimeter / 4;
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);
    }

    public void Q4() {
        System.out.println("Enter distance in feet:");
        double distanceInFeet = s.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInFeet / (3 * 1760);
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }

    public void Q5() {
        System.out.println("Enter unit price and quantity:");
        double unitPrice = s.nextDouble();
        int quantity = s.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }

    public void Q6() {
        System.out.println("Enter two numbers:");
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
    }
    public static void main(String[] args) {
        level2 obj = new level2();
        obj.Q1();
        obj.Q2();
        obj.Q3();
        obj.Q4();
        obj.Q5();
        obj.Q6();   
}
}
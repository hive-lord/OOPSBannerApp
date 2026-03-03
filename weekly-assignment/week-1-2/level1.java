import java.util.Scanner;
public class level1 {
    Scanner s = new Scanner(System.in);
    
    public void Q1() {
        System.out.println("Enter a number:");
        int num = s.nextInt();
        System.out.println("the number is "+(num-2000));
    }
    
    public void Q2() {
        System.out.println("Enter three numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        System.out.println("the average is "+(num1+num2+num3)/3);
    }
    
    public void Q3() {
        System.out.println("Enter distance in kilometers:");
        int km = s.nextInt();
        System.out.println("the distance in miles is "+(km*0.621371));
    }
    
    public static void main(String[] args) {
        level1 obj = new level1();
        obj.Q1();
        obj.Q2();
        obj.Q3();
    }
}

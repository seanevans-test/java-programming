package chapter6;

import java.util.Scanner;

public class HomeAreaCalcualtorRedo {

    public static void main(String args[]){

        HomeAreaCalcualtorRedo calculator = new HomeAreaCalcualtorRedo();
        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);
    }

    public Rectangle getRoom(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        scanner.close();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}

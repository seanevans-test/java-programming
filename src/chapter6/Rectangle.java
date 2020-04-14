package chapter6;

public class Rectangle {

    double length;
    double width;

    double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    double calculateWidth(){
        return length * width;
    }
}

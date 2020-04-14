package chapter6;

public class Rectangle {

    double length;
    double width;

    double getLength(){
        return length;
    }

    void setLength(double length){
        this.length = length;
    }

    double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    double calculateArea(){
        return length * width;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("the radius is" + c1.getRadius());
        System.out.println("the color is" + c1.getColor());
        System.out.println("the area is " + c1.getArea() );
    
        Circle c2 = new Circle(2.0);
        System.out.println("the radius is" + c2.getRadius());
        System.out.println("the color is" + c2.getColor());
        System.out.println("the area is " + c2.getArea());
    
        Circle c3 =new Circle();
        System.out.println("the radius is" + c3.getRadius());
        System.out.println("the color is" + c3.getColor());
        System.out.println("the area is " + c3.getArea());
    }

}
package edu.nguyenmv.exercises12;

import java.util.*;
import edu.nguyenmv.exercises09.Matrix;

public class ShapeWorld {
    public static void printArea(Shape s) {
        System.out.println("Area: " + s.getArea());
        if(s instanceof Circle) {
            double r = ((Circle) s).getRadius();
        }
    }

    public static void main(String [] args) {
        Shape s1 = new Shape(8, -4, true);
        Shape s2 = new Shape(-7,-2, false);
        Circle c1 = new Circle();
        c1.setPos(Matrix.makePoint2D(2,3));

        printArea(s1);
        printArea(c1);

        Circle c2 = new Circle(
                Matrix.makePoint2D(1,2),
                false);

        Circle c3 = new Circle(9,-2, false);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c1);
        System.out.println(c3);

        ArrayList<Shape> allShapes = new ArrayList<Shape>();
        System.out.println(allShapes.size());
        allShapes.add(s1);
        allShapes.add(s2);
        allShapes.add(c1);
        allShapes.add(c3);

        System.out.println(allShapes.size());
    }
}

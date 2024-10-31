package edu.nguyenmv.exercises12;

import edu.nguyenmv.exercises09.Matrix;

public class ShapeWorld {
    public static void main(String[] args) {
        Shape s1 = new Shape (8, 4, true);
        Shape s2 = new Shape (-7, -2, false);
        Circle c1 = new Circle();
        Circle c2 = new Circle(Matrix.makePoint2D(1,2 ), false);
        Circle c3 = new Circle (9, -2, false);
        c1.setPos(Matrix.makePoint2D(2,3));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c1);
        System.out.println(c3);


    }
}

package edu.nguyenmv.exercises12;

import edu.nguyenmv.exercises09.Matrix;

public class Circle extends Shape {

    public Circle() {}

    public Circle (double x, double y, boolean filled) {
      this(Matrix.makeTranslation2D(2, 3))
        //this.filled = filled;
      //setPos(Matrix.makePoint2D(x, y));
    }

    public Circle(Matrix pos, boolean filled ) {
        super(pos, filled);
    }
}

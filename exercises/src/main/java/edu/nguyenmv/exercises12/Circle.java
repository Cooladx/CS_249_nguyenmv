package edu.nguyenmv.exercises12;

import edu.nguyenmv.exercises09.Matrix;

public class Circle extends Shape {

    public Circle() {}

    public Circle (double x, double y, boolean filled) {
      this.filled = filled;
      setPos(Matrix.makePoint2D(x, y));

    }

}

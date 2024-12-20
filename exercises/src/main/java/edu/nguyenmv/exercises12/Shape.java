package edu.nguyenmv.exercises12;

import edu.nguyenmv.exercises09.Matrix;

public class Shape {
    private Matrix pos = Matrix.makePoint2D(0,0);
    protected boolean filled = true;

    public Shape() {}

    public Shape(Matrix pos, boolean filled) {
        this.filled = filled;
        setPos(pos);
    }

    public Shape(double x, double y, boolean filled) {
        this.filled = filled;
        this.pos = Matrix.makePoint2D(x,y);
    }

    public void setPos(Matrix pos) {
        this.pos = new Matrix(pos);
    }

    public Matrix getPos() {
        return new Matrix(this.pos);
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        String s = "Shape (" + pos.toPointString();
        if(filled) {
            s += ",filled";
        }
        s += ")";
        return s;
    }

    public double getArea() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Shape sother) {
            return (filled == sother.filled
                    && pos.equals(sother.pos));
        }
        else {
            return false;
        }
    }
}

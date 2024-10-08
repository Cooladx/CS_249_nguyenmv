package edu.nguyenmv.exercises10;
import edu.nguyenmv.exercises09.Matrix;

public class Circle
{
    private double radius = 1.0;
    private Matrix center = Matrix.makeTranslation2D(0,0);

    public double getRadius()
    {
        return radius;
    }

    public boolean getRadius(double radius)
    {
        if (radius >= 0) {
            this.radius = radius;
            return true;
        }

        return false;
    }

    public Matrix(Matrix other)

    public Matrix getCenter()
    {
        return center;
    }
}

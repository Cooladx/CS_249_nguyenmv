package edu.nguyenmv.exercises15.strategy;

public class GrizzlyBear extends Bear{
    public GrizzlyBear() {
        moveBehavior = new MoveWithFourLegs();
    }
}

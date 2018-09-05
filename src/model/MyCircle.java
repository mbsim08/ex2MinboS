package model;

public class MyCircle extends MyShape{

    private double radius;

    public MyCircle(float x, float y, double radius) {
        super(x,y);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override //override the toString() in Object
    public String toString(){
        return "MyCircle[(" + getLocation() + ") Radius = " + radius + "Area = " + getArea() +"]";
    }
}

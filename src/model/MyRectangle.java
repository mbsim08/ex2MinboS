package model;

public class MyRectangle extends MyShape {

    private double width;
    private double height;

    public MyRectangle(float x, float y, double height, double width) {
        super(x,y);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea(){
        return width*height;
    }

    @Override
    public String toString(){
        return "MyRectangle[(" + getLocation() + ") Width=" + width + " Height=" + height + " Area= " +getArea()+"]";
    }
}

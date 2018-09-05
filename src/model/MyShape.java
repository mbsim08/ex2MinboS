package model;

import java.awt.geom.Point2D;

public abstract class MyShape extends Object{

    private Point2D.Float location;

    public MyShape(float x, float y) {
        location = new Point2D.Float(x,y);
    }

    public MyShape(){
        this(0F,0F);
    }
    public MyShape(Point2D.Float location){
        this.location = location;

    }
    public abstract double getArea();

    //public abstract double getArea();

    public Point2D.Float getLocation() {
        return location;
    }
}

package model;

public class MyKite extends MyShape {
    private double diagnalOne;
    private double diagnalTwo;

    public MyKite (float x, float y, double diagnalOne, double diagnalTwo){
        super (x,y);
        this.diagnalOne = diagnalOne;
        this.diagnalTwo = diagnalTwo;
    }

    @Override
    public double getArea(){
        return (diagnalOne * diagnalTwo) /2;

    }

    @Override //override the toString() in Object
    public String toString(){
        return "MyKite[(" + getLocation() + ") Diagonal 1=" + diagnalOne + " Diagonal 2=" + diagnalTwo + " Area= " +getArea()+"]";
    }
}

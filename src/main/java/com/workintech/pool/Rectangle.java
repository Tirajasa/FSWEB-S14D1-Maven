package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
        check(width, length);
    }

    public double getLength() {
        return length;
    }
    public double getWidth(){
         return width;
    }
    public void check(double width,double length){
        if(this.length<0){
            this.length=0;
        }else{
            this.length=length;
        }
        if(this.width<0){
            this.width=0;
        }else {
            this.width = width;
        }
    }
    public double getArea(){
        return this.width*this.length;
    }
}

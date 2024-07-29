package com.workintech.cylinder;

public class Cylinder {
  private double height;
  private double radius;

  public Cylinder(double height, double radius){
    if(height<0){
      this.height=0;
    }else {
      this.height=height;
    }
    if(radius<0){
      this.radius=0;
    }else{
      this.radius=radius;
    }
  }
  public double getRadius() {
    return this.radius;
  }


  public double getHeight() {
    return this.height;
  }

  public double getArea() {
   return this.radius * this.radius * Math.PI;
  }

  public double getVolume( ){
    return  this.radius * this.radius * Math.PI*this.height;
  }
}

package org.example;

public class Point {
   private int x;
   private int y;
public Point (int x, int y ){
    setX(x);
    setY(y);
}
public int getX(){
    return x;
}
public void setX(int x){
    this.x=x;
}
public int getY(){
    return y;
}
public void setY(int y) {
    this.y=y;
}
public double distance () {
    return Math.sqrt(this.x * this.x + this.y * this.y);
}
public double distance (Point p){
    int deltaX = this.x - p.getX();
    int deltaY = this.y - p.getY();
    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
}
public double distance (int a, int b){
    int deltaX= this.x-a;
    int deltaY=this.y-b;
    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
}
}
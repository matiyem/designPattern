/*
    Create by Atiye Mousavi 
    Date: 11/6/2022
    Time: 10:28 AM
**/
public class Rectangle extends Shape{

    public Rectangle(){
        type="Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

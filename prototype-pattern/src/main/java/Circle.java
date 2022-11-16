/*
    Create by Atiye Mousavi 
    Date: 11/6/2022
    Time: 10:32 AM
**/
public class Circle extends Shape{

    public Circle(){
        type="Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

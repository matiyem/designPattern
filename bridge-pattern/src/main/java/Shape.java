/*
    Create by Atiye Mousavi 
    Date: 11/7/2022
    Time: 10:31 AM
**/
public abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi){
        this.drawApi=drawApi;
    }
    public abstract void draw();
}

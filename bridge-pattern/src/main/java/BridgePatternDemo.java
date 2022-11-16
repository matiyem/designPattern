/*
    Create by Atiye Mousavi 
    Date: 11/7/2022
    Time: 11:06 AM
**/
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle=new Circle(100,100,10,new RedCircle());
        Shape greenCircle=new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}

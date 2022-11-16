/*
    Create by Atiye Mousavi 
    Date: 11/7/2022
    Time: 10:27 AM
**/
public class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x+", "+ y + "]");
    }
}

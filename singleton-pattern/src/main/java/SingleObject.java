/*
    Create by Atiye Mousavi 
    Date: 11/6/2022
    Time: 2:09 PM
**/
public class SingleObject {

    private static SingleObject instance=new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}

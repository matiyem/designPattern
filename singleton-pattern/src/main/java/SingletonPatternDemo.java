/*
    Create by Atiye Mousavi 
    Date: 11/6/2022
    Time: 2:11 PM
**/
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object=SingleObject.getInstance();
        object.showMessage();
    }
}

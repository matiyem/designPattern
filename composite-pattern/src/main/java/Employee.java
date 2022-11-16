import java.util.ArrayList;
import java.util.List;

/*
    Create by Atiye Mousavi 
    Date: 11/8/2022
    Time: 11:24 AM
**/
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }
    public void add(Employee e){
        subordinates.add(e);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}

import java.util.ArrayList;
import java.util.List;

/*
    Create by Atiye Mousavi 
    Date: 11/8/2022
    Time: 10:18 AM
**/
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons=new ArrayList<Person>();

        for (Person person:persons){
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}

import java.util.ArrayList;
import java.util.List;

/*
    Create by Atiye Mousavi 
    Date: 11/8/2022
    Time: 10:01 AM
**/
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> famelePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                famelePersons.add(person);
            }
        }
        return famelePersons;
    }
}

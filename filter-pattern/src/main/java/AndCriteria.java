import java.util.List;

/*
    Create by Atiye Mousavi 
    Date: 11/8/2022
    Time: 10:28 AM
**/
public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaPersons=criteria.meetCriteria(persons);

        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}

package Filter;

import java.util.List;

public class OrCriteria implements  Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteris(List<Person> personList) {
        List<Person>firstCriterisItems=criteria.meetCriteris(personList);
        List<Person>otherCriterisItems=otherCriteria.meetCriteris(personList);
        for (Person person:otherCriterisItems){
            if(!firstCriterisItems.contains(person)){
                firstCriterisItems.add(person);
            }
        }
        return firstCriterisItems;
    }
}

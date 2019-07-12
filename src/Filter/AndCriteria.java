package Filter;

import java.util.List;

public class AndCriteria  implements  Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteris(List<Person> personList) {
        List<Person>firstCriterisItems=criteria.meetCriteris(personList);
        return otherCriteria.meetCriteris(firstCriterisItems);
    }
}

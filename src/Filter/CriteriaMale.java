package Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale  implements  Criteria {
    @Override
    public List<Person> meetCriteris(List<Person> personList) {
        List<Person> personList1=new ArrayList<Person>();
        for(Person person:personList){
            if (person.getGender().equalsIgnoreCase("MALE")){
                personList1.add(person);
            }
        }
        return personList1;
    }
}

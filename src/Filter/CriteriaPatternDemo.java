package Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Robert","Male","Single"));
        personList.add(new Person("John","Male","Single"));
        personList.add(new Person("Lanura","FeMale","Married"));
        personList.add(new Person("Eric","Male","Single"));
        personList.add(new Person("Robert","Male","Single"));

        Criteria male=new CriteriaMale();
        Criteria female=new CriteriaFemale();
        Criteria single=new CriteriaSingle();
        Criteria singleMale=new AndCriteria(single,male);
        Criteria singleOrFemale=new OrCriteria(single,female);

        System.out.println("Males");
        printPersons(male.meetCriteris(personList));

        System.out.println("FeMales");
        printPersons(female.meetCriteris(personList));

        System.out.println("Single Males");
        printPersons(single.meetCriteris(personList));

        System.out.println("Single or Females");
        printPersons(singleOrFemale.meetCriteris(personList));

    }
    public  static  void printPersons(List<Person> personList){
        for(Person person:personList){
            System.out.println("Person : { [  Name"+person.getName() +", Gender"+person.getGender() +",Marital "+person.getMaritalStatus());
        }
    }
}

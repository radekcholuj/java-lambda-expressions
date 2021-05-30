package pl.radekcholuj.lambdaexpressions.lambdaasargument;

import java.util.HashSet;
import java.util.Set;

public class PersonRepository {
    private Set<Person> people = new HashSet<>();

    public void add (Person person){
        people.add(person);
    }

    public  void remove (Person person){
        people.remove(person);
    }

    public Set<Person> find(Criteria criteria){
        Set<Person> finded = new HashSet<>();
        for (Person person : people) {
            if(criteria.isFit(person)){
                finded.add(person);
            }
        }
        return finded;
    }
}

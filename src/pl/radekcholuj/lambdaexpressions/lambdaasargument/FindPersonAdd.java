package pl.radekcholuj.lambdaexpressions.lambdaasargument;

import java.util.Set;

public class FindPersonAdd {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        personRepository.add(new Person ("Marek", 63));
        personRepository.add(new Person ("Marian", 63));
        personRepository.add(new Person ("Julia", 18));
        personRepository.add(new Person ("Kasia", 3));
        personRepository.add(new Person ("Maciek", 35));
        personRepository.add(new Person ("Zandrzej", 38));
        personRepository.add(new Person ("Andrzej", 85));

        Criteria findAndrzej = person -> person.getName().equals("Andrzej");
        Set<Person> andrzejs = personRepository.find(findAndrzej);

        System.out.println(andrzejs);

        Criteria find63 = person -> person.getAge() == 63;
        Set<Person> s63 = personRepository.find(find63);

        System.out.println(s63);

        Criteria nemeStartsWithZ = person -> person.getName().startsWith("Z");
        Set<Person> zs = personRepository.find(nemeStartsWithZ);

        System.out.println(zs);

        Criteria findLessThan10 = person -> person.getAge() < 10;
        Set<Person> l10 = personRepository.find(findLessThan10);

        System.out.println(l10);

        Criteria adult = person -> person.getAge() >= 18;
        Set<Person> adults = personRepository.find(adult);

        System.out.println(adults);

        Criteria startsA55 = person -> person.getName().startsWith("A") && person.getAge() > 55;
        Set<Person> starts = personRepository.find(startsA55);

        System.out.println(starts);
    }
}

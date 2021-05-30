package pl.radekcholuj.lambdaexpressions.lamdawithexceptions;

import java.util.ArrayList;
import java.util.List;

public class FinderExamples {
    public static void main(String[] args) {
        //1
        Finder<String> womenFinder = names -> {
            List<String> found = new ArrayList<>();
            for (String name : names) {
                if (name.endsWith("a")) {
                    found.add(name);
                }
            }
            if (found.isEmpty()) {
                throw new NoFoundException();
            } else {
                return found;
            }
        };
        List<String> names = List.of("Marek", "Kasia", "Ania", "Mateusz", "Jurek");

        try {
            System.out.println(womenFinder.find(names));
        } catch (NoFoundException e) {
            System.out.println("Woman not found");
        }
        //2
        Finder<String> menFinder = allNames -> {
            List<String> found = new ArrayList<>();
            for (String name : allNames) {
                if (!name.endsWith("a")) {
                    found.add(name);
                }
            }
            if (found.isEmpty()) {
                throw new NoFoundException();
            } else {
                return found;
            }
        };

        try {
            System.out.println(menFinder.find(names));
        } catch (NoFoundException e) {
            System.out.println("Man not found");
        }
        //3
        Finder<Integer> evenFinder = numbers -> {
            List<Integer> found = new ArrayList<>();
            for (int number : numbers) {
                if (number%2 == 0) {
                    found.add(number);
                }
            }
            if (found.isEmpty()) {
                throw new NoFoundException();
            } else {
                return found;
            }
        };
        List<Integer> numbers = List.of(1, 34, 23, 45, 12, 5, 6, 7, 1124 ,234 ,432);
        try {
            System.out.println(evenFinder.find(numbers));
        } catch (NoFoundException e) {
            System.out.println("Even numbers not found");
        }
    }
}

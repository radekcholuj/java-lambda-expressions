package pl.radekcholuj.lambdaexpressions.lamdawithexceptions;

import java.util.List;

@FunctionalInterface
public interface Finder<T> {
    List<T> find(List<T> people) throws NoFoundException;
}

package pl.radekcholuj.lambdaexpressions.parametrizedfunctionalinterface;

@FunctionalInterface
public interface Calculator<T> {
   T calculate (T [] tab);
}

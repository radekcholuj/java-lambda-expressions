package pl.radekcholuj.lambdaexpressions.introduction;

@FunctionalInterface
public interface Validator {
    boolean validate(int value);
}

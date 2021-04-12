package spbuWorks;

public class BadComputer extends Calculator{
    public BadComputer(int yearOfProduction) {
        super(yearOfProduction);
    }

    @Override
    public int plus(int a, int b) {
        return super.plus(a, b)+100;
    }
}

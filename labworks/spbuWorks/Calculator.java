package spbuWorks;

public class Calculator implements Comparable{
    public Calculator(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    private int yearOfProduction;
    public int plus (int a, int b){
        return a+b;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public int compareTo(Object o) {
        Calculator anotherCalc=(Calculator) o;
        if(anotherCalc.getYearOfProduction()>yearOfProduction) return -1;
        if(anotherCalc.getYearOfProduction()<yearOfProduction) return 1;
        return 0;

    }
}

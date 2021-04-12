package spbuWorks;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Calculator [] blackOne=new Calculator[4];
        blackOne[0]=new Calculator(2010);
        blackOne[1]=new Calculator(2021);
        blackOne[2]=new Calculator(1988);
        //blackOne[3]=new BadComputer(2000);
        blackOne[3]=new Calculator(2001);
        for (Calculator c : blackOne){
            System.out.println("result="+c.getYearOfProduction());

        }
        System.out.println("");
        Arrays.sort(blackOne);
        for (Calculator c : blackOne){
            System.out.println("result="+c.getYearOfProduction());

        }
    }
}

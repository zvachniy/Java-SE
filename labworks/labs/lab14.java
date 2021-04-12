package labs;
import java.util.Random;
//конс вместо десятки
public class lab14 {
    public static void main(String[] args) {
        MakeArray();
    }
    public static void MakeArray(){
        float[] arrayNumbers = new float[10];
        float ArithmeticMean=0;
        for (int i=0; i<arrayNumbers.length;i++){
            Random r = new Random();
            arrayNumbers[i]= r.nextFloat();
            System.out.println(arrayNumbers[i]);
        }
        for (float f:arrayNumbers){
            ArithmeticMean+=f/10;

        }
        System.out.println("Средний результат "+ ArithmeticMean);
    }
}

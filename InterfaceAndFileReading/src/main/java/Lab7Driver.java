import java.io.IOException;

public class Lab7Driver {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the number file reader");
        System.out.println("You will be asked for an amount of numbers to calculate.");
        ReadAndCalc a = new ReadAndCalc();
        int[] array = a.populateArray("Data.txt");
        a.calcValues(array);
    }


}

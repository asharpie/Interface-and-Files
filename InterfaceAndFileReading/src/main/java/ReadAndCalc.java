import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ReadAndCalc implements ReadFile {
    @Override
    public int[] populateArray(String fileName) throws IOException {
        int index = 0;
        File file = new File("Data.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            index++;
            scan.nextLine();

        }
        scan.close();
        int[] numbers = new int[index];
        int place = 0;
        Scanner scan2 = new Scanner(file);
        while(scan2.hasNextLine()){
            String line = scan2.nextLine();
            int print = Integer.parseInt(line);
            numbers[place]=print;
            place++;


        }
        scan2.close();
        return numbers;
    }

    @Override
    public void calcValues(int[] nums) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many numbers should be calculated?");
        int input = keyboard.nextInt();
        int sum = 0;
        int index = 0;
        for(int a = 0 ; a<nums.length; a++) { //index should only be able to reach 23

            if (index < input) {
                System.out.println(nums[a]);
                sum += nums[a];
                index++;
            } else {
                if (sum == nums[index]) {
                    System.out.println("The sum of " + sum + " matches " + nums[a] + ". This was the expected result");
                } else {
                    System.out.println("The sum of " + sum + " doesn't match " + nums[a] + ".");
                }
                sum = 0;
                index = 0;


            }

        }


    }
}

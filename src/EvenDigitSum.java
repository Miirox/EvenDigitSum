import java.util.Scanner;

public class EvenDigitSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.println("The sum of even digit numbers is: " + getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }

        int digitCount = 0;
        int newNumber = number;
        while(newNumber != 0){
            newNumber /= 10;
            digitCount++;
        }

        int sum = 0;
        for(int i = 0; i < digitCount; i++){
            int currentDigit = (int)(number / Math.pow(10, digitCount - 1 - i) % 10);
            if(currentDigit % 2 == 0){
                sum += currentDigit;
            }
        }

        return sum;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int number = input.nextInt();;
        int numberDigit = 0;
        int tempNumber, numberValue, numberPow,result = 0;

        tempNumber = number;
        while (tempNumber > 0){
            tempNumber /= 10;
            numberDigit++;
        }
        tempNumber = number;
        while (tempNumber > 0){
            numberValue = tempNumber % 10;

            numberPow = 1;

            for (int i = 1; i <= numberDigit; i++){
                numberPow *= numberValue;
            }
            result +=numberPow;
            tempNumber /= 10;
        }

        if (number == result){
            System.out.println(number + " sayısı bir armstrong sayıdır.");
        }else {
            System.out.println(number + " sayısı armstrong sayısı değildir.");
        }

    }
}
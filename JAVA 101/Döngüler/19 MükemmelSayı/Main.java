import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Program sona erdirilene kadar mükemmel sayı bulmaya devam eden program.

        Scanner inp = new Scanner(System.in);

        int number, total = 0, select;
        boolean condition = true;


        while (condition) {

            System.out.print("Bir sayı giriniz : ");
            number = inp.nextInt();

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }
            if (total == number) {
                System.out.print(number + " sayısı mükemmel bir sayıdır.");
            } else {
                System.out.print(number + " sayısı mükemmel bir sayı değildir.");
            }

            System.out.print("\nYeni sorgulama yapmak ister misiniz?\n1-Evet\n2-Hayır\nSeçiminiz : ");
            select = inp.nextInt();
            if (select == 2) {
                System.out.print("Program sona erdi.");
                condition = false;
            }

        }
    }
}
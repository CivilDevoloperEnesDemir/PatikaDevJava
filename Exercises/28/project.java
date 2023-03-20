import java.util.Scanner;
public class project {
    public static void main(String[] args) {

        Scanner inp = new Scanner (System.in);

        int x , y, number, plus=0;

        System.out.print("x değerini giriniz : ");
        x = inp.nextInt();
        System.out.print("y değerini giriniz : ");
        y = inp.nextInt();

        do {
            System.out.print("Sayı giriniz : ");
            number = inp.nextInt();

            if (number % x == y) {
                plus++;
            }

        } while (number>0);

        System.out.print ("Koşulu sağlayan sayıların sayısı : "+plus);


    }
}

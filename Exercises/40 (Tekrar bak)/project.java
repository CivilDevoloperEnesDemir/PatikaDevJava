import java.util.Scanner;

public class project{
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        int sayi, max=-1;

        System.out.print("Sayı gir :");
        sayi = inp.nextInt();

        while (sayi>0) {

            if (sayi>max) {
                max = sayi;
            }

            System.out.print("Sayı gir : ");
            sayi = inp.nextInt();
        }

        System.out.println(max);


    }
}
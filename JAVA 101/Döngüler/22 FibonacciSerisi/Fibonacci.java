import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();

        int i = 1, j = 1;
        System.out.print("0 "+i + " " + j + " ");
        while (n > 3) {
            int toplam = i + j;
            System.out.print(toplam + " ");
            i = j;
            j = toplam;
            n--;
        }



    }
}

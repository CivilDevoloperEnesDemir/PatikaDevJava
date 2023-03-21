import java.sql.SQLOutput;
import java.util.Scanner;
public class project {
    public static void main (String[] args) {
        Scanner inp = new Scanner (System.in);

        int N,total=0;

        System.out.print("Bir sayı giriniz :\t");
        N = inp.nextInt();

        for(int i=1;i<N;i++) {
            if(N % i==0) {
                total = total + i;
            }
        }

        if(total==N) {
            System.out.print("Mükemmel sayı !");
        }else
            System.out.print("Mükemmel sayı değil !");

    }
}

import java.util.Scanner;
public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        int N;
        System.out.print("Sayı giriniz : ");
        N = inp.nextInt();

        while (N>0) {

            if (N % 2 == 1) {
                N = 3*N +1;
            } else {
                N = N/2;
            }

            System.out.println(N);
            if (N == 1) {
                break;
            }

        }

    }
}

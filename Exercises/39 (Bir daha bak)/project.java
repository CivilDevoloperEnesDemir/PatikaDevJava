import java.util.Scanner;
public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        int n,bolen=2;
        System.out.print("Bir sayı giriniz :");
        n = inp.nextInt();

        while (n>0) {
            if (n % bolen == 0) {
                n = n/bolen;
                System.out.print(bolen + " ");
            }else
                bolen++;

        }

    }
}

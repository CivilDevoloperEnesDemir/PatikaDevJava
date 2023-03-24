import java.util.Scanner;
public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        double n;
        double pozitif=0,negatif=0,pi;

        System.out.print("n değerini giriniz :");
        n = inp.nextDouble();

        for(int i=1;i<=n;i = i+4) {

            pozitif = pozitif+1.0/i;

        }

        for(int i=3;i<=n;i = i+4) {

            negatif = negatif-1.0/i;

        }

        pi=4.0*(pozitif+negatif);
        System.out.println("Pi : "+pi);

    }
}

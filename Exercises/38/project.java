import java.util.Scanner;
public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        int n,nFake,i;

        System.out.print("Bir sayı giriniz :");
        n = inp.nextInt();
        nFake = n;
        while(nFake>0) {

            i = (nFake%2);

            nFake = nFake/2;
            System.out.print(i);
        }

    }
}

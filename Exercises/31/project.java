import java.util.Scanner;
public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        int N, carpim=1;

        System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz : ");
        N = inp.nextInt();

        for(int i=1;i<=N;i++) {
            carpim = carpim*i;
        }

        System.out.println(N+" faktöriyel : "+ carpim);

    }
}

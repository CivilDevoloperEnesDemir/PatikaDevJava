import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        int n;
        double total=0;

        System.out.print("Bir değer giriniz :");
        n = inp.nextInt();

        for(int i=1;i<=n && n>0;i++) {

            total = total + 1.0/i;
        }

        System.out.print("Toplam= "+total);










    }
}

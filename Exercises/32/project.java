import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int m,n;
        double carpim1 =1, carpim2=1, carpim3=1, sonuc=0.0;

        System.out.print("m değerini giriniz : ");
        m = inp.nextInt();
        System.out.print("n değerini giriniz : ");
        n = inp.nextInt();

        for (int i=1;i<=m;i++) {
            carpim1 = carpim1 * i;
        }

        for (int i=1;i<=n;i++) {
            carpim2 = carpim2 * i;
        }

        for (int i=1;i<=(m-n);i++) {
            carpim3 = carpim3 * i;
        }

        sonuc = carpim1 / (carpim2*carpim3);

        System.out.println("Sonuç : "+sonuc);



    }
}

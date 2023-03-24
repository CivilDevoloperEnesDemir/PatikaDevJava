import java.util.Scanner;
public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        int m,n,buyukSayi,kucukSayi,carpim=1;

        System.out.print("m sayısını giriniz :");
        m = inp.nextInt();
        System.out.print("n sayısını giriniz :");
        n = inp.nextInt();

        if (m>n) {
            buyukSayi = m;
            kucukSayi = n;
        } else {
            kucukSayi = m;
            buyukSayi = n;
        }

        for (int i = kucukSayi;i > 0; i--) {

            if(kucukSayi % i == 0 && buyukSayi % i == 0) {
                kucukSayi = kucukSayi/i;
                buyukSayi = buyukSayi/i;
                carpim = carpim*i;

            }

        }

        System.out.println("EBOB : "+carpim);



    }
}

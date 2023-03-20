import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        double n,a=1,b=2,carpim,toplam=0;
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextDouble();

        for(int i=1;i<=n;i++) {
            carpim=1/(a*b);
            toplam=toplam+carpim;
            a=b;
            b=b+1;
        }

        System.out.println("Toplam : "+toplam);



    }
}

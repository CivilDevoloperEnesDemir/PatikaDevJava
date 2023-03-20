import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        double n,toplam=0,carpim;

        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        for(int i=1;i<=n;i++){
            // carpim = i*i;
            // toplam = toplam + carpim; (Şeklindede yapılabilirdi.)
            toplam=toplam+(i*i);
        }
        System.out.print("Toplam : "+toplam);
    }
}

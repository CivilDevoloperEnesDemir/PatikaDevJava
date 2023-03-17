import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int h,r;
        final double pi = 3.14;


        System.out.print("Silindirin taban yarıçapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Silindirin yüksekliğini giriniz : ");
        h = inp.nextInt();

        if(r>0 && h>0){
          double hacim;
          hacim=(pi*r*r*h) / 2;
            System.out.println("Hacim : "+hacim);
        }else
            System.out.println("Hatalı veri girişi yaptınız.");
    }
}

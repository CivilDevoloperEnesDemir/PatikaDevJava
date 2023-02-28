import java.sql.SQLOutput;
import java.util.Scanner;
public class UcgenKenarlarindanAlanCevre {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        /* Üç Kenar Uzunluğunu Kullanıcıdan Aldığınız Üçgenin Alanını Hesaplayan Program */

        double kenar1,kenar2,kenar3,cevre,u,alan;
        System.out.print("1.Kenar'ın Uzunluğunu Giriniz:");
        kenar1=in.nextDouble();

        System.out.print("2.Kenar'ın Uzunluğunu Giriniz:");
        kenar2=in.nextDouble();

        System.out.print("3.Kenar'ın Uzunluğunu Giriniz:");
        kenar3=in.nextDouble();

        /* Üçgenin Çevresi=2u
           U=(a+b+c)/2
           Alan*Alan=u*(u-a)*(u-b)*(u-c)
         */
        cevre=kenar1+kenar2+kenar3;
        u=cevre/2;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.print("Üçgenin Alanı:"+alan);





    }
}


import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        /* Formula Kilo (kg) / Boy(m) * Boy(m) */
        double kilo,boy,index;

        System.out.print("Kilonuzu Giriniz (Kg)\t:");
        kilo=inp.nextDouble();
        System.out.print("Boyunuzu giriniz (m)\t:");
        boy=inp.nextDouble();

        index=kilo/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz\t:"+index);

    }
}

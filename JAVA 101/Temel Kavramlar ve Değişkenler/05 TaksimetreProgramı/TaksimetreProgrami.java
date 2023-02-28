import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int acilisucreti=10;
        double toplam,tutar,Km,Kmbasi=2.20;

        System.out.print("Gidilen Mesafeyi Kilometre cinsinden giriniz: ");
        Km=inp.nextDouble();

        tutar=acilisucreti+Km*Kmbasi;

        toplam= tutar>20 ? tutar : 20;

        System.out.println("Taksimetre Ücreti:"+toplam);
    }
}

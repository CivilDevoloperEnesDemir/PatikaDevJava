import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int hafta;
        double yeniKilo, kilo;

        System.out.print("Kilonuzu giriniz : ");
        kilo = inp.nextDouble();
        System.out.print("Hafta sayısını giriniz : ");
        hafta = inp.nextInt();
        yeniKilo = kilo;
        for(int i=1;i<=hafta;i++) {
            yeniKilo = kilo - kilo*0.10;
            kilo = yeniKilo;
        }

        System.out.println("Kilonuz : "+yeniKilo);



    }
}

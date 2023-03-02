import java.sql.SQLOutput;
import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);
        int HavaSicakligi;

        System.out.print("Hava sıcaklığını giriniz:");
        HavaSicakligi=inp.nextInt();

        if(HavaSicakligi<5){
            System.out.print("Kayak Yapabilirsiniz.");

        }else if (HavaSicakligi>=5 && HavaSicakligi<15) {
            System.out.print("Sinemaya Gidebilirsiniz.");

        }else if (HavaSicakligi>=15 && HavaSicakligi<25){
            System.out.print("Pikniğe Gidebilirsiniz.");

        }else if (HavaSicakligi>=25){
            System.out.print("Yüzmeye Gidebilirsiniz.");
        }


    }
}

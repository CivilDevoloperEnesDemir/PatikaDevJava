import java.util.Scanner;
public class java {
    public static void main(String[] args){

        Scanner inp=new Scanner (System.in);

        int yolcu,kapasite=50;

        System.out.print("Yolcu sayısını giriniz :");
        yolcu=inp.nextInt();

        if(yolcu<kapasite){
            System.out.print((kapasite-yolcu)+" yolcu için yer var.");

        } else if (yolcu==kapasite) {
            System.out.print("Otobüs doldu.");

        }else
            System.out.print("Otobüs aşırı dolu! Lütfen bir sonraki otobüsü bekleyin.");


    }
}

import java.util.Scanner;
public class project4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String birBas="",onBas="",yuzBas="";
        int number,birler,onlar,yuzler,okunus;
        System.out.print("0-1000 arasında bir sayı giriniz : ");
        number = inp.nextInt();

        if (number<1000 && 0<number){
            yuzler = (number/100) % 10;
            onlar = (number/10) % 10;
            birler = number % 10;

            if (yuzler == 1) {
                yuzBas = "yüz";
            } else if (yuzler == 2) {
                yuzBas = "ikiyüz";
            } else if (yuzler == 3) {
                yuzBas = "üçyüz";
            } else if (yuzler == 4) {
                yuzBas = "dörtyüz";
            } else if (yuzler == 5) {
                yuzBas = "beşyüz";
            } else if (yuzler == 6) {
                yuzBas = "altıyüz";
            } else if (yuzler == 7) {
                yuzBas = "yediyüz";
            } else if (yuzler == 8) {
                yuzBas = "sekizyüz";
            } else if (yuzler == 9) {
                yuzBas = "dokuzyüz";
            }

            if(onlar==1){
                onBas="on";
            } else if (onlar==2) {
                onBas="yirmi";
            } else if (onlar==3) {
                onBas="otuz";
            } else if (onlar==4) {
                onBas="kırk";
            } else if (onlar==5) {
                onBas="elli";
            } else if (onlar==6) {
                onBas="altmış";
            } else if (onlar==7) {
                onBas="yetmiş";
            } else if (onlar==8) {
                onBas="seksen";
            } else if (onlar==9) {
                onBas="doksan";
            }

            if(birler==1){
                birBas="bir";
            } else if (birler==2) {
                birBas="iki";
            } else if (birler==3) {
                birBas="üç";
            } else if (birler==4) {
                birBas="dört";
            } else if (birler==5) {
                birBas="beş";
            } else if (birler==6) {
                birBas="altı";
            } else if (birler==7) {
                birBas="yedi";
            } else if (birler==8) {
                birBas="sekiz";
            } else if (birler==9) {
                birBas="dokuz";
            }

            System.out.println(yuzBas+""+onBas+""+birBas);

        }else {
            System.out.print("Hatalı veri girişi !");
        }





    }
}

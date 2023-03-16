import java.util.Scanner;
public class project {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int number,birler,onlar,yuzler;


        System.out.print("0-999 arasında bir sayı giriniz : ");
        number = inp.nextInt();

        if(number<=999 && number>=0) {


            birler = number % 10;
            onlar = (number / 10) % 10;
            yuzler = (number / 100) % 10;

            if (yuzler != 0) {
                System.out.println("Sayı üç basamaklıdır.");
            } else if (onlar != 0) {
                System.out.println("Sayı iki basamaklıdır.");
            } else if (birler != 0) {
                System.out.println("Sayı bir basamaklıdır.");
            }

            System.out.println("Birler Basamağı\t: " + birler + "\nOnlar Basamağı\t: " + onlar + "\nYuzler Basamağı\t: " + yuzler);

        }else
            System.out.println("Hatalı veri girişi !");

    }
}

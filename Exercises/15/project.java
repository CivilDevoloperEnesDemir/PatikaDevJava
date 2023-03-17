import java.util.Scanner;
public class project {
    public static void main(String[] args){

        Scanner inp = new Scanner (System.in);

        int number,birler,onlar;

        System.out.print("0-99 arasında bir sayı giriniz : ");
        number = inp.nextInt();

        birler = number % 10;
        onlar = (number / 10) % 10;

        if(number>0 && number<100) {
            if (onlar == 1) {
                System.out.print("X");
            }
            if (onlar == 2) {
                System.out.print("XX");
            }
            if (onlar == 3) {
                System.out.print("XXX");
            }
            if (onlar == 4) {
                System.out.print("XL");
            }
            if (onlar == 5) {
                System.out.print("L");
            }
            if (onlar == 6) {
                System.out.print("LX");
            }
            if (onlar == 7) {
                System.out.print("LXX");
            }
            if (onlar == 8) {
                System.out.print("LXXX");
            }
            if (onlar == 9) {
                System.out.print("XC");
            }

            if (birler == 1) {
                System.out.print("I");
            }
            if (birler == 2) {
                System.out.print("II");
            }
            if (birler == 3) {
                System.out.print("III");
            }
            if (birler == 4) {
                System.out.print("IV");
            }
            if (birler == 5) {
                System.out.print("V");
            }
            if (birler == 6) {
                System.out.print("VI");
            }
            if (birler == 7) {
                System.out.print("VII");
            }
            if (birler == 8) {
                System.out.print("VIII");
            }
            if (birler == 9) {
                System.out.print("IX");
            }

        } else System.out.println("0-99 arasında bir sayı giriniz !");



    }
}

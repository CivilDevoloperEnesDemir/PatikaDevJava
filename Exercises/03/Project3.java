// 0 ile 1000 arasında bir tamsayıyı okuyan ve bu tam
// sayının rakamları toplamını ekranda gösteren prog-
// ramı yazınız.

import java.util.Scanner;
public class Project3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number,birler,onlar,yuzler,total;
        System.out.print("0-1000 arasında bir tam sayı giriniz : ");
        number = inp.nextInt();

        if(number<1000 && number>0) {
            birler = number % 10;
            yuzler = number / 100;

            onlar = number / 10;
            if (onlar <= 9) {

            } else {
                onlar = onlar % 10;
            }
            total = birler + onlar + yuzler;
            System.out.println("Rakamlar Toplamı : " + total);
        }else
            System.out.print("Hatalı veri girişi !");
    }
}

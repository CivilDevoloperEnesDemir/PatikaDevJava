import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int[] dizi = new int[5];


        int number = rand.nextInt(100);  // 0-100 arasında sayı türettik.
        System.out.println(number);

        int right = 5;  // Kullanıcıya 5 hak tanımladım.
        int selected;   // Kullanıcının seçeceği sayı
        boolean isWin=false;
        boolean hak=false;

        while(right > 0){

            System.out.print("[Tahmininiz] : ");
            selected = inp.nextInt();

            if(selected<0 || selected>100){
                System.out.println("0-100 arasında bir değer giriniz !");
                if(hak){
                    System.out.println("Bir dahaki sefer hakkınızdan düşülecektir.");
                    right--;

                }
                hak=true;
                System.out.println("Kalan hakkınız :"+right);
                continue;
            }

            if(selected == number) {
                isWin=true;
                break;  // Kullanıcı doğru tahmin ettiyse döngüden çıksın.
            }
            else{
                right--;
                if(selected>number){
                    System.out.println(selected+" sayısı gizemli sayıdan büyüktür.");
                }else{
                    System.out.println(selected+" sayısı gizemli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız :"+right);
                dizi[right]=selected;

            }


        }
        if(isWin){
            System.out.println("Tebrikler doğru tahmin !");
        }else{
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz :"+ Arrays.toString(dizi));
        }




    }
}

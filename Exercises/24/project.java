import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int sayi,max=-1;

        do {
            System.out.print("Bir sayı giriniz : ");
            sayi = inp.nextInt();
            if (sayi > max) {
                max = sayi;
            }

        } while(sayi > 0);


            System.out.println("En büyük sayı =" + max);

    }
}

import java.util.Scanner;
public class MainFor {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        /*

        Java ile klavyeden girilen N tane sayma sayısından
        en büyük ve en küçük sayıları bulan ve bu sayıları
        ekrana yazan programı yazın.

        */

        int n,sayi,min,max;

        System.out.print("Kaç sayı girileceğini giriniz : ");
        n=inp.nextInt();

        min=Integer.MIN_VALUE;          // -2147483648
        max=Integer.MAX_VALUE;          //  2147483647

        for(int i=1;i<=n;i++){

            System.out.print(i+".sayıyı giriniz : ");
            sayi=inp.nextInt();

            if(sayi>min){
                min=sayi;
            }
            if(sayi<max){
                max=sayi;
            }


        }

        System.out.println("Maksimum Değer: "+min);
        System.out.println("Minimum Değer : "+max);


    }
}


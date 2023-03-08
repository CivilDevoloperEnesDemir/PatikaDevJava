import java.util.Scanner;
public class patika {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sayi,k=0;
        System.out.print("Bir sayı giriniz : ");
        sayi=input.nextInt();
        // i ve k 0 için
        for(int i=0;i<sayi;i+=2){
            System.out.print(i+",");
        }
        System.out.println("\n");
        while(k<sayi){
            System.out.print(k+",");
            k+=2;
        }

        // i ve k =1 için

        System.out.println("");
        k=1;
        for(int i=1;i<sayi;i++){
            if(i%2==0){
                System.out.print(i+",");
            }
        }
        System.out.println("");
        while(k<sayi){
            k++;
            if(k%2==0){
                System.out.print(k+",");
            }
        }



    }
}

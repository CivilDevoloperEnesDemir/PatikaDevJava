import java.util.Scanner;
public class ForExample {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        /*

            Java döngüler ile girilen sayıya kadar olan
            2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

         */

        int k;
        System.out.print("Sınır sayısını giriniz :");
        k=input.nextInt();

        for(int i=1;i<=k;i*=2){

            System.out.println(i);


        }




    }
}

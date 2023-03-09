import java.util.Scanner;
public class WhileExample {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        /*

            Java döngüler ile girilen sayıya kadar olan
            2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

         */

        int k,i=1;
        System.out.print("Sınır sayısını giriniz :");
        k=input.nextInt();

      while(i<=k){
          System.out.println(i);
          i=i*2;
      }




    }
}

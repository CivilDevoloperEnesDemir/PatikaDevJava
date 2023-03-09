import java.util.Scanner;
public class ForExample {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int limit;

        /*
            Java döngüler ile 1'den girilen sayıya kadar olan
            4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        */

        System.out.print("Sınır sayısını giriniz :");
        limit=inp.nextInt();

        for(int i=1,j=1;i<=limit && j<=limit;i=i*4,j=j*5){
            System.out.println(i+"<--4'ün katları  5'in katları-->"+j);
        }







    }
}

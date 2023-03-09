import java.util.Scanner;
public class  WhileExample {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int limit;

        /*
            Java döngüler ile 1'den girilen sayıya kadar olan
            4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        */

        System.out.print("Sınır sayısını giriniz :");
        limit=inp.nextInt();
        int i=1,j=1;

        while(i<=limit && j<=limit){
            System.out.println(i+"<--4'ün katları  5'in katları-->"+j);
            i=i*4;
            j=j*5;
        }








    }
}

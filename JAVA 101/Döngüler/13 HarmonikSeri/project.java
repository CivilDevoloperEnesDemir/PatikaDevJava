import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        // Java ile girilen sayının harmonik serisini bulan program yazacağız.


        double number,total=0;
        System.out.print("Bir sayı giriniz :");
        number=inp.nextDouble();

        for(int i=1;i<=number;i++){

            total=total+(1.0/i);

        }
        System.out.print("Harmonik Seri Toplamı:"+total);
    }

}

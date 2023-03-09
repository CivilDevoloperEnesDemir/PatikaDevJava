import java.util.Scanner;
public class ForExample {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int value,total=1;

        // Java ile faktöriyel hesaplayan program yazıyoruz.

        System.out.print("Sınır değerini giriniz:\t");
        value=inp.nextInt();

        for(int i=1;i<=value;i++){
            total*=i;
            System.out.println(i+".faktöriyel:\t"+total);
        }

    }

}

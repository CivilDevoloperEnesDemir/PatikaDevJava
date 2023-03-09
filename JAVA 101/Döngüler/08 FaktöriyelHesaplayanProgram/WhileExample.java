import java.util.Scanner;
public class WhileExample {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        // Java ile faktöriyel hesaplayan program yazıyoruz.

        int i=1,total=1,value;

        System.out.print("Sınır değer giriniz:");
        value=inp.nextInt();

        while(i<=value){
            total=total*i;
            System.out.println(i+".Faktöriyel:\t"+total);
            i++;
        }

    }
}

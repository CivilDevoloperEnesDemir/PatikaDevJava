import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int base,pow,multiply=1;
        System.out.print("Taban değerini giriniz :");
        base = inp.nextInt();
        System.out.print("Üs değerini giriniz :");
        pow = inp.nextInt();

        for (int i=1;i<=pow;i++){
            multiply = multiply*base;
        }

        System.out.println(base+" ussu "+pow+" : "+multiply);
    }
}

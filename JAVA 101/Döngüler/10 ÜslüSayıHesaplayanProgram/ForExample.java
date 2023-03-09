import java.util.Scanner;
public class ForExample {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        double n,k,total=1;

        // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        System.out.print("Sayı:");
        n=inp.nextDouble();

        System.out.print("Sayı Üssü:");
        k=inp.nextDouble();

        for(int i=1;i<=k;i++){
            total=total*n;
            System.out.println("i="+i+" için "+n+" üzeri "+i+" eşittir "+total);
        }

    }
}

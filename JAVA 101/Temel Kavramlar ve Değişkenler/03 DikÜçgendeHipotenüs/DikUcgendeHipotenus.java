import java.util.Scanner;
public class DikUcgendeHipotenus {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        /*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan
        ve hipotenüsü hesaplayan programı yazınız."*/

        double kenar1,kenar2,Hipotenus;

        System.out.print("1.Kenarın Uzunluğunu giriniz:");
        kenar1=inp.nextDouble();

        System.out.print("2.Kenarın Uzunluğunu giriniz:");
        kenar2=inp.nextDouble();

        Hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs'ün Uzunluğu:"+Hipotenus);

    }

}

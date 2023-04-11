import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double total=0;
        int n;
        System.out.print("Dizinin boyutunu girin : ");
        n = inp.nextInt();

        int [] list = new int[n];

        for(int i = 0; i< list.length; i++){
            System.out.print("Dizinin "+i+".indexini giriniz : ");
            list[i]=inp.nextInt();
            total=total+1.0/list[i];
        }
        total= list.length/total;
        System.out.println("Harmonik Ortalama : "+total);

    }
}

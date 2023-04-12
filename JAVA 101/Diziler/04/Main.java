import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int[] list = {-5,-15,-10,5,15,10,20,30,25};
        int n;

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        for(int i= list.length-1;i>0;i--){
            if(n >= list[i]){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[i]);
                break;
            }
        }

        for (int j : list) {
            if (n <= j) {
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + j);
                break;
            }
        }

    }
}

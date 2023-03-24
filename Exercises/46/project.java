import java.util.Scanner;
public class project {
    public static void main(String[] args) {

        int satir;
        int sutun;

        Scanner inp = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz : ");
        satir = inp.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        sutun = inp.nextInt();

        for(int i=1;i<=satir;i++){
            for(int j=1;j<=sutun;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

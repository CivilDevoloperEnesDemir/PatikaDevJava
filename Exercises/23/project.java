import java.util.Map;
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int r=1,h;
        double hacim=1;
        boolean isError = true;


        while(isError) {
            System.out.print("Yarıçapı giriniz : ");
            r = inp.nextInt();
            if (r < 0) {
                System.out.print("Pozitif yarıçap girmeniz gerekiyor !\n");
                continue;
            }
            break;
        }

        while(isError) {
            System.out.print("Yüksekliği giriniz : ");
            h = inp.nextInt();
            if (h < 0) {
                System.out.print("Pozitif yükseklik girmeniz gerekiyor !\n");
                    continue;
                }
            hacim = (Math.PI*r*r*h) / 3;
            break;

            }




        System.out.println("Hacim :"+hacim);
    }
}

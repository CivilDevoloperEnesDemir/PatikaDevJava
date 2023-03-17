import java.util.Scanner;
public class project {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int change,k1,k2,k3,k4,k5;

        System.out.print("Para üstünü giriniz : ");
        change = inp.nextInt();

        k1 = change / 50;
        k2 = (change-k1*50) / 25;
        k3 = (change - k1*50 - k2*25) / 10;
        k4 = (change - k1*50 - k2*25 - k3*10) / 5;
        k5 = (change - k1*50 - k2*25 - k3*10 -k4*5);

        System.out.println("50 Krş\t:"+k1+"\n25 Krş\t:"+k2+"\n10 Krş\t:"+k3+"\n5 Krş\t:"+k4+"\n1 Krş\t:"+k5);

    }
}

import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int num1,num2,num3,num4,max,firstMax;

        max = Integer.MIN_VALUE;
        firstMax = Integer.MAX_VALUE;

        System.out.print("1.Sayıyı giriniz : ");
        num1 = inp.nextInt();

        System.out.print("2.Sayıyı giriniz : ");
        num2 = inp.nextInt();

        System.out.print("3.Sayıyı giriniz : ");
        num3 = inp.nextInt();

        System.out.print("4.Sayıyı giriniz : ");
        num4 = inp.nextInt();

        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

        System.out.println("En büyük sayı : "+max);

        if (num1 < firstMax) {
            firstMax = num1;
        }
        if (num2 < firstMax) {
            firstMax = num2;
        }
        if (num3 < firstMax) {
            firstMax = num3;
        }
        if (num4 < firstMax) {
            firstMax = num4;
        }

        System.out.println("En küçük sayı : "+firstMax);

    }
}

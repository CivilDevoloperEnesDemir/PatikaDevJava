import java.util.Scanner;
public class Project {
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);

        System.out.print("Sayı Giriniz:");

        int number = inp.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber=tempNumber/10;
            basNumber++;
            System.out.println(tempNumber);

        }

        System.out.print("Basamak Sayısı="+basNumber+"\n");

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            System.out.print(basValue+",");
            for(int i = 1;i <= basNumber; i++) {
                basPow=basPow*basValue;

            }

            result = result + basPow;
            tempNumber = tempNumber / 10;

        }

        System.out.println("\n\n"+result);





    }
}

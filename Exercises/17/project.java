import java.util.Scanner;

public class project {
    public static void main(String[] args) {

        Scanner inp = new Scanner (System.in);

        int studentGrade,studentNum,total=0;
        double average;
        System.out.print("Öğrenci sayısını giriniz :");
        studentNum = inp.nextInt();

        for(int i=1;i<=studentNum;i++) {
            System.out.print(i+". öğrencinin notu :");
            studentGrade = inp.nextInt();
            total = total + studentGrade;
        }

        average = total / studentNum;

        System.out.println("Öğrencilerin not ortalaması :"+average);

    }
}

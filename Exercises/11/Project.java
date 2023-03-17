import java.util.Scanner;
public class Project {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int stu1,stu2,stu3,stu4;
        double ort;


        System.out.print("1.Öğrencinin Notu : ");
        stu1 = inp.nextInt();
        System.out.print("2.Öğrencinin Notu : ");
        stu2 = inp.nextInt();
        System.out.print("3.Öğrencinin Notu : ");
        stu3 = inp.nextInt();
        System.out.print("4.Öğrencinin Notu : ");
        stu4 = inp.nextInt();

        ort = (stu1+stu2+stu3+stu4) / 4.0;
        System.out.println("Ortalama : "+ort);

        if (stu1>ort){
            System.out.println("1.Öğrenci geçti.");
        }else
            System.out.println("1.Öğrenci kaldı.");
        if (stu2>ort){
            System.out.println("2.Öğrenci geçti.");
        }else
            System.out.println("2.Öğrenci kaldı.");
        if (stu3>ort){
            System.out.println("3.Öğrenci geçti.");
        }else
            System.out.println("3.Öğrenci kaldı.");
        if (stu4>ort){
            System.out.println("4.Öğrenci geçti.");
        }else
            System.out.println("4.Öğrenci kaldı.");



    }
}

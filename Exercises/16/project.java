import java.util.Scanner;
public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);
        int day;
        System.out.print("what day of the week is today : ");
        day = inp.nextInt();

        switch (day) {
            case 1:
                System.out.println("Pazartesi\nMonday");
                break;
            case 2:
                System.out.println("Salı\nTuesday");
                break;
            case 3:
                System.out.println("Çarşamba\nWednesday");
                break;
            case 4:
                System.out.println("Perşembe\nThursday");
                break;
            case 5:
                System.out.println("Cuma\nFriday");
                break;
            case 6:
                System.out.println("Cumartesi\nSaturday");
                break;
            case 7:
                System.out.println("Pazar\nSunday");
                break;
            default:
                System.out.println("Only Enter between 1 and 7");
        }


    }
}
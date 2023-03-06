import java.util.Scanner;
public class java {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String data="";
        System.out.print("Bir metin karakteri giriniz :");
        data=inp.nextLine();

        if(data.equals("a") || data.equals("e") || data.equals("i") || data.equals("o") || data.equals("u")){
            System.out.print(data+" sesli bir harftir.");

        }else
            System.out.print(data+" sessiz bir harftir.");




    }
}

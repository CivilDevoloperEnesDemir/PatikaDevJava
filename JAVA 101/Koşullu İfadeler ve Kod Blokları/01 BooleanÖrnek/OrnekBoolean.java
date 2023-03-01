public class OrnekBoolean {
    public static void main(String[] args){
        int a=5,b=10,c=15;
        boolean kosul1=a>b;
        boolean kosul2=b>c;
        boolean kosul3=c>a;

        System.out.println(kosul1 && kosul2 && kosul3);
        System.out.println(kosul1 || kosul2 || kosul3);


    }
}

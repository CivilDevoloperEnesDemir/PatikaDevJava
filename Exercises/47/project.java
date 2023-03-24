public class project {
    public static void main (String[] args) {

        int satir=4;
        int sutun=5;

        for (int i=1;i<=satir;i++) {
            for(int j=1;j<=sutun;j++) {
                if(i==1 || i==satir || j==1 || j==sutun) {
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }

            System.out.println();
        }

    }
}

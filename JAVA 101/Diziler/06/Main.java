public class Main {
    public static void main(String[] args){

        String [][] matris = new String[7][4];

        for(int i=0;i<7;i++){
            for(int j=0;j<4;j++){
                if(i==0 || i==6 || i==3 || j==0 || j==3) {
                    matris[i][j] = "*";
                }else
                    matris[i][j] = " ";
            }
        }

        for(int i=0;i<7;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

    }
}

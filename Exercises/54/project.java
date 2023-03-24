public class project {
    public static void main(String[] args){



        for ( int i = 1 ; i <= 5 ; i++ ) {

            for ( int k = 1 ; k<=i ; k++) {

                if((i+k)%2==0){
                    System.out.print(1+" ");
                }else
                    System.out.print(0+" ");

            }
            System.out.println();


        }



    }
}

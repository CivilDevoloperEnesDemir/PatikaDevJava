public class project {

    public static int f(int n) {
        if (n==1 || n==2) {
            return 1;
        }
        return f(n-2)+f(n-1);
    }
    public static void main(String[] args) {

        for(int i=1;i<=10;i++) {
            System.out.print(f(i)+" ");
        }
    }
}

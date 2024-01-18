public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int temp=fact(n-1)*n;
        return temp;
    }
    public static void main(String[] args) {
        System.out.print(fact(5));
    }
}

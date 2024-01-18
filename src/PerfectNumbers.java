public class PerfectNumbers {
    public static void perfectNumber(int n){
        for(int i=1;i*i<=n;i++){
            System.out.print((i*i)+" ");
        }
    }
    public static void main(String[] args) {
        perfectNumber(121);
    }
}

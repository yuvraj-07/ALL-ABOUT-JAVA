public class sumofalldigit {
    public static void main(String[] args) {
        int n = 981;
        int sum=0;

        while(n!=0) {
            int rem = n%10;
            sum = rem + sum;
            n = n/10;


        }
        System.out.println(sum);
    }
}

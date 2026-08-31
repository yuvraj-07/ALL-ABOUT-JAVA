public class sumofnnumbers {
    public static void main(String[] args) {
        System.out.println(SumOfNnumebrs(1,2,3,4,5,6));
    }

    static double SumOfNnumebrs(double... numbers) {
        double sum=0;
        for(double number:numbers) {
            sum+=number;
        }

        return sum;

    }
}

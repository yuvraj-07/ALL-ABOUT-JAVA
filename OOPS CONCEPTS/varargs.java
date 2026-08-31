public class varargs {
    public static void main(String[] args) {
        
        //varargs = allow a amehtod to accept a varying # of arguments makes methods more lexible, no need for overloaded method java will pack the arguments into a array
        //...(ellipsis)
        
        System.out.println(average(1,2,3,4));
    }

    static double average(double... numbers) {
        double sum = 0;

        for (double number: numbers) {
            sum+=number;
        }

        return sum/numbers.length;
    }
}

public class SwapNumber {
    public static void main(String[] args) {
        int a = 25;
        int b = 30;
        // using third variable

        // int temp = a;
        // a = b;
        // b = temp;

        // With out third Variable
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // without third Variabsle and operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}

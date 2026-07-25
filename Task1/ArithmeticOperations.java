public class ArithmeticOperations {

    public static void add(int a, int b) {
        int add = a + b;
        System.out.println("Addition: " + add);
    }


    public static void sub(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction: " + sub);
    }

    public static void mul(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication: " + mul);
    }


    public static void div(int a, int b) {
        float div = (float) a / b;
        System.out.println("Division: " + div);
    }




    public static void main(String[] args) {
        int a = 50;
        int b = 10;

        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
    }
}

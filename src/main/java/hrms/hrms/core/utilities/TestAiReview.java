public class TestAiReview {

    // This method has poor validation and logging
    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println("Adding numbers: " + a + b); // incorrect string concatenation
        return sum;
    }

    // No handling for divide-by-zero
    public static int divide(int a, int b) {
        return a / b;
    }

    // Unused method
    public static String formatMessage(String msg) {        
        return "Message: " + msg;
    }

    public static void main(String[] args) {
        int result1 = add(5, 10);  
        System.out.println("Result: " + result1);

        int result2 = divide(10, 0); // will throw ArithmeticException
        System.out.println("Div Result: " + result2);
    }
}

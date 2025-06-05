import java.util.Random;

class HandleError {
    HandleError() {
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Random r = new Random();

        for(int i = 0; i < 10; ++i) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 100 / (b / c);
            } catch (ArithmeticException var7) {
                System.out.println("Division by zero.");
                a = 0;
            }

            System.out.println("a: " + a);
        }

    }
}

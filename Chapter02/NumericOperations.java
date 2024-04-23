package Chapter02;

public class NumericOperations {

    public static void main(String[] args) {
        
        multiplyIntAndLong();
        // sumFloatAndDouble();
        multiplyShortAndShort();

        multiplyAndDivideShortFloatAndDouble();

    }

    private static void multiplyIntAndLong() {
        // x * y
        int x = 1;
        long y = 33;
        var z = x * y; // long
        System.out.println(z);
    }

    private static void sumFloatAndDouble() {
               // x + y
               double x = 39.21;
               float y = 2.1; // não compila porque para ser float precisa ter o f no final. 2.1f. Dessa forma, ele é um double.
               var z = x + y;
    }
    
    private static void multiplyShortAndShort() {
        short x = 10;
        short y = 3;
        var z = x * y; // z é int por causa da operação aritmética que transforma todos os valores em int
    }
    
    private static void multiplyAndDivideShortFloatAndDouble() {
        short w = 14;
        float x = 13;
        double y = 30;
        var z = w * x / y; // vira o "maior número", ou seja, o double
    }
}

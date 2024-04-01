package strings;

public class InitializingVars {
    public static void main(String[] args) {
        final int x = 10;
        int y = 20;
        x = y + 10; // não compila pois o valor nao pode ser modificado

        final int[] myNumbers = new int[10];
        myNumbers[0] = 10;
        myNumbers[1] = 20;
        myNumbers = null; // não compila porque muda o valor da referência myNumbers, que é uma referência
                          // final

    }
}
package packageoperators;
public class OperatorsOperations {
public static void main(String[] args) {
    // getIsAnimalAsleep();
    // flipBitwise();

}

private static void flipBitwise() {
    int value = 3; // armazenado como 0011
    int complement = ~value; // armazenado como 1100
    System.out.println(value); // 3
    System.out.println(complement); //-4

    // para encontrar o complemento de um número, multiplicar o número por -1 e depois subtrair 1 
    System.out.println(-1*value-1);
    System.out.println(-1*complement-1);
}

private static void getIsAnimalAsleep() {
    boolean isAnimalAsleep = false;
    System.out.println(isAnimalAsleep);
    isAnimalAsleep = !isAnimalAsleep;
    System.out.println(isAnimalAsleep);
}
}

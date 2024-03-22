public class Zoo {
    public static void main(String[] args) {
        System.out.println("Hello World"); // java Zoo
	    System.out.println(args[0]); // java Zoo "Sao paulo"
	    System.out.println(args[1]); // java Zoo "Sao paulo" Coelho

        /* Se chamar o args[1] e não passar nenhum parametro, o programa executa até a linha do args[1] e dá erro:
         * $ java Zoo "Sao paulo"
            Hello World
            Sao paulo
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
            at Zoo.main(Zoo.java:5)
         */
    }
    
}
